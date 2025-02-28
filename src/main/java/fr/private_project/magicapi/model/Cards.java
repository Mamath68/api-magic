package fr.private_project.magicapi.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Cards {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    @Column
    private String nom;

    @ManyToMany
    @JoinTable(
            name = "cards_characters",
            joinColumns = @JoinColumn(name = "cards_id"),
            inverseJoinColumns = @JoinColumn(name = "characters_id")
    )
    private List<Characters> charactersList;

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

    public List<Characters> getCharactersList() {
        return charactersList;
    }

    public void setCharactersList(List<Characters> charactersList) {
        this.charactersList = charactersList;
    }
}
