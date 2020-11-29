package org.edu.academic.service;

import java.util.List;

import org.edu.academic.model.Aluno;

public interface AlunoService {
    public List<Aluno> getAlunos();

    public Aluno getByMatricula(String matricula);

    public Aluno postAluno(Aluno aluno);

    public Aluno putAluno(String matricula, Aluno aluno);

    public void deleteAluno(String matricula);
}
