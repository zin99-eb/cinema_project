package fakkar.projetcinema.controllers;

import fakkar.projetcinema.entities.Film;
import fakkar.projetcinema.entities.Ticket;
import fakkar.projetcinema.services.impl.FilmService;
import fakkar.projetcinema.services.impl.TicketService;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class TicketController {
    private TicketService ticketService;
    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }
    @RequestMapping("reserveTicket")
    public String reserveTicket(){return "reserveTicket";}
    @RequestMapping("saveTicket")
    public String saveTicket(@ModelAttribute("ticketVue") Ticket ticketController){
        Ticket saveTicket = ticketService.saveTicket(ticketController);
        return "reserveTicket";

    }

    @RequestMapping("/ticketsList")
    public String TicketsList(ModelMap modelMap){
        List<Ticket> TicketController  = ticketService.getAllTickets();
        modelMap.addAttribute( "ticketVue", TicketController);
        return "TicketsList";
    }
    @RequestMapping("deleteTicket")
    public String deleteTicket(@RequestParam("id") Long id, ModelMap  modelMap){
        ticketService.deleteTicketById(id);
        return TicketsList(modelMap);
    }

}

