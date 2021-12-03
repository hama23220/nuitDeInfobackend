package poly.edu.nuitdeinfo.Entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer _id_u;

    @Column
    private String _nom;

    @Column
    private String _prenom;

}
