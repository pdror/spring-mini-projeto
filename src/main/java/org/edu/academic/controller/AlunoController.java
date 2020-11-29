package org.edu.academic.controller;

import org.edu.academic.model.Aluno;
import org.edu.academic.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    // GET endpoints

    @GetMapping()
    public Iterable<Aluno> getAlunos() {
        return this.alunoService.getAlunos();
    }

    @GetMapping("/{matricula}")
    public Aluno getAlunoByMatricula(@PathVariable String matricula) {
        return this.alunoService.getByMatricula(matricula);
    }

    // POST endpoints

    @PostMapping
    public Aluno postAluno(@RequestBody Aluno aluno) throws Exception {
        return this.alunoService.postAluno(aluno);
    }

    // PUT endpoints

    @PutMapping("/{matricula}")
    public Aluno putAluno(@PathVariable String matricula, @RequestBody Aluno aluno) throws Exception {
        return this.alunoService.putAluno(matricula, aluno);
    }

    // DELETE endpoints

    @DeleteMapping("/{matricula}")
    public void deleteAluno(@PathVariable String matricula) {
        this.alunoService.deleteAluno(matricula);
    }

}
