package games;

import java.util.List;
import java.util.regex.Pattern;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;

@RestController
class GamesController {

    private final GamesRepository repository;

    GamesController(GamesRepository repository) {
        this.repository = repository;
    }

//    @GetMapping("/games")
//    List<Games> all() {
//        return repository.findAll();
//    }


    @PostMapping("/games")
    public ResponseEntity<Games> newG(@Valid @RequestBody  Games newGames){

        if (repository.findById(newGames.getGame_code()).isPresent()) {
            return new ResponseEntity<>(HttpStatus.CONFLICT);
        } else {
            Games g = repository.save(newGames);
            return new ResponseEntity<>(newGames, HttpStatus.CREATED);

        }
    }
}