package com.blog.blog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {

    @RequestMapping(path = "/add/{firstNum}/and/{secNum}")
    @ResponseBody
    private int add(@PathVariable int firstNum, @PathVariable int secNum) {
        return firstNum + secNum;
    }


    @RequestMapping(path = "/subtract/{firstNum}/from/{secNum}")
    @ResponseBody
    private int subtract(@PathVariable int firstNum, @PathVariable int secNum) {
        return firstNum - secNum;
    }


    @RequestMapping(path = "/multiply/{firstNum}/and/{secNum}")
    @ResponseBody
    private int multiply(@PathVariable int firstNum, @PathVariable int secNum) {
        return firstNum * secNum;
    }


    @RequestMapping(path = "/divide/{firstNum}/by/{secNum}")
    @ResponseBody
    private int divide(@PathVariable int firstNum, @PathVariable int secNum) {
        return firstNum / secNum;
    }



}
