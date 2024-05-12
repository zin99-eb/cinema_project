package fakkar.projetcinema.controllers;

import fakkar.projetcinema.entities.Seance;
import fakkar.projetcinema.services.SeanceService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SeanceController {

    private final SeanceService seanceService;

    public SeanceController(SeanceService seanceService) {
        this.seanceService = seanceService;
    }
    @RequestMapping("/createSeance")
    public String createSeance()
    {
        return "CreateFilm";
    }

    SeanceController SeanceController;
    @RequestMapping("saveCinema")
    public String saveSeance(@ModelAttribute("seanceVue") Seance seanceController){
        Seance saveSeance = seanceService.saveSeance(seanceController);
        return "createSeance";
    }

}

