package fr.private_project.magicapi.controller;

import fr.private_project.magicapi.model.Cards;
import fr.private_project.magicapi.model.Characters;
import fr.private_project.magicapi.repository.CardsRepository;
import fr.private_project.magicapi.repository.CharactersRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/character")
public class CharacterController {
    private final CharactersRepository db_characters;
    private final CardsRepository db_cards;

    public CharacterController(CharactersRepository db_characters, CardsRepository db_cards) {
        this.db_characters = db_characters;
        this.db_cards = db_cards;
    }

    @GetMapping
    public List<Characters> getCards() {
        return this.db_characters.findAll();
    }

    @PostMapping
    public Characters addCards(@RequestBody Characters characters) {
        return this.db_characters.save(characters);
    }

    @PutMapping("/{id}/cards/{cardId}")
    public ResponseEntity<Characters> assignCardToCharacters(@PathVariable Long id, @PathVariable Long cardId) {
        try {
            Characters hero = db_characters.findById(id).orElseThrow(() -> new RuntimeException("Characters not found not found"));
            Cards cards = db_cards.findById(cardId).orElseThrow(() -> new RuntimeException("Cards not found"));

            List<Cards> cardsList = hero.getCardsList();
            cardsList.add(cards);
            hero.setCardsList(cardsList);

            Characters updatedHero = db_characters.save(hero);
            return new ResponseEntity<>(updatedHero, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
