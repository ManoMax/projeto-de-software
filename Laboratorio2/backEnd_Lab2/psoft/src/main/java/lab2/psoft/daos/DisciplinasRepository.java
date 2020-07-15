package lab2.psoft.daos;

import lab2.psoft.models.Disciplina;
import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DisciplinasRepository<T, ID extends Serializable> extends JpaRepository<Disciplina, Long>{

	
}
