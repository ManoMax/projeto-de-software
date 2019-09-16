package lab2.psoft.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import lab2.psoft.models.Disciplina;
import lab2.psoft.services.DisciplinaServices;

import java.util.HashMap;
import java.util.List;

@RestController
public class DisciplinaController {

    @Autowired
    private DisciplinaServices disciplinaServices;

    @GetMapping("/v1/api/disciplinas")
    public ResponseEntity<HashMap<Integer, Disciplina>> listarTodas() {
        return new ResponseEntity<HashMap<Integer, Disciplina>>(disciplinaServices.getDisciplinas(), HttpStatus.OK);
    }

    @GetMapping("/v1/api/disciplinas/{id}")
    public ResponseEntity<Disciplina> getDisciplina(@PathVariable("id") Integer id) {
        if (disciplinaSearch(id) != null)
            return new ResponseEntity<Disciplina>(disciplinaSearch(id), HttpStatus.OK);
        return new ResponseEntity(HttpStatus.NOT_FOUND);
    }

    @GetMapping("/v1/api/disciplinas/ranking")
    public ResponseEntity<List<Disciplina>> getRanking() {
        return new ResponseEntity<List<Disciplina>>(disciplinaServices.getRanking(), HttpStatus.OK);
    }

    @PostMapping("/v1/api/disciplinas")
    public ResponseEntity<Disciplina> addDisciplina(@RequestBody Disciplina disciplina) {
        return new ResponseEntity<Disciplina>(disciplinaServices.addDisciplina(disciplina), HttpStatus.OK);
    }

    @PutMapping("/v1/api/disciplinas/{id}/nome")
    public ResponseEntity<Disciplina> setNomeDisciplina(@PathVariable("id") Integer id, @RequestBody Disciplina disciplina) {
        if (disciplinaSearch(id) != null) {
            return new ResponseEntity<Disciplina>(disciplinaServices.setNome(disciplina, id), HttpStatus.OK);
        }
        return new ResponseEntity(HttpStatus.NOT_FOUND);
    }

    @PutMapping("/v1/api/disciplinas/{id}/nota")
    public ResponseEntity<Disciplina> setNotaDisciplina(@PathVariable("id") Integer id, @RequestBody Disciplina disciplina) {
        if (disciplinaSearch(id) != null) {
            return new ResponseEntity<Disciplina>(disciplinaServices.setNota(disciplina, id), HttpStatus.OK);
        }
        return new ResponseEntity(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/v1/api/disciplinas/{id}")
    public ResponseEntity<Disciplina> deleteDisciplina(@PathVariable("id") Integer id) {
        if (disciplinaSearch(id) != null) {
            Disciplina searchedDisciplina = disciplinaServices.getDisciplina(id);
            disciplinaServices.deleteDisciplina(id);
            return new ResponseEntity<Disciplina>(searchedDisciplina, HttpStatus.OK);
        }
        return new ResponseEntity(HttpStatus.NOT_FOUND);
    }

    private Disciplina disciplinaSearch(Integer id) {
        return this.disciplinaServices.getDisciplina(id);
    }
}

// Requisicao direta pela URL
// Exemplo: localhost:8080/v1/api/disciplinas?nome="Psoft"&nota=10.0
/**@ PostMapping("/v1/api/disciplinas")
 public ResponseEntity<Disciplina> addDisciplina(@PathParam("nome") String nome, @PathParam("nota") double nota) {
 return new ResponseEntity<Disciplina>(disciplinaServices.addDisciplina(nome, nota), HttpStatus.OK);
 }*/