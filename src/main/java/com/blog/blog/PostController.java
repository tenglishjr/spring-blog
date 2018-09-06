package com.blog.blog;

import com.blog.blog.classes.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PostController {

    @GetMapping(path = "/posts")
    private String postIndex(Model model) {
        List<Post> posts = new ArrayList<>();
        posts.add(new Post("Xbox One","For sale! On the cheap"));
        posts.add(new Post("Xbox Two","For sale! Pre-release edition"));
        posts.add(new Post("Xbox 360","Will trade for BMW."));
        posts.add(new Post("Xbox Controller","Buttons don't work."));

        model.addAttribute("posts", posts);
        model.addAttribute("pageTitle", "Posts");
        return "posts/index";
    }

    @GetMapping(path = "/posts/{id}")
    private String postById(@PathVariable long id, Model model) {
        Post post = new Post("Xbox One", "For sale!");
        model.addAttribute("post", post);
        model.addAttribute("pageTitle", post.getTitle());
        return "posts/show";
    }

    @GetMapping(path = "/posts/create")
    private String postCreationForm() {
        return "This is the Post Creation page!";
    }

    @PostMapping(path = "/posts")
    private String createPost() {
        return "This is the Post Index page!";
    }

//    private Post findPostById(long id) {
//        Post post =
//    }


}
