package lab2.psoft.models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Usuario {

    @Id
    private String email;
    private String nome;
    private String senha;

    public Usuario() {
        super();
    }
    public Usuario(String email, String nome, String senha) {
        super();
        this.email = email;
        this.nome = nome;
        this.senha = senha;
    }

    public String getEmail() {
        return this.email;
    }
    public String getNome() {
        return this.nome;
    }
    public String getSenha() {
        return this.senha;
    }

    public void setEmail() {
        this.email = email;
    }
    public void setNome() {
        this.nome = nome;
    }
    public void setSenha() {
        this.senha = senha;
    }
}
