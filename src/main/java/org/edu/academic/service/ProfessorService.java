package org.edu.academic.service;

import java.util.List;

import org.edu.academic.model.Professor;

public interface ProfessorService {
    public List<Professor> getProfessores();

    public Professor getByMatricula(String matricula);

    public Professor postProfessor(Professor professor);

    public Professor putProfessor(String matricula, Professor professor);

    public void deleteProfessor(String matricula);    
}
