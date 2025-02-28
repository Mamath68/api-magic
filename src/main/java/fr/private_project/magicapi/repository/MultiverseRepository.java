package fr.private_project.magicapi.repository;

import fr.private_project.magicapi.model.Multiverse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MultiverseRepository extends JpaRepository<Multiverse, Long> {
}
