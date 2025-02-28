package fr.private_project.magicapi.model;

import jakarta.persistence.*;

@Entity
public class Stories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;


    @Lob
    @Column(columnDefinition = "TEXT")
    private String storie;

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
    public String getStorie() {
        return this.storie;
    }

    /**
     * @param storie String
     */
    public void setStorie(String storie) {
        this.storie = storie;
    }
}
