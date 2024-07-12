package com.example.pradeep.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("/tracker")
public class TrackerController {
    @GetMapping("/status")
    public ResponseEntity<String> getOrderStatus(@RequestParam("id") int orderId) {
        String[] status = { "Ordered", "Baking", "Delivering" };
        Random rand = new Random();

        return ResponseEntity.ok(status[rand.nextInt(status.length)]);
    }
}