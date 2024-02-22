package com.dievi.repository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import com.dievi.model.Abonne;
import java.util.List;

public interface AbonneRepository extends CrudRepository<Abonne, Integer>  {

	Abonne findByIdabonne(Integer code);
	//List<Abonne> findByIdtype(Integer code);
	//List<Abonne> findByIdcabine(Integer code);
}
