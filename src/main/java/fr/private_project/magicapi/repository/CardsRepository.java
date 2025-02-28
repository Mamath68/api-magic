package fr.private_project.magicapi.repository;

import fr.private_project.magicapi.model.Cards;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardsRepository extends JpaRepository<Cards, Long> {
}
