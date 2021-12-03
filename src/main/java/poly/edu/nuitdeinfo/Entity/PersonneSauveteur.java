package poly.edu.nuitdeinfo.Entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "personnesauvteur")
public class PersonneSauveteur {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer _id_ps;

    @Column
    private String _nom;

    @Column
    private String _prenom;

    @Column
    private int _age;
}
