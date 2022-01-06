package com.moisessilva10.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.moisessilva10.cursomc.domain.Categoria;

@Repository
public interface  CategoriaRepository extends JpaRepository<Categoria, Integer> {
	

}
