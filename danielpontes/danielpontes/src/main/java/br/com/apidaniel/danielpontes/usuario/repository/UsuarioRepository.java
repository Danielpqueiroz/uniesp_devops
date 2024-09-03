package br.com.apidaniel.danielpontes.usuario.repository;

import br.com.apidaniel.danielpontes.usuario.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
