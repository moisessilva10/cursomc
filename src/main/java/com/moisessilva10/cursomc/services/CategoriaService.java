package com.moisessilva10.cursomc.services;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.moisessilva10.cursomc.domain.Categoria;
import com.moisessilva10.cursomc.exceptions.ObjectNotFoundException;
import com.moisessilva10.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
//	public Categoria buscar(Integer id) {
//		
//		Optional<Categoria> obj = repo.findById(id);
//		
//		return obj.orElse(null);
//	}
//	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
		"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName(), null));
		}

}
