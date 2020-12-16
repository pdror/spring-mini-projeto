package org.edu.academic.service;

import org.edu.academic.model.Usuario;

public interface UsuarioService {
    public Usuario findByEmailAddress(String email);
}
