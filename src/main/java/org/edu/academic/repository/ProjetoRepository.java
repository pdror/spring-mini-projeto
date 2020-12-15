package org.edu.academic.repository;

import org.edu.academic.model.Projeto;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProjetoRepository extends MongoRepository<Projeto, String>{
    
}
