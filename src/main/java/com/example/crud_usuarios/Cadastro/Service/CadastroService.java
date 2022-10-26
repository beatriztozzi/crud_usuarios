package com.example.crud_usuarios.Cadastro.Service;

import com.example.crud_usuarios.Usuarios.model.User;
import com.example.crud_usuarios.Usuarios.repository.UsuarioRepositorio;
import com.example.crud_usuarios.Usuarios.service.UsuarioService;
import com.example.crud_usuarios.Util.Util;
import com.example.crud_usuarios.mfa.multiFactor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.example.crud_usuarios.mfa.multiFactor.generateSecretKey;
@Service
public class CadastroService {
    @Autowired
    UsuarioService usuarioService = new UsuarioService();

    public User cadastrar(User usuario) {
        if (!checkIfEmailExists(usuario.getEmail())){
            throw new RuntimeException("Email já cadastrado");
        }
        usuario.setSecretKey(generateSecretKey());
        usuario.setPassword(Util.hash_sha256(usuario.getPassword()));
        usuarioService.addUsuario(usuario);
        return usuario;
    }

    public String getMfaQRCode(String email){
        User usuario = usuarioService.getUsuarioByEmail(email);
        return multiFactor.getMfaQRCode(usuario.getUsername(), usuario.getSecretKey());
    }

    public boolean checkIfEmailExists(String email){
        return usuarioService.getUsuarioByEmail(email) != null;
    }
}
