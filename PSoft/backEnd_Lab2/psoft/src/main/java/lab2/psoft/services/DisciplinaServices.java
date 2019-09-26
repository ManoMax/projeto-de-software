package lab2.psoft.services;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import javax.annotation.PostConstruct;

import lab2.psoft.models.DisciplinaDTO;
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
            if (disciplinasDAO.count() == 0) {
                this.disciplinasDAO.saveAll(disciplinas);
                System.out.println("Disciplina salva no BD");
            }
        } catch (IOException e) {
            System.out.println("Não foi possível salvar as Disciplinas: " + e.getMessage());
        }
    }

	public DisciplinaServices(DisciplinasRepository<Disciplina, Long> disciplinasDAO) {
		super();
		this.disciplinasDAO = disciplinasDAO;
	}

    public List<DisciplinaDTO> getDisciplinas() {
        List<Disciplina> listDisciplinas = disciplinasDAO.findAll();
        List<DisciplinaDTO> listDTO = new ArrayList<DisciplinaDTO>();

        for (Disciplina disciplina : listDisciplinas) {
            listDTO.add(new DisciplinaDTO(disciplina.getId(), disciplina.getNome()));
        }
        return listDTO;
    }
    public Optional<Disciplina> getDisciplina(Long id) {
        return disciplinasDAO.findById(id);
    }

    public Disciplina setNota(Disciplina disciplina, long id) {
        return disciplinasDAO.getOne(id).setNota(disciplina.getNota());
    }
    public Disciplina setComentario(Disciplina disciplina, long id) {
        disciplinasDAO.save(disciplinasDAO.getOne(id).setComentarios(disciplina.getComentarios()));
        return disciplinasDAO.getOne(id);
    }
}
