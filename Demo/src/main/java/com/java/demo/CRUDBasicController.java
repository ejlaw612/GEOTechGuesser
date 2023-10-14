package com.java.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CRUDBasicController {
    @GetMapping("")
    public String index(){
        return "index.html";
    }
    @GetMapping("/play")
    public String play(){return "play.html";}
}
