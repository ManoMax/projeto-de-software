package lab2.psoft.services;

import lab2.psoft.daos.UsuariosRepository;
import lab2.psoft.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsuarioServices {

    @Autowired
    private UsuariosRepository<Usuario, Long> usuariosDAO;

    public UsuarioServices(UsuariosRepository<Usuario, Long> usuariosDAO) {
        super();
        this.usuariosDAO = usuariosDAO;
    }

    public Usuario addUsuario(Usuario usuario) {
        return usuariosDAO.save(usuario);
    }

    public Optional<Usuario> getUsuario(String email) {
        return this.usuariosDAO.findByEmail(email);
    }
}