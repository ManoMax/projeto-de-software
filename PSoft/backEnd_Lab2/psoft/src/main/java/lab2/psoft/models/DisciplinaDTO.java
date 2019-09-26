package lab2.psoft.models;

public class DisciplinaDTO {

    private long id;
    private String nome;

    public DisciplinaDTO (long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public long getId() {
        return this.id;
    }

    public String getNome() {
        return this.nome;
    }
}
