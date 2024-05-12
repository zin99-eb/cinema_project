package fakkar.projetcinema.services;

import fakkar.projetcinema.controllers.SeanceController;
import fakkar.projetcinema.entities.Cinema;
import fakkar.projetcinema.entities.Seance;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SeanceService {
    Seance saveSeance(Seance seance);
    Seance updateSeance(Seance seance);
    void deleteSeanceById(Long id);
    void deleteAllSeances();
    Seance getSeanceById(Long id);
    List<Cinema> getAllSeances();
}
