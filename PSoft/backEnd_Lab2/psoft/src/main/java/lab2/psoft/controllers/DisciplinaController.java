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

//	@PutMapping("/disciplinas/nome/{id}")
//	public ResponseEntity<Disciplina> setNomeDisciplina(@PathVariable("id") long id, @RequestBody Disciplina disciplina) {
//		Optional<Disciplina> disciplinaSearched = disciplinaServices.getDisciplina(id);
//		if (disciplinaSearched.isPresent()) {
//			return new ResponseEntity<Disciplina>(disciplinaServices.setNome(disciplina, id), HttpStatus.OK);
//		}
//		return new ResponseEntity(HttpStatus.NOT_FOUND);
//	}

	@PutMapping("/disciplinas/nota/{id}")
	public ResponseEntity<Disciplina> setNotaDisciplina(@PathVariable("id") long id, @RequestBody Disciplina disciplina) {
		Optional<Disciplina> disciplinaSearched = disciplinaServices.getDisciplina(id);
		if (disciplinaSearched.isPresent()) {
			return new ResponseEntity<Disciplina>(disciplinaServices.setNota(disciplina, id), HttpStatus.OK);
		}
		return new ResponseEntity(HttpStatus.NOT_FOUND);
	}

	@DeleteMapping("/disciplinas/{id}")
	public ResponseEntity<Disciplina> deleteDisciplina(@PathVariable("id") long id) {
		Optional<Disciplina> disciplinaSearched = disciplinaServices.getDisciplina(id);
		if (disciplinaSearched.isPresent()) {
			return new ResponseEntity<Disciplina>(disciplinaServices.deleteDisciplina(id), HttpStatus.OK);
		}
		return new ResponseEntity(HttpStatus.NOT_FOUND);
	}
    
}

