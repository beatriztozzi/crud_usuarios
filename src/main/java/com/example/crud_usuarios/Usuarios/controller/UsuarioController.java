package com.example.crud_usuarios.Usuarios.controller;

import com.example.crud_usuarios.Usuarios.model.User;
import com.example.crud_usuarios.Usuarios.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuarioController {
    @Autowired
    private UsuarioService service;

    @GetMapping("/usuarios")
    public List<User> getUsuarios(){
        return service.getUsuarios();
    }

    @PostMapping("/usuarios")
    public void addUsuario(@RequestBody User usuario){
        service.addUsuario(usuario);
    }

    @DeleteMapping("/usuario_delete/{id}")
    public void deleteUsuario(@PathVariable int id){
        service.deleteUsuario((long) id);
    }

    @PostMapping("/usuarios/{id}")
    public void updateUsuario(@RequestBody User usuario, @PathVariable int id){
        service.updateUser(usuario, (long) id);
    }

    @GetMapping("/usuarios/{id}")
    public User getUsuario(@PathVariable int id){
        return service.getUsuario((long) id);
    }
}
