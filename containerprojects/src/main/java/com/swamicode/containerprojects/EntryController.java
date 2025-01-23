package com.swamicode.containerprojects;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class EntryController {

    //function to retun a message to the user
    @GetMapping("/message")
    public String displayMessage(){
        String message = "Welcome to spring boot application";
        return message;
    }
    

    
    
    
}
