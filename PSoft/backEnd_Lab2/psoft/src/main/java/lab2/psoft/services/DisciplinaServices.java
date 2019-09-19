package lab2.psoft.services;



import java.util.HashMap;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import lab2.psoft.models.Disciplina;

@Service
public class DisciplinaServices {

    // @Autowired
    // private DisciplinaRespository disciplinaRespository;

    @PostConstruct
    public Disciplina addDisciplina(Disciplina disciplina) {
        return null;
    }


    public HashMap<Integer, Disciplina> getDisciplinas() {
        return null;
    }

    public Disciplina getDisciplina(Integer id) {
        return null;
    }

    public Disciplina setNota(Disciplina disciplina, Integer id) {
        return null;
    }

    public Disciplina setNome(Disciplina disciplina, Integer id) {
        return null;
    }

    public void deleteDisciplina(Integer id) {
        
    }

    public List<Disciplina> getRanking() {
        return null;
    }
}
