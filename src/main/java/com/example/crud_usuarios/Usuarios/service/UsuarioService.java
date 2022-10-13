package com.example.crud_usuarios.Usuarios.service;

import com.example.crud_usuarios.Usuarios.model.User;
import com.example.crud_usuarios.Usuarios.repository.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioService {
    @Autowired
    UsuarioRepositorio usuarioRepositorio;

    public List<User> getUsuarios() {
        try {
            return usuarioRepositorio.findAll();
        } catch (Exception e) {
            throw e;
        }
    }

    public User addUsuario(User usuario) {
        return usuarioRepositorio.save(usuario);
    }

    public void deleteUsuario(Long id) {
        try {
            usuarioRepositorio.deleteById(id);
        } catch (Exception e) {
            throw e;
        }
    }

    public User getUsuario(Long id) {
        return usuarioRepositorio.findById(id).orElseThrow();
    }

    public User updateUser(User usuario, Long id) {
        try {
            Optional<User> usuarioOptional = usuarioRepositorio.findById(id);
            if (usuarioOptional.isPresent()) {
                User usuario1 = usuarioOptional.get();
                usuario1.setUsername(usuario.getUsername());
                usuario1.setEmail(usuario.getEmail());
                usuario1.setPassword(usuario.getPassword());
                usuario1.setName(usuario.getName());
                usuario1.setCpf(usuario.getCpf());
                usuario1.setLastname(usuario.getLastname());
                return usuario;
            }
            return null;
        } catch (Exception e) {
            throw e;
        }
    }
}


