package fakkar.projetcinema.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Cinema  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private double longitude, latitude, altitude;
    private int nombreSalles;
    @OneToMany(mappedBy = "cinema")
    private List<Salle> salle = new ArrayList<>();
    @ManyToOne
    private Ville ville;
}