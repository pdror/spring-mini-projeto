package org.edu.academic.service;

import java.util.List;

import org.edu.academic.model.Aluno;
import org.edu.academic.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlunoServiceImpl implements AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    @Override
    public List<Aluno> getAlunos() {
        return this.alunoRepository.findAll();
    }

    @Override
    public Aluno getByMatricula(String matricula) {
        return this.alunoRepository
            .findById(matricula)
            .orElseThrow(() -> new IllegalArgumentException("Aluno não matriculado"));
    }

    @Override
    public Aluno postAluno(Aluno aluno) {
        return this.alunoRepository.save(aluno);
    }

    @Override
    public Aluno putAluno(String matricula, Aluno aluno) {
        return this.alunoRepository.save(aluno);
    }

    @Override
    public void deleteAluno(String matricula) {
        this.alunoRepository
            .deleteById(matricula);
    }
    
}