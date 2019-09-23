package lab2.psoft.services;

import java.util.List;
import java.util.Optional;

// import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import lab2.psoft.daos.DisciplinasRepository;
import lab2.psoft.models.Disciplina;

@Service
public class DisciplinaServices {

    // @Autowired
	private DisciplinasRepository<Disciplina, Long> disciplinasDAO;
	
	//obrigatorio ter esse construtor, caso contrario chama um construtor
    //default e o DAO fica null
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
