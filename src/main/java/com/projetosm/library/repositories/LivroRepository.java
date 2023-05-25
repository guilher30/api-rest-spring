package com.projetosm.library.repositories;



import org.springframework.data.jpa.repository.JpaRepository;

import com.projetosm.library.entities.Livro;

public interface LivroRepository extends JpaRepository<Livro, Long> {
	
	
}
