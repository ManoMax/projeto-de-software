package lab2.psoft.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import lab2.psoft.models.Disciplina;
import lab2.psoft.models.DisciplinaDTO;
import lab2.psoft.services.DisciplinaServices;

@RestController
public class DisciplinaController {

    @Autowired
    private DisciplinaServices disciplinaServices;

	public DisciplinaController(DisciplinaServices disciplinaServices) {
		super();
		this.disciplinaServices = disciplinaServices;
	}
	
	@RequestMapping("/disciplinas/{id}")
	public ResponseEntity<Disciplina> getProduto(@PathVariable Long id) {
		Optional<Disciplina> disciplina = disciplinaServices.getDisciplina(id);
		if (disciplina.isPresent())
			return new ResponseEntity<Disciplina>(disciplina.get(), HttpStatus.OK);
		return new ResponseEntity<Disciplina>(HttpStatus.NOT_FOUND);
	}
	@RequestMapping("/disciplinas")
	public ResponseEntity<List<DisciplinaDTO>> getDisciplina() {
		return new ResponseEntity<List<DisciplinaDTO>>(disciplinaServices.getDisciplinas(), HttpStatus.OK);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@PutMapping("/disciplinas/nota/{id}")
	public ResponseEntity<Disciplina> setNotaDisciplina(@PathVariable("id") long id, @RequestBody Disciplina disciplina) {
		Optional<Disciplina> disciplinaSearched = disciplinaServices.getDisciplina(id);
		if (disciplinaSearched.isPresent()) {
			return new ResponseEntity<Disciplina>(disciplinaServices.setNota(disciplina, id), HttpStatus.OK);
		}
		return new ResponseEntity(HttpStatus.NOT_FOUND);
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	@PutMapping("/disciplinas/comentarios/{id}")
	public ResponseEntity<Disciplina> setComentarioDisciplina(@PathVariable("id") long id, @RequestBody Disciplina disciplina) {
		Optional<Disciplina> disciplinaSearched = disciplinaServices.getDisciplina(id);
		if (disciplinaSearched.isPresent()) {
			return new ResponseEntity<Disciplina>(disciplinaServices.setComentario(disciplina, id), HttpStatus.OK);
		}
		return new ResponseEntity(HttpStatus.NOT_FOUND);
	}
    
}

