package br.edu.unidep.spring.inicial.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.unidep.spring.inicial.model.Usuario;


public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	


}
