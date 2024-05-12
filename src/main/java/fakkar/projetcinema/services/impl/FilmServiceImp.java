package fakkar.projetcinema.services.impl;

import fakkar.projetcinema.entities.Cinema;
import fakkar.projetcinema.entities.Film;
import fakkar.projetcinema.repositories.FilmRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class FilmServiceImp implements FilmService{
   private FilmRepository filmRepository;
    @Override
    public Film saveFilm(Film film) {
        return filmRepository.save(film);
    }

    @Override
    public Film updateFilm(Film film) {
        return filmRepository.save(film);
    }

    @Override
    public void deleteFilmById(Long id) {
        filmRepository.deleteById(id);

    }

    @Override
    public void deleteAllFilms() {
        filmRepository.deleteAll();

    }

    @Override
    public Film getFilmById(Long id) {

        return filmRepository.findById(id).get();
    }

    @Override
    public List<Film> getAllFilms() {
        return filmRepository.findAll();
    }
}
