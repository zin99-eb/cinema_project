package fakkar.projetcinema.services.impl;

import fakkar.projetcinema.entities.Ticket;
import fakkar.projetcinema.repositories.*;
import lombok.AllArgsConstructor;

import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class TicketServiceImp implements TicketService{

    private TicketRepository ticketRepository;

    @Override
    public Ticket saveTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    @Override
    public Ticket updateTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    @Override
    public void deleteTicketById(Long id) {
        ticketRepository.deleteById(id);

    }

    @Override
    public void deleteAllTickets() {


    }

    @Override
    public Ticket getTicketById(Long id) {
        return ticketRepository.findById(id).get();
    }

    @Override
    public List<Ticket> getAllTickets() {

        return ticketRepository.findAll();
    }

}
