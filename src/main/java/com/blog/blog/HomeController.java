package com.blog.blog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @RequestMapping(path = "/")
    @ResponseBody
    private String index() {
        return "This is the landing page!";
    }

}
