package com.intellinegocios.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.intellinegocios.modelo.Usuario;

@Repository
public interface usuarioRepositorio extends JpaRepository<Usuario, String> {

}
