package fakkar.projetcinema.controllers;
import fakkar.projetcinema.entities.Film;
import fakkar.projetcinema.services.impl.FilmService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller

public class FilmController {
    private FilmService filmService;

    public FilmController(FilmService filmService) {
        this.filmService = filmService;
    }
    @RequestMapping("/createFilm")
    public String createFilm()
    {
        return "CreateFilm";
    }

    FilmController FilmController;
    @RequestMapping("saveFilm")
    public String saveFilm(@ModelAttribute("filmVue") Film filmController){
        Film saveFilm = filmService.saveFilm(filmController);
        return "createFilm";
    }
    @RequestMapping("filmsList")
    public String filmList(ModelMap modelMap){
        List<Film> filmsController  = filmService.getAllFilms();
        modelMap.addAttribute( "filmsVue", filmsController);
        return "FilmsList";


    }





}



