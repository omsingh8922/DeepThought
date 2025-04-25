package com.example.routing.controller;

import com.example.routing.model.MoveRequest;
import com.example.routing.model.MoveResponse;
import com.example.routing.service.RoutingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/optimize ")
public class RoutingController {

    @Autowired
    private RoutingService routingService;

    @PostMapping
    public MoveResponse optimize(@RequestBody MoveRequest request) {
        return routingService.optimizeMoves(request);
    }
}
