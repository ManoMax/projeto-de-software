package lab2.psoft.controllers;

import lab2.psoft.models.Disciplina;
import lab2.psoft.models.Usuario;
import lab2.psoft.services.UsuarioServices;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioServices usuarioServices;

    public UsuarioController(UsuarioServices usuarioServices) {
        super();
        this.usuarioServices = usuarioServices;
    }

    @PostMapping("/usuarios")
    public ResponseEntity<Usuario> addUsuario(@RequestBody Usuario usuario) {
        return new ResponseEntity<Usuario>(usuarioServices.addUsuario(usuario), HttpStatus.OK);
    }

}
