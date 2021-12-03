package poly.edu.nuitdeinfo.Entity;

import lombok.Data;
import javax.persistence.*;
import java.util.Date;
@Data
@Entity
@Table(name = "post")
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id_post;

    @Column
    private String _desc;

    @Column
    private Date _date_heure_acc;

    @Column
    private Date _date_heure_post;

    @Column
    private String _localisation;

    @Column
    private String _pays;

    @Column
    private String _region;

}
