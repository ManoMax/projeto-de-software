package lab2.psoft.controllers;

import lab2.psoft.models.Usuario;
import lab2.psoft.services.JWTService;
import lab2.psoft.services.UsuarioServices;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
import javax.servlet.ServletException;

@RestController
@RequestMapping("/auth")
public class LoginController {

    private UsuarioServices usuarioServices;
    private JWTService jwtService;

    public LoginController(UsuarioServices usuarioServices, JWTService jwtService) {
        super();
        this.usuarioServices = usuarioServices;
        this.jwtService = jwtService;
    }

    @PostMapping("/login")
    public LoginResponse authenticate(@RequestBody Usuario usuario) throws ServletException {

        // Recupera o usuario
        Optional<Usuario> authUsuario = usuarioServices.getUsuario(usuario.getEmail());

        // verificacoes
        verificaExistencia(usuario);
        verificaSenha(usuario, authUsuario);

        String token = jwtService.geraToken(authUsuario.get().getEmail());

        return new LoginResponse(token);

    }
    
    private void verificaExistencia(Usuario usuario) throws ServletException {
    	if (!usuarioServices.exist(usuario)) {
            throw new ServletException("Usuario nao encontrado!");
        }
    }
    
    private void verificaSenha(Usuario usuario, Optional<Usuario> authUsuario) throws ServletException {
        if (!authUsuario.get().getSenha().equals(usuario.getSenha())) {
            throw new ServletException("Senha invalida!");
        }
    }

    /**
     * 
     * {
	"email": "gabrielmax@mlkdoido.com",
	"nome": "hahaha",
	"senha": "xiii"
	}
     */
    
    @DeleteMapping("/usuarios/{email}")
	public ResponseEntity<Usuario> removeUsuario(@PathVariable String email, @RequestHeader("Authorization") String header, @RequestBody Usuario usuario) {
		if(usuarioServices.getUsuario(email).get() == null)
			return new ResponseEntity<Usuario>(HttpStatus.NOT_FOUND);
		if (usuarioServices.getUsuario(usuario.getEmail()).get().getSenha() == usuario.getSenha() ) {
			return new ResponseEntity<Usuario>(HttpStatus.UNAUTHORIZED);
		}
		try {
			if(jwtService.usuarioTemPermissao(header, email)) {
				return new ResponseEntity<Usuario>(usuarioServices.removeUsuario(email), HttpStatus.OK);
			}
		} catch (ServletException e) {
			//usuario esta com token invalido ou vencido
			return new ResponseEntity<Usuario>(HttpStatus.FORBIDDEN);
		}
		//usuario nao tem permissao
		return new ResponseEntity<Usuario>(HttpStatus.UNAUTHORIZED);
	}
    
    @SuppressWarnings("unused")
    private class LoginResponse {
        public String token;

        public LoginResponse(String token) {
            this.token = token;
        }
        
		public String getToken() {
			return this.token;
		}

		public void setToken(String token) {
			this.token = token;
		}
    }

}
