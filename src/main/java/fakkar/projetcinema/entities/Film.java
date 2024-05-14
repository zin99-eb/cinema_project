package fakkar.projetcinema.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;


import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Film {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String titre;
    private String description;
    private String realisateur;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dateSortie;
    @Temporal(TemporalType.TIME)
    @DateTimeFormat(pattern = "HH:mm:ss")
    private LocalTime duree;
    private String photo;
    @OneToMany(mappedBy = "film")
    private List<Projection> projections=new ArrayList<>();
    public void setCategorie(Categorie categorie,String photoname) {
        this.categorie = categorie;
        this.photo=photoname;
    }

    @ManyToOne
    private Categorie categorie;
}
