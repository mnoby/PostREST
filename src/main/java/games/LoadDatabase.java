package games;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
class LoadDatabase {

    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(GamesRepository repository) {

        return args -> {
//            log.info("Preloading " + repository.save(new Games("Accel Brawl1", "Accel Brawl", "AccelByte, Inc.", "FPS", "Steam")));
//            log.info("Preloading " + repository.save(new Games("Accel Brawl2", "Accel Brawl2", "AccelByte, Inc.", "FPS", "Steam")));

        };
    }
}