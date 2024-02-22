package com.dievi.service;
import com.dievi.dto.AbonneDTO;
import com.dievi.model.Abonne;
import com.dievi.repository.AbonneRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AbonneService {
	
	AbonneRepository abonneRepository;
	@Autowired
	 public AbonneService(AbonneRepository abonneRepository) {
		this.abonneRepository = abonneRepository;
	}
	public Abonne getByIdabonne(Integer id) {
		// TODO Auto-generated method stub
		Abonne response = null;
		Optional<Abonne> abonne = abonneRepository.findById(id);
		
		if(abonne.isPresent()) {
			response = abonne.get();
			System.out.println(abonne.get().getNom());
		}
		
		return response;
	}
	public Abonne save(Abonne abonne) {
		// TODO Auto-generated method stub
		return abonneRepository.save(abonne);
	}
	public Abonne update(Abonne abonne) {
		// TODO Auto-generated method stub
		return abonneRepository.save(abonne);
	}
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		abonneRepository.deleteById(id);
		
	}
	
	
	

}
