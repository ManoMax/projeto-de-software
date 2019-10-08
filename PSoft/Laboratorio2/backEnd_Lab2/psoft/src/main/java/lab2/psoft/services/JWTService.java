package lab2.psoft.services;

import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class JWTService {

    private UsuarioServices usuariosService;
    private final String TOKEN_KEY = "login do batman";

    public JWTService(UsuarioServices usuarioServices) {
        super();
        this.usuariosService = usuarioServices;
    }

    public String geraToken(String email) {
        return Jwts.builder().setSubject(email)
                .signWith(SignatureAlgorithm.HS512, TOKEN_KEY)
                .setExpiration(new Date(System.currentTimeMillis() + 3 * 60 * 1000)).compact();//3 min
    }
}
