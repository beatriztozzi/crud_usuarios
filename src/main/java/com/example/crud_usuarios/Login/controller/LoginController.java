package com.example.crud_usuarios.Login.controller;

import com.example.crud_usuarios.Login.model.LoginModel;
import com.example.crud_usuarios.Login.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    private LoginService service;

    @PostMapping("/login")
    public ResponseEntity<LoginModel> login(@RequestBody LoginModel usuario){
        if(service.login(usuario)){
            return ResponseEntity.ok(usuario);
        } else {
            return ResponseEntity.badRequest().build();
        }
    }
}
