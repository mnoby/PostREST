package games;

import org.springframework.data.jpa.repository.JpaRepository;

interface GamesRepository extends JpaRepository<Games, String> {
}