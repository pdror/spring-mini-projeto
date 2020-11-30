package org.edu.academic.controller;

import org.edu.academic.model.Aluno;
import org.edu.academic.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoService alunoService;

    // GET endpoints

    @ApiOperation(value = "Busca por todos os alunos matriculados")
    @GetMapping()
    public Iterable<Aluno> getAlunos() {
        return this.alunoService.getAlunos();
    }

    @ApiOperation(value = "Busca um(a) aluno(a) pela 'matrícula'")
    @GetMapping("/{matricula}")
    public Aluno getAlunoByMatricula(@PathVariable String matricula) {
        return this.alunoService.getByMatricula(matricula);
    }

    // POST endpoints

    @ApiOperation(value = "Insere um(a) aluno(a) no Banco de Dados")
    @PostMapping
    public Aluno postAluno(@RequestBody Aluno aluno) throws Exception {
        return this.alunoService.postAluno(aluno);
    }

    // PUT endpoints

    @ApiOperation(value = "Atualiza os dados de um(a) aluno(a) no Banco de Dados")
    @PutMapping("/{matricula}")
    public Aluno putAluno(@PathVariable String matricula, @RequestBody Aluno aluno) throws Exception {
        return this.alunoService.putAluno(matricula, aluno);
    }

    // DELETE endpoints

    @ApiOperation(value = "Deleta um aluno do Banco de Dados")
    @DeleteMapping("/{matricula}")
    public void deleteAluno(@PathVariable String matricula) {
        this.alunoService.deleteAluno(matricula);
    }

}
