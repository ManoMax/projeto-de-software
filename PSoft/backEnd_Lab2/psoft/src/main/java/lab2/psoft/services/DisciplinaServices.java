package lab2.psoft.services;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Optional;
import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.core.type.TypeReference;
import org.springframework.beans.factory.annotation.Autowired;

import lab2.psoft.models.Disciplina;
import lab2.psoft.daos.DisciplinasRepository;

@Service
public class DisciplinaServices {

    @Autowired
	private DisciplinasRepository<Disciplina, Long> disciplinasDAO;

    @PostConstruct
    public void initDisciplinas() {
        ObjectMapper mapper = new ObjectMapper();
        TypeReference<List<Disciplina>> typeReference = new TypeReference<List<Disciplina>>(){};
        InputStream inputStream = ObjectMapper.class.getResourceAsStream("/json/disciplinas.json");
        try {
            List<Disciplina> disciplinas = mapper.readValue(inputStream, typeReference);
            this.disciplinasDAO.saveAll(disciplinas);
            System.out.println("Disciplina salva no BD");
        } catch (IOException e) {
            System.out.println("Não foi possível salvar as Disciplinas: " + e.getMessage());
        }
    }

	public DisciplinaServices(DisciplinasRepository<Disciplina, Long> disciplinasDAO) {
		super();
		this.disciplinasDAO = disciplinasDAO;
	}
	
    public Disciplina addDisciplina(Disciplina disciplina) {
        return disciplinasDAO.save(disciplina);
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinasDAO.findAll();
    }

    public Optional<Disciplina> getDisciplina(Long id) {
        return disciplinasDAO.findById(id);
    }
    
}
