package br.com.apidaniel.danielpontes.usuario.service;

import br.com.apidaniel.danielpontes.DanielpontesApplication;
import br.com.apidaniel.danielpontes.usuario.model.Usuario;
import br.com.apidaniel.danielpontes.usuario.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UsuarioService {

    private final UsuarioRepository repository;

    public Usuario save(Usuario usuario) {
        return repository.save(usuario);
    }

}
