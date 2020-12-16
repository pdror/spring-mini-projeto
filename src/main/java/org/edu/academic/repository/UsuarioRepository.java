package org.edu.academic.repository;

import org.edu.academic.model.Usuario;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UsuarioRepository extends MongoRepository<Usuario, String> {

	Usuario findByUsername(String username);
    
}
