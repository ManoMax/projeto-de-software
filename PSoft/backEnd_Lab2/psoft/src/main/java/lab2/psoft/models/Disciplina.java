package lab2.psoft.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Disciplina implements Comparable<Disciplina> {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String nome;
	private double nota;

	private String comentarios;
	private int likes;

	public Disciplina() {
		super();
		this.comentarios = "";
		this.likes = 0;
	}
	public Disciplina(String nome, double nota) {
		this.nome = nome;
		this.nota = nota;
		this.comentarios = "";
		this.likes = 0;
	}

	public long getId() {
		return this.id;
	}
	public double getNota() {
		return this.nota;
	}
	public String getNome() {
		return this.nome;
	}
	public String getComentarios() {
		return this.comentarios;
	}
	public int getLikes() {
		return this.likes;
	}

	public Integer setId(Integer id) {
		this.id = id;
		return  id;
	}
	public Disciplina setNome(String nome) {
		this.nome = nome;
		return this;
	}
	public Disciplina setNota(double nota) {
		this.nota = nota;
		return this;
	}
	public Disciplina setComentarios(String comentarios) {
		this.comentarios += System.lineSeparator() + comentarios;
		return this;
	}
	public Disciplina setLikes(int likes) {
		this.likes += likes;
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
