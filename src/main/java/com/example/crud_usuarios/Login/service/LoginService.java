package com.example.crud_usuarios.Login.service;

import com.example.crud_usuarios.Login.model.LoginModel;
import com.example.crud_usuarios.Usuarios.controller.UsuarioController;
import com.example.crud_usuarios.Usuarios.model.User;
import com.example.crud_usuarios.Util.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    UsuarioController usuarioController;
    public Boolean login(LoginModel usuario){

        User usuarioBanco = usuarioController.getUsuarioByEmail(usuario.getEmail());

        if (usuarioBanco.getPassword().equals(Util.hash_sha256(usuario.getPassword()))){
            return true;
        } else {
            return false;
        }
    }
}
