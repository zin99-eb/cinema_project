package fakkar.projetcinema.services.impl;

import fakkar.projetcinema.entities.Film;
import fakkar.projetcinema.entities.Ticket;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface TicketService {
   Ticket saveTicket(Ticket ticket);
   Ticket updateTicket(Ticket ticket);
    void deleteTicketById(Long id);
    void deleteAllTickets();
    Ticket getTicketById(Long id);

    List<Ticket> getAllTickets();

}

