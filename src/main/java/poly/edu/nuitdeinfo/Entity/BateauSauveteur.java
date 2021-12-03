package poly.edu.nuitdeinfo.Entity;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name = "bateausauveteur")

public class BateauSauveteur {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer _id_bse;

    @Column
    private String  _desc;
}
