package fakkar.projetcinema.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Projection {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Date dateProjection;
    private double prix;
    @ManyToOne
    private Film film;
    @ManyToOne

    private Salle salle;
    @OneToMany(mappedBy = "projection")

     private List<Ticket> tickets= new ArrayList<>();
    @ManyToOne
    private Seance seance;
}
