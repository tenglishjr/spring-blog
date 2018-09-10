package com.blog.blog.controllers;

import com.blog.blog.models.Post;
import com.blog.blog.services.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PostController {

    private final PostService postSvc;

    public PostController(PostService postSvc) {
        this.postSvc = postSvc;
    }

    @GetMapping(path = "/posts")
    private String postIndex(Model model) {
        List<Post> posts = postSvc.all();
        model.addAttribute("posts", posts);
        model.addAttribute("pageTitle", "Posts");
        return "posts/index";
    }

    @GetMapping("/posts/{id}")
    private String showPost(@PathVariable long id, Model model) {
        Post post = postSvc.find(id);
        model.addAttribute("post", post);
        model.addAttribute("pageTitle", post.getTitle());
        return "posts/show";
    }

    @GetMapping("/posts/create")
    private String postCreationForm(Model model) {
        model.addAttribute("post", new Post());
        model.addAttribute("pageTitle", "Create a Post");
        return "posts/create";
    }

    @PostMapping("/posts/save")
    private String createPostWithPost(@ModelAttribute Post post) {
        postSvc.save(post);
        return "redirect:/posts/" + post.getId();
    }

    @GetMapping("/posts/{id}/edit")
    public String editForm(@PathVariable long id, Model model) {
        model.addAttribute("post", postSvc.find(id));
        return "posts/edit";
    }

    @PostMapping("/posts/{id}/edit")
    public String updatePost(@ModelAttribute Post post, @PathVariable long id) {
        postSvc.save(post);
        return "redirect:/posts";
    }

    @GetMapping("/posts/{id}/delete")
    public String deletePost(@ModelAttribute Post post, @PathVariable long id) {
        postSvc.delete(id);
        return "redirect:/posts";
    }
}
