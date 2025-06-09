package com.example.userdir.controller;

import com.example.userdir.service.UserDirService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/user")
public class UserDirController {

    @Autowired
    private UserDirService userDirService;

    @PostMapping("/home")
    public ResponseEntity<String> createUserDir(@RequestBody String userId) {
        boolean isCreated = userDirService.createUserHome(userId);
        if (isCreated) {
            return ResponseEntity.ok("User directory created at /opt/user/" + userId);
        } else {
            return ResponseEntity.status(500).body("Failed to create user directory");
        }
    }

    @GetMapping("/home")
    public ResponseEntity<String> createUserDirGet(@RequestParam String userId) {
        boolean isCreated = userDirService.createUserHome(userId);
        if (isCreated) {
            return ResponseEntity.ok("User directory created at /opt/user/" + userId);
        } else {
            return ResponseEntity.status(500).body("Failed to create user directory");
        }
    }
}