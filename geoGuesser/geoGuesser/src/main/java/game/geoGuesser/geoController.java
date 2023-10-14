
// Java Program to Illustrate DemoController File 

// Importing package in this code module 
package game.geoGuesser;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


// Annotation 
@Controller
// Main class 
public class geoController {
    @GetMapping("")
    public String index(){
        return "GeoGuesser/index.html";
    }
    @GetMapping("/play")
    public String play() {return "GeoGuesser/play.html";}
}
