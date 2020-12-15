package org.edu.academic.service;

import java.util.List;

import org.edu.academic.model.Projeto;
import org.edu.academic.repository.ProjetoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjetoServiceImpl implements ProjetoService {

    @Autowired
    private ProjetoRepository projetoRepository;


    @Override
    public List<Projeto> getProjetos() {
        return projetoRepository.findAll();
    }

    @Override
    public Projeto getProjetoById(String id) {
        return this.projetoRepository
            .findById(id)
            .orElseThrow(() -> new IllegalArgumentException("Professor não encontrado"));
    }

    @Override
    public Projeto postProjeto(Projeto projeto) {
        return this.projetoRepository.save(projeto);
    }

    @Override
    public Projeto putProjeto(String id, Projeto projeto) {
        return this.projetoRepository.save(projeto);
    }

    @Override
    public void deleteProjeto(String id) {
        this.projetoRepository.deleteById(id);
    }
    
}
