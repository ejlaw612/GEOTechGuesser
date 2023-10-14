
// Java Program to Illustrate DemoController File 

// Importing package in this code module 
package game.geoGuesser.controller;
// Importing required classes 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

// Annotation 
@Controller
// Main class 
public class GeoController {
    @GetMapping("")
    public String index(){
        return "GeoGuesser/index.html";
    }
}