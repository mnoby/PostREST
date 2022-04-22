package games;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;

interface GamesRepository extends JpaRepository<Games, String> {
}