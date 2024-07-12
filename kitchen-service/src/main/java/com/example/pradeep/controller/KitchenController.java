package com.example.pradeep.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/kitchen")
public class KitchenController {

    @PostMapping("/order")
    public ResponseEntity<String> addNewOrder(@RequestParam("id") int id) {
        return ResponseEntity.ok("The order has been placed!");
    }
}
