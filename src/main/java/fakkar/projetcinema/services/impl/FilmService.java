package fakkar.projetcinema.services.impl;
import fakkar.projetcinema.entities.Film;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface FilmService {
    Film saveFilm(Film film);
    Film updateFilm(Film film);
    void deleteFilmById(Long id);
    void deleteAllFilms();
    Film getFilmById(Long id);
    List<Film> getAllFilms();
}
