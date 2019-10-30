package de.hamcheese.sandwich.controller

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.servlet.view.RedirectView

@RestController
public class RestController {

    @GetMapping("/health")
    public fun getHealth():RedirectView {
        return RedirectView("https://http.cat/200.jpg")
    }

}