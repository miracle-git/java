package com.miracle.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberService {
    // private RateLimiter limiter =

    @GetMapping("/get")
    public String get() {
        return "get member";
    }

    @GetMapping("/add")
    public String add() {
        return "add member";
    }
}
