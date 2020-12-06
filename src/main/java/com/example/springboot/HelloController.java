package com.example.springboot;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.*;

@RestController
@CrossOrigin(origins = "*")
public class HelloController {
private cobdd conn;

    @PostConstruct
    public void init() {
        this.conn = new cobdd("database.sql");
    }

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping(value = "/login", method=RequestMethod.POST)
    public ResponseEntity<Object> login(@RequestBody Map<String, String> json) {
        return ResponseEntity.ok().body("username:" +json.get("username"));
    }

    @RequestMapping(value = "/register", method=RequestMethod.POST)
    public ResponseEntity<Object> register(@RequestBody Map<String, String> json) {
        this.conn.addUser(json.get("username"), json.get("password"));
        return ResponseEntity.ok().body(json);
    }

    @RequestMapping(value = "/api/test", method=RequestMethod.GET)
    public Response test() {
        return new Response("Hello World!", "test", 1);
    }
}