package poly.edu.nuitdeinfo.Repository;

import org.springframework.data.repository.CrudRepository;
import poly.edu.nuitdeinfo.Entity.Image;

public interface IImage extends CrudRepository<Image,Integer> {
}
