package com.dievi.service;

//import com.dievi.dto.TypeabonneDTO;
import com.dievi.model.Typeabonne;
import com.dievi.repository.TypeabonneRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TypeabonneService {
	
	TypeabonneRepository typeabonneRepository;
	@Autowired
	 public TypeabonneService(TypeabonneRepository typeabonneRepository) {
		this.typeabonneRepository = typeabonneRepository;
	}
	public Typeabonne getByIdtypeabonne(Integer id) {
		// TODO Auto-generated method stub
		Typeabonne response = null;
		Optional<Typeabonne> typeabonne = typeabonneRepository.findById(id);
		
		if(typeabonne.isPresent()) {
			response = typeabonne.get();
		}
		
		return response;
	}
	public Typeabonne save(Typeabonne typeabonne) {
		// TODO Auto-generated method stub
		return typeabonneRepository.save(typeabonne);
	}
	public Typeabonne update(Typeabonne typeabonne) {
		// TODO Auto-generated method stub
		return typeabonneRepository.save(typeabonne);
	}
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		typeabonneRepository.deleteById(id);
		
	}
	
	
	

}
