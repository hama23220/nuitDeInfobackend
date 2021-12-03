package poly.edu.nuitdeinfo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import poly.edu.nuitdeinfo.Entity.Post;
import poly.edu.nuitdeinfo.Repository.IPost;

import java.util.Optional;


@Service
public class PostService {

    @Autowired
    private IPost iPost;

    public Optional<Post> getPostByid(final Integer id){return iPost.findById(id);
    }

    public Iterable<Post> getAllPost (){
        return iPost.findAll();
    }

    public void deletePost (final Integer id){
        iPost.deleteById(id);
    }

    public Post savePost (Post post){
        iPost.save(post);
        return post;
    }

    public void update (Post post, Integer id){
        iPost.save(post);
    }

}
