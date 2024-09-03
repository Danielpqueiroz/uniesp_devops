package br.com.apidaniel.danielpontes.usuario.model;


import br.com.apidaniel.danielpontes.enumeration.usuario.Permissao;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data

public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String cpf;
    private String telefone;
    @Enumerated(EnumType.STRING)
    private Permissao permissao;

}
