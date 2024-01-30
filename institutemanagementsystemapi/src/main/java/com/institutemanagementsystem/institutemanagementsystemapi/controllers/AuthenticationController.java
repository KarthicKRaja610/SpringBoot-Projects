package com.institutemanagementsystem.institutemanagementsystemapi.controllers;

import com.institutemanagementsystem.institutemanagementsystemapi.models.AuthenticationRequest;
import com.institutemanagementsystem.institutemanagementsystemapi.models.AuthenticationResponse;
import com.institutemanagementsystem.institutemanagementsystemapi.models.RegisterRequest;
import com.institutemanagementsystem.institutemanagementsystemapi.services.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {

    @Autowired
    private AuthenticationService service;
    @PostMapping("register")
    public ResponseEntity<AuthenticationResponse> register(@RequestBody RegisterRequest request){
        return ResponseEntity.ok(service.register(request));
    }

    @GetMapping("demo")
    public ResponseEntity demoCheck(){
        return ResponseEntity.ok("Without toekn is working");
    }

    @PostMapping("authenticate")
    public ResponseEntity<AuthenticationResponse> authenticate(@RequestBody AuthenticationRequest request){
        return ResponseEntity.ok(service.authenticate(request));
    }
}
