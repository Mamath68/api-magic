package fr.private_project.magicapi.repository;

import fr.private_project.magicapi.model.Stories;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoriesRepository extends JpaRepository<Stories, Long> {
}
