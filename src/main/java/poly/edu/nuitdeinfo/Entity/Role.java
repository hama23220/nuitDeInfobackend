package poly.edu.nuitdeinfo.Entity;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name = "role")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer _id_role;

    @Column
    private String _desc;

}
