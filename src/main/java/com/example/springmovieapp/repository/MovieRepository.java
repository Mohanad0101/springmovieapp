package com.example.springmovieapp.repository;

import com.example.springmovieapp.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Репозиторий Spring Data JPA для сущности {@link Movie}.
 */
public interface MovieRepository extends JpaRepository<Movie, Long> {

    /** Производный запрос: фильмы по жанру. */
    List<Movie> findByGenre(String genre);
}
