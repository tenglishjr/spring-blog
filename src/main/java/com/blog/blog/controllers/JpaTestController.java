package com.blog.blog.controllers;

import com.blog.blog.models.Post;
import com.blog.blog.repositories.PostRepository;
import com.blog.blog.services.PostService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class JpaTestController {

    PostService postService;

    public JpaTestController(PostService postService) {
        this.postService = postService;
    }

//    @GetMapping("/jpa/find")
//    @ResponseBody
//    public String jpaFindTest() {
//        return postDao.findOne(1L).toString();
//    }
//
    @GetMapping("/jpa/findall")
    @ResponseBody
    public String jpaFindAllTest() {
        List<Post> posts = postService.all();
        String output = "";
        for (Post post : posts) {
            output += post.toString() + "<br />";
        }
        return output;
    }
//
//    @GetMapping("/jpa/create")
//    @ResponseBody
//    public String jpaCreateTest() {
//        Post post = new Post ("New Post", "This is a newly created post! ");
//        postDao.save(post);
//        return jpaFindAllTest();
//    }
//
//    @GetMapping("/jpa/update")
//    @ResponseBody
//    public String jpaUpdateTest() {
//        Post post = new Post ("Update Post", "This is the recently updated post!", 4);
//        postDao.save(post);
//        return jpaFindAllTest();
//    }
//
//    @GetMapping("/jpa/delete")
//    @ResponseBody
//    public String jpaDeleteTest() {
//        postDao.delete(4L);
//        return jpaFindAllTest();
//    }
//
//    @GetMapping("/jpa/search")
//    @ResponseBody
//    public String jpaSearchTest() {
//
//        List<Post> posts = postDao.findByTitleContainingOrBodyContaining("another", "another");
//        String output = "";
//        for (Post post : posts) {
//            output += post.toString() + "<br />";
//        }
//        return output;
//    }
//
//    @GetMapping("/jpa/custom")
//    @ResponseBody
//    public String jpaCustomTest() {
//
//        List<Post> posts = postDao.findCustom();
//
//        String output = "";
//        for (Post post : posts) {
//            output += post.toString() + "<br />";
//        }
//        return output;
//    }

}
