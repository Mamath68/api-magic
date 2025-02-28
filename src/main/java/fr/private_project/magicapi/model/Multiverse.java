package fr.private_project.magicapi.model;

import jakarta.persistence.*;

@Entity
public class Multiverse {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    @Column
    private String nom;

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
}
