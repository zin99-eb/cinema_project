package fakkar.projetcinema.services.impl;

import fakkar.projetcinema.controllers.SeanceController;
import fakkar.projetcinema.entities.Cinema;
import fakkar.projetcinema.entities.Seance;
import fakkar.projetcinema.repositories.CinemaRepository;
import fakkar.projetcinema.repositories.SeanceRepository;
import fakkar.projetcinema.services.SeanceService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class SeanceServiceImpl implements SeanceService {
    private SeanceRepository seanceRepository;
    @Override
    public Seance saveSeance(Seance seance) {
        return null;
    }

    @Override
    public Seance updateSeance(Seance seance) {
        return null;
    }

    @Override
    public void deleteSeanceById(Long id) {

    }

    @Override
    public void deleteAllSeances() {

    }

    @Override
    public Seance getSeanceById(Long id) {
        return null;
    }

    @Override
    public List<Cinema> getAllSeances() {
        return null;
    }




}
