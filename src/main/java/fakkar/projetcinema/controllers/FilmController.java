package fakkar.projetcinema.controllers;
import fakkar.projetcinema.entities.Film;
import fakkar.projetcinema.entities.Ticket;
import fakkar.projetcinema.services.impl.FilmService;
import fakkar.projetcinema.services.impl.TicketService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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
    @RequestMapping("deleteFilm")
    public String deleteFilm(@RequestParam("id") Long id, ModelMap  modelMap){
        filmService.deleteFilmById(id);
        return filmList(modelMap);
    }
    @RequestMapping("editFilm")
    public String editFilm(@RequestParam("id") long id, ModelMap modelMap){
        Film filmController = filmService.getFilmById(id);
        modelMap.addAttribute("filmView", filmController);
        return "EditFilm";

    }
    @RequestMapping("updateFilm")
    public String updateFilm(@ModelAttribute("filmView") Film filmController){
        filmService.updateFilm(filmController);
        return createFilm();

    }
    // Opening home page
    @GetMapping("/")
    public String home(ModelMap modelMap) {
        List<Film> films = filmService.getAllFilms();
        modelMap.addAttribute("filmsList", films);
        return "index";
    }







}



