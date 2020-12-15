package org.edu.academic.controller;

import org.edu.academic.model.Professor;
import org.edu.academic.service.ProfessorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/professores")
public class ProfessorController {
    
    @Autowired
    private ProfessorService professorService;

    // GET endpoints

    @ApiOperation(value = "Busca por todos os professores matriculados")
    @GetMapping()
    public Iterable<Professor> getProfessores() {
        return this.professorService.getProfessores();
    }

    @ApiOperation(value = "Busca um(a) professor(a) pela 'matrícula'")
    @GetMapping("/{matricula}")
    public Professor getProfessorByMatricula(@PathVariable String matricula) {
        return this.professorService.getByMatricula(matricula);
    }

    // POST endpoints

    @ApiOperation(value = "Insere um(a) professor(a) no Banco de Dados")
    @PostMapping
    public Professor postProfessor(@RequestBody Professor professor) throws Exception {
        return this.professorService.postProfessor(professor);
    }

    // PUT endpoints

    @ApiOperation(value = "Atualiza os dados de um(a) professor(a) no Banco de Dados")
    @PutMapping("/{matricula}")
    public Professor putProfessor(@PathVariable String matricula, @RequestBody Professor professor) throws Exception {
        return this.professorService.putProfessor(matricula, professor);
    }

    // DELETE endpoints

    @ApiOperation(value = "Deleta um professor do Banco de Dados")
    @DeleteMapping("/{matricula}")
    public void deleteProfessor(@PathVariable String matricula) {
        this.professorService.deleteProfessor(matricula);
    }
}
