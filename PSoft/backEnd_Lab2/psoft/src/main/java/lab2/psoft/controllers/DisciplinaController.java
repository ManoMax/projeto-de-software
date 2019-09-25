package lab2.psoft.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import lab2.psoft.models.Disciplina;
import lab2.psoft.services.DisciplinaServices;


@RestController
public class DisciplinaController {

    @Autowired
    private DisciplinaServices disciplinaServices;

	public DisciplinaController(DisciplinaServices disciplinaServices) {
		super();
		this.disciplinaServices = disciplinaServices;
	}
	
	@PostMapping("/disciplinas")
	public ResponseEntity<Disciplina> addDisciplina(@RequestBody Disciplina disciplina) {
		return new ResponseEntity<Disciplina>(disciplinaServices.addDisciplina(disciplina), HttpStatus.CREATED);
	}
	
	@RequestMapping("/disciplinas/{id}")
	public ResponseEntity<Disciplina> getProduto(@PathVariable Long id) {
		Optional<Disciplina> disciplina = disciplinaServices.getDisciplina(id);
		if (disciplina.isPresent())
			return new ResponseEntity<Disciplina>(disciplina.get(), HttpStatus.OK);
		return new ResponseEntity<Disciplina>(HttpStatus.NOT_FOUND);
	}

	@RequestMapping("/disciplinas")
	public ResponseEntity<List<Disciplina>> getDisciplina() {
		return new ResponseEntity<List<Disciplina>>(disciplinaServices.getDisciplinas(), HttpStatus.OK);
	}



    
}

