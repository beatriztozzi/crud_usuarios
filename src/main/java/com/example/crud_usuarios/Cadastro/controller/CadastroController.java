package com.example.crud_usuarios.Cadastro.controller;

import com.example.crud_usuarios.Cadastro.Service.CadastroService;
import com.example.crud_usuarios.Usuarios.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CadastroController {
    @Autowired
    CadastroService cadastroService = new CadastroService();

    @PostMapping("/cadastro")
    public User cadastrar(@RequestBody User usuario){
        return cadastroService.cadastrar(usuario);
    }

    @PostMapping("/mfa")
    public String mfa(@RequestBody String email){
        return cadastroService.getMfaQRCode(email);
    }
}
