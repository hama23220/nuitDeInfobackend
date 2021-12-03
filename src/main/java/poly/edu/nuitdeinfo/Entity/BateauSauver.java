package poly.edu.nuitdeinfo.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "bateausauver")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BateauSauver {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer _id_bs;

    @Column
    private String _desc_bs;
}
