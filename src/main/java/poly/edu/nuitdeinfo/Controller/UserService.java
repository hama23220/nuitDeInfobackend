package poly.edu.nuitdeinfo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import poly.edu.nuitdeinfo.Entity.Post;
import poly.edu.nuitdeinfo.Entity.User;
import poly.edu.nuitdeinfo.Service.PostService;

import java.util.Optional;

@RestController
@RequestMapping("/User")
public class UserService {
    @Autowired
    private UserService userService;

    @GetMapping("/all")
    private Iterable<User> getAllUser()
    {
        return userService.getAllUser();
    }

    @GetMapping("/find/{id}")
    private Optional<User> getUserByid(@PathVariable("id") int id)
    {
        return userService.getUserByid(id);
    }

    @PostMapping("/add")
    private User saveUser(@RequestBody User user)
    {
        userService.saveUser(user);
        return user;
    }

    @DeleteMapping("/delete/{id}")
    private void deleteUser(@PathVariable("id") Integer id){
        userService.deleteUser(id);
    }
}
