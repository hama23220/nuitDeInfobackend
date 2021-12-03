package poly.edu.nuitdeinfo.Repository;

import org.springframework.data.repository.CrudRepository;
import poly.edu.nuitdeinfo.Entity.User;

public interface IUser extends CrudRepository<User,Integer > {
}
