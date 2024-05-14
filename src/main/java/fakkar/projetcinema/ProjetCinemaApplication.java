package fakkar.projetcinema;

import fakkar.projetcinema.entities.Film;
import fakkar.projetcinema.entities.Salle;
import fakkar.projetcinema.entities.Ticket;
import fakkar.projetcinema.services.impl.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

@SpringBootApplication
public class ProjetCinemaApplication  {



    public static void main(String[] args) {

        SpringApplication.run(ProjetCinemaApplication.class, args);
    }



}
