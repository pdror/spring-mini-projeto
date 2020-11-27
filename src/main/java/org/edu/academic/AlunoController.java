package org.edu.academic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/alunos")
public class AlunoController {
    private List<Aluno> alunosList = new ArrayList<>();
    
    public AlunoController() {
        alunosList.addAll(List.of(
            new Aluno("Letícia Novaes", "Matemática"),
            new Aluno("Patrícia Novaes", "Computação"),
            new Aluno("Rita Lee Jones", "Artes Cênicas"),
            new Aluno("Roosevelt Ribeiro", "Arte e Mídia")
        )); 
    }

    @GetMapping()
    public Iterable<Aluno> getAlunos() {
        return alunosList;
    }

    @PostMapping()
    public Aluno postAluno(@RequestBody Aluno aluno) {
        alunosList.add(aluno);
        return aluno;
    }
}
