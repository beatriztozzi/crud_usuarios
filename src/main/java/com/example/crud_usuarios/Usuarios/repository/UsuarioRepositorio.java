package com.example.crud_usuarios.Usuarios.repository;


import com.example.crud_usuarios.Usuarios.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepositorio extends JpaRepository<User, Long> {

}
