package org.edu.academic;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Aluno {
    private String matricula;
    private String nome;
    private String curso;

    public Aluno(String nome, String curso) {
        this(UUID.randomUUID().toString(), nome, curso);
    }
}