package org.edu.academic.service;

import java.util.List;

import org.edu.academic.model.Projeto;

public interface ProjetoService {
    public List<Projeto> getProjetos();
    
    public Projeto getProjetoById(String id);

    public Projeto postProjeto(Projeto projeto);

    public Projeto putProjeto(String id, Projeto projeto);

    public void deleteProjeto(String id);
}
