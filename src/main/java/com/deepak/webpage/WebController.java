package com.deepak.webpage;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.time.LocalDateTime;
import java.util.Random;

@RestController
public class WebController {
    private final Random random = new Random();

    @GetMapping("/api/time")
    public String getCurrentTime() {
        return LocalDateTime.now().toString();
    }

    @GetMapping("/api/ip")
    public String getIpAddress() {
        try {
            return InetAddress.getLocalHost().getHostAddress();
        } catch (Exception e) {
            return "Error retrieving IP address";
        }
    }

    @GetMapping("/api/toss")
    public String tossCoin() {
        return random.nextBoolean() ? "Heads" : "Tails";
    }
}

