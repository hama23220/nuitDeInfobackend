package poly.edu.nuitdeinfo.Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import poly.edu.nuitdeinfo.Entity.Post;
import poly.edu.nuitdeinfo.Service.PostService;

import java.util.Optional;

@RestController
@RequestMapping("/Post")
public class PostController {
    @Autowired
    private PostService postService;

    @GetMapping("/all")
    private Iterable<Post> getAllPost()
    {
        return postService.getAllPost();
    }

    @GetMapping("/find/{id}")
    private Optional<Post> getPostByid(@PathVariable("id") int id)
    {
        return postService.getPostByid(id);
    }

    @PostMapping("/add")
    private Post savePost(@RequestBody Post post)
    {
        postService.savePost(post);
        return post;
    }

    @DeleteMapping("/delete/{id}")
    private void deletePost(@PathVariable("id") Integer id){
        postService.deletePost(id);
    }
}
