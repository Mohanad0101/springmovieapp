package com.example.springmovieapp.config;

import com.example.springmovieapp.model.Movie;
import com.example.springmovieapp.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Загружает примеры фильмов при первом запуске (удобно для проверки API в браузере).
 */
@Component
@RequiredArgsConstructor
public class MovieDataLoader implements CommandLineRunner {

    private final MovieRepository repository;

    @Override
    public void run(String... args) {
        if (repository.count() == 0) {
            repository.save(new Movie(null, "Матрица", "Sci-Fi", 1999));
            repository.save(new Movie(null, "Начало", "Sci-Fi", 2010));
            repository.save(new Movie(null, "Король Лев", "Animation", 1994));
        }
    }
}
