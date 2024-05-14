package fakkar.projetcinema.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Salle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private int nombrePlace;
    @ManyToOne
    private Cinema cinema;
    @OneToMany(mappedBy = "salle")

    private Collection<Place> places;
    @OneToMany(mappedBy = "salle")
    private List<Projection> projections=new ArrayList<>();
}
