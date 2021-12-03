package poly.edu.nuitdeinfo.Entity;

import lombok.Data;

import javax.persistence.*;
@Data
@Entity
@Table(name = "video")
public class Video {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer _id_video;

    @Column
    private String _desc_video;

}
