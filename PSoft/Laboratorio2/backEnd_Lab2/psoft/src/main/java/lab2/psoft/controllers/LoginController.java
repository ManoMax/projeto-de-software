package lab2.psoft.controllers;

import lab2.psoft.models.Usuario;
import lab2.psoft.services.JWTService;
import lab2.psoft.services.UsuarioServices;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
import javax.servlet.ServletException;

@RestController
@RequestMapping("/auth")
public class LoginController {

    private UsuarioServices usuariosService;
    private JWTService jwtService;

    public LoginController(UsuarioServices usuarioServices, JWTService jwtService) {
        super();
        this.usuariosService = usuarioServices;
        this.jwtService = jwtService;
    }

    @PostMapping("/login")
    public LoginResponse authenticate(@RequestBody Usuario usuario) throws ServletException {

        // Recupera o usuario
        Optional<Usuario> authUsuario = usuariosService.getUsuario(usuario.getEmail());

        // verificacoes
        verificaExistencia(usuario);
        verificaSenha(usuario, authUsuario);

        String token = jwtService.geraToken(authUsuario.get().getEmail());

        return new LoginResponse(token);

    }

    private void verificaExistencia(Usuario usuario) throws ServletException {
    	if (!usuariosService.exist(usuario)) {
            throw new ServletException("Usuario nao encontrado!");
        }
    }
    
    private void verificaSenha(Usuario usuario, Optional<Usuario> authUsuario) throws ServletException {
        if (!authUsuario.get().getSenha().equals(usuario.getSenha())) {
            throw new ServletException("Senha invalida!");
        }
    }

    private class LoginResponse {
        public String token;

        public LoginResponse(String token) {
            this.token = token;
        }
    }

}
