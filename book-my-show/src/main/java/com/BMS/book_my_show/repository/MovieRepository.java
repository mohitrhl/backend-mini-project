package com.BMS.book_my_show.repository;

import com.BMS.book_my_show.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie , Long> {
    List<Movie> findByLanguage(String language);

    List<Movie> findByGenre(String genre);

    List<Movie> findByTitleContaining(String title);
}
