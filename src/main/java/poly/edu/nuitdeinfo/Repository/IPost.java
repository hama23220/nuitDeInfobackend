package poly.edu.nuitdeinfo.Repository;

import org.springframework.data.repository.CrudRepository;
import poly.edu.nuitdeinfo.Entity.Post;

public interface IPost extends CrudRepository<Post,Integer> {
}
