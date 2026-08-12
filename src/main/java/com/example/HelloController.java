
package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String hello() {
        return "Welcome back to my Channneeellllll today we will do chicken popcorn ahhhhhhhhaaaaaaaaaaaaaaaaaaaaaaaaa";
    }
}
