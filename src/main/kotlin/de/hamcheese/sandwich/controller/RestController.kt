package de.hamcheese.sandwich.controller

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController
public class RestController {

    @GetMapping("/health")
    public fun getHealth():ResponseEntity<String> {
        return ResponseEntity.ok("OK")
    }

}