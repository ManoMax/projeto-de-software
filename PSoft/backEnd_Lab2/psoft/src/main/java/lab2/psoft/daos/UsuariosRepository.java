package lab2.psoft.daos;

import lab2.psoft.models.Usuario;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

@Repository
public interface UsuariosRepository<T, ID extends Serializable> extends JpaRepository<Usuario, Long> {


}
