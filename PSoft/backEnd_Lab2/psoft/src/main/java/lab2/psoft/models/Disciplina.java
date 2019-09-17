package lab2.psoft.models;

import com.fasterxml.jackson.annotation.JsonCreator;

@Entity
public class Disciplina implements Comparable<Disciplina> {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String nome;
	private double nota;

	private String comentarios;
	private Integer like;

	//public Disciplina() {
	//}

	@JsonCreator
	public Disciplina(String nome, double nota) {
		this.nome = nome;
		this.nota = nota;
	}

	public Disciplina(String nome, double nota) {
		this.nome = nome;
		this.nota = nota;
	}

	public Integer setId(Integer id) {
		this.id = id;
		return  id;
	}

	public Integer getId() {
		return this.id;
	}

	public double getNota() {
		return this.nota;
	}

	public String getNome() {
		return this.nome;
	}

	public Disciplina setNome(String nome) {
		this.nome = nome;
		return this;
	}

	public Disciplina setNota(double nota) {
		this.nota = nota;
		return this;
	}

	@Override
	public int compareTo(Disciplina disciplina) {
		if (this.nota > disciplina.getNota()) {
			return -1;
		} else if (this.nota < disciplina.getNota()) {
			return 1;
		} else {
			return 0;
		}
	}
}
