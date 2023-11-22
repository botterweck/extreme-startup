package ie.tcd.scss.startup.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// some change

@RestController
public class QueryResponderController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

    @GetMapping("/query")
    public String query(@RequestParam String q) {
        return processQuery(q);
    }

    public String processQuery(String q) {
        if(q.equals("What is your name?")) {
            return "Goetz";
        } else {
            return "Don't understand.";
        }
    }
}
