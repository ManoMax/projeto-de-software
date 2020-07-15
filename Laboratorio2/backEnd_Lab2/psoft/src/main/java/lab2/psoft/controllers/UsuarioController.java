package lab2.psoft.controllers;

import lab2.psoft.models.Usuario;
import lab2.psoft.services.JWTService;
import lab2.psoft.services.UsuarioServices;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;

@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioServices usuarioServices;
    @SuppressWarnings("unused")
	private JWTService jwtService;

    public UsuarioController(UsuarioServices usuarioServices, JWTService jwtService) {
        super();
        this.usuarioServices = usuarioServices;
        this.jwtService = jwtService;
    }

    @PostMapping("")
    public ResponseEntity<Usuario> addUsuario(@RequestBody Usuario usuario) {
        return new ResponseEntity<Usuario>(usuarioServices.addUsuario(usuario), HttpStatus.OK);
    }
    
    @GetMapping("/{email}")
    public ResponseEntity<Usuario> getUsuario(@PathVariable String email) {
    	return new ResponseEntity<Usuario>(usuarioServices.getUsuario(email).get(), HttpStatus.OK);
    }
    
    @RequestMapping("/list")
	public ResponseEntity<Collection<Usuario>>  getUsuarios(){
		return  new ResponseEntity<Collection<Usuario>>(usuarioServices.getUsuarios(),HttpStatus.OK);
	}
    

}
