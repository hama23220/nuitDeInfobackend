package poly.edu.nuitdeinfo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import poly.edu.nuitdeinfo.Entity.User;
import poly.edu.nuitdeinfo.Repository.IUser;

import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private IUser iUser;

    public Optional<User> getUserByid(final Integer id){return iUser.findById(id);
    }

    public Iterable<User> getAllUser (){
        return iUser.findAll();
    }

    public void deleteUser (final Integer id){
        iUser.deleteById(id);
    }

    public User saveUser (User user){
        iUser.save(user);
        return user;
    }

    public void update (User user, Integer id){
        iUser.save(user);
    }
}
