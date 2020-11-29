package org.edu.academic;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    // GET endpoints

    @GetMapping()
    public Iterable<Aluno> getAlunos() {
        return alunosList;
    }

    @GetMapping("/{matricula}")
    public Optional<Aluno> getAlunoByMatricula(@PathVariable String matricula) {
        for(Aluno a: alunosList) {
            if(a.getMatricula().equals(matricula)) {
                return Optional.of(a);
            }
        }
        return Optional.empty();
    }

    // POST endpoints

    @PostMapping
    public Aluno postAluno(@RequestBody Aluno aluno) throws Exception {
        if (alunosList.contains(aluno)) {
            throw new Exception("Aluno já matriculado");
        }

        alunosList.add(aluno);
        return aluno;
    }

    // PUT endpoints

    @PutMapping("/{matricula}")
    public Aluno putAluno(@PathVariable String matricula, @RequestBody Aluno aluno) throws Exception {
        int alunoIndex = -1;

        for(Aluno a : alunosList) {
            if (a.getMatricula().equals(matricula)) {
                alunoIndex = alunosList.indexOf(a);
                alunosList.set(alunoIndex, aluno);
            }
        }

        return (alunoIndex == -1) ? postAluno(aluno) : aluno;
    }

    // DELETE endpoints

    @DeleteMapping("/{matricula}")
    public void deleteAluno(@PathVariable String matricula) {
        alunosList.removeIf(a -> a.getMatricula().equals(matricula));
    }

}
