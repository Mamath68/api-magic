package fr.private_project.magicapi.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Characters {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    @Column
    private String nom;

    @ManyToMany
    @JoinTable(
            name = "cards_characters",
            joinColumns = @JoinColumn(name = "characters_id"),
            inverseJoinColumns = @JoinColumn(name = "cards_id")
    )
    private List<Cards> cardsList;

    /**
     * @return Long
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @param id Long
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return String
     */
    public String getNom() {
        return this.nom;
    }

    /**
     * @param nom String
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    @JsonIgnore
    public List<Cards> getCardsList() {
        return cardsList;
    }

    public void setCardsList(List<Cards> cardsList) {
        this.cardsList = cardsList;
    }
}
