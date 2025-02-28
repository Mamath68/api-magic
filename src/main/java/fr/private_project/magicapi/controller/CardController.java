package fr.private_project.magicapi.controller;

import fr.private_project.magicapi.model.Cards;
import fr.private_project.magicapi.repository.CardsRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/cards")
public class CardController {
    private final CardsRepository db_cards;

    public CardController(CardsRepository db_cards) {
        this.db_cards = db_cards;
    }

    @GetMapping
    public List<Cards> getCards() {
        return this.db_cards.findAll();
    }

    @PostMapping
    public Cards addCards(@RequestBody Cards cards) {
        return this.db_cards.save(cards);
    }
}
