package org.edu.academic.service;

import java.util.List;

import org.edu.academic.model.Professor;
import org.edu.academic.repository.ProfessorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProfessorServiceImpl implements ProfessorService {

    @Autowired
    private ProfessorRepository professorRepository;

    @Override
    public List<Professor> getProfessores() {
        return professorRepository.findAll();
    }

    @Override
    public Professor getByMatricula(String matricula) {
        return this.professorRepository
        .findById(matricula)
        .orElseThrow(() -> new IllegalArgumentException("Professor não matriculado"));
    }

    @Override
    public Professor postProfessor(Professor professor) {
        return this.professorRepository.save(professor);
    }

    @Override
    public Professor putProfessor(String matricula, Professor professor) {
        professor.setMatricula(matricula);
        return this.professorRepository.save(professor);
    }

    @Override
    public void deleteProfessor(String matricula) {
        this.professorRepository.deleteById(matricula);
    }
    
}
