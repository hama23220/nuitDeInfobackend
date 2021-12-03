package poly.edu.nuitdeinfo.Entity;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name = "image")
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer _id_image;

    @Column
    private String _desc_image;


}
