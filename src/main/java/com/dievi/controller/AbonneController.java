package com.dievi.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.core.userdetails.AuthenticationUserDetailsService;
//import com.dievi.dto.AbonneDTO;
import com.dievi.model.Abonne;
import com.dievi.service.AbonneService;

//import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@Slf4j

@RestController
@RequestMapping("/abonne")
public class AbonneController {
	
	private final AbonneService abonneService;
	@Autowired
	public AbonneController(AbonneService abonneService) {
		this.abonneService = abonneService;
	}
	 @GetMapping(value = "/{id}")
	    public ResponseEntity<Abonne> getById(@PathVariable Integer id) {
	       // Abonne response = abonneService.getByIdabonne(id);
	       // return new ResponseEntity<>(response, HttpStatus.OK);
	       // Abonne ab=new Abonne();
	       // ab.setIdabonne(1);
	       // ab.setNom("jean");
		 Abonne ab = abonneService.getByIdabonne(id);
	        return new ResponseEntity<>(ab, HttpStatus.OK);
	    }
	    
	    @PostMapping
	    public ResponseEntity<Abonne> save(@RequestBody Abonne abonne) {
	        Abonne response = abonneService.save(abonne);
	        return new ResponseEntity<>(response, HttpStatus.CREATED);
	    }
	    
	    @PutMapping(value = "/{id}")
	    public ResponseEntity<Abonne> update(@RequestBody Abonne abonne) {
	        Abonne response = abonneService.update(abonne);
	        return new ResponseEntity<>(response, HttpStatus.OK);
	    }
	    
	    @DeleteMapping(value = "/{id}")
	    public ResponseEntity<Void> delete(@PathVariable Integer id) {
	        abonneService.delete(id);
	        return ResponseEntity.ok().build();
	    }

}
