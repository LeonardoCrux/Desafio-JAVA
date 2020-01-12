package model;

import java.util.Date;

public class Matricula {

	private Aluno aluno;
	private Curso curso;
	private Date data;

	public Matricula(Aluno aluno, Curso curso, Date data) {
		this.aluno = aluno;
		this.curso = curso;
		this.data = data;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "Matricula " + aluno + " " + curso.toStringMatricula() + " Data: " + data + "]\n";
	}

}
