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
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.core.userdetails.AuthenticationUserDetailsService;
//import com.dievi.dto.TypeabonneDTO;
import com.dievi.model.Typeabonne;
import com.dievi.service.TypeabonneService;

//import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@RestController
@RequestMapping("/typeabonne")
public class TypeabonneController {
	
	private final TypeabonneService typeabonneService;
	@Autowired
	public TypeabonneController(TypeabonneService typeabonneService) {
		this.typeabonneService = typeabonneService;
	}
	 @GetMapping(value = "/{id}")
	    public ResponseEntity<Typeabonne> getById(@PathVariable Integer id) {
	       // Typeabonne response = typeabonneService.getByIdtypeabonne(id);
	       // return new ResponseEntity<>(response, HttpStatus.OK);
	        Typeabonne ab=new Typeabonne();
	        ab.setIdtype(1);
	        ab.setLibcat("domestique");
	        return new ResponseEntity<>(ab, HttpStatus.OK);
	    }
	    
	    @PostMapping
	    public ResponseEntity<Typeabonne> save(@RequestBody Typeabonne typeabonne) {
	        Typeabonne response = typeabonneService.save(typeabonne);
	        return new ResponseEntity<>(response, HttpStatus.CREATED);
	    }
	    
	    @PutMapping(value = "/{id}")
	    public ResponseEntity<Typeabonne> update(@RequestBody Typeabonne typeabonne) {
	        Typeabonne response = typeabonneService.update(typeabonne);
	        return new ResponseEntity<>(response, HttpStatus.OK);
	    }
	    
	    @DeleteMapping(value = "/{id}")
	    public ResponseEntity<Void> delete(@PathVariable Integer id) {
	        typeabonneService.delete(id);
	        return ResponseEntity.ok().build();
	    }

}

