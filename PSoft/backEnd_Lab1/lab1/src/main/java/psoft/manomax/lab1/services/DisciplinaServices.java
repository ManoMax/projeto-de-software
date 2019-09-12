package psoft.manomax.lab1.services;

import org.springframework.stereotype.Service;
import psoft.manomax.lab1.models.Disciplina;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

@Service
public class DisciplinaServices {

    private Integer id = 0;
    private HashMap<Integer, Disciplina> disciplinas = new HashMap<Integer, Disciplina>();

    public Disciplina addDisciplina(String nome, double nota) {
        Disciplina newDisciplina = new Disciplina(nome, nota);
        newDisciplina.setId(id);
        disciplinas.put(id, newDisciplina);
        id++;
        return newDisciplina;
    }

    public Disciplina addDisciplina(Disciplina disciplina) {
        disciplina.setId(this.id);
        this.disciplinas.put(this.id, disciplina);
        id++;
        return this.disciplinas.get(id - 1);
    }

    public HashMap<Integer, Disciplina> getDisciplinas() {
        return this.disciplinas;
    }

    public Disciplina getDisciplina(Integer id) {
        return disciplinas.get(id);
    }

    public Disciplina setNota(Disciplina disciplina, Integer id) {
        return disciplinas.get(id).setNota(disciplina.getNota());
    }

    public Disciplina setNome(Disciplina disciplina, Integer id) {
        return disciplinas.get(id).setNome(disciplina.getNome());
    }

    public void deleteDisciplina(Integer id) {
        this.disciplinas.remove(id);
    }

    public List<Disciplina> getRanking() {
        List<Disciplina> list = new ArrayList<>();
        for(int i = 0; i < this.disciplinas.size() ; i++) {
            list.add(this.disciplinas.get(i));
        }
        Collections.sort(list);
        return list;
    }
}
