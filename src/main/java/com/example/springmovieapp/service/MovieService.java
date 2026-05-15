package com.example.springmovieapp.service;

import com.example.springmovieapp.model.Movie;
import com.example.springmovieapp.repository.MovieRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * Слой бизнес-логики для фильмов.
 */
@Service
@RequiredArgsConstructor
public class MovieService {

    private final MovieRepository repo;

    public List<Movie> getAll() {
        return repo.findAll();
    }

    public Optional<Movie> getById(Long id) {
        return repo.findById(id);
    }

    @Transactional
    public Movie save(Movie movie) {
        return repo.save(movie);
    }

    @Transactional
    public void delete(Long id) {
        if (!repo.existsById(id)) {
            throw new RuntimeException("Фильм с id=" + id + " не найден");
        }
        repo.deleteById(id);
    }
}
