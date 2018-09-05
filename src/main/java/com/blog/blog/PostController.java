package com.blog.blog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {

    @RequestMapping(path = "/posts")
    @ResponseBody
    private String postIndex() {
        return "This is the Post Index page!";
    }

    @RequestMapping(path = "/posts/{id}")
    @ResponseBody
    private String postById(@PathVariable int id) {
        return "This is the post with an id of " + id + "!";
    }

    @RequestMapping(path = "/posts/create")
    @ResponseBody
    private String postCreationForm() {
        return "This is the Post Creation page!";
    }

    @RequestMapping(path = "/posts", method = RequestMethod.POST)
    @ResponseBody
    private String createPost() {
        return "This is the Post Index page!";
    }




}
