package com.dievi.repository;

import org.springframework.data.repository.CrudRepository;

import com.dievi.model.Abonne;
import com.dievi.model.Typeabonne;

public interface TypeabonneRepository extends CrudRepository<Typeabonne, Integer>{

	Typeabonne findByIdtype(Integer code);
}
