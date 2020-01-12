package model;

import java.util.ArrayList;
import java.util.List;

public class Curso {

	private String nome;
	private Integer codCurso;
	private ProfessorTitular professorTitular;
	private ProfessorAdjunto professorAdjunto;
	private Integer numMaxAlunos;
	private List<Aluno> listaAluno = new ArrayList<>();
	
	
	
	
	public Curso() {
	}



	public Curso(String nome, Integer codCurso, Integer numMaxAlunos) {
		super();
		this.nome = nome;
		this.codCurso = codCurso;
		this.numMaxAlunos = numMaxAlunos;
	}
	
	
	
	
	

	public Curso(String nome, Integer codCurso, ProfessorTitular professorTitular, ProfessorAdjunto professorAdjunto,
			Integer numMaxAlunos, List<Aluno> listaAluno) {
		super();
		this.nome = nome;
		this.codCurso = codCurso;
		this.professorTitular = professorTitular;
		this.professorAdjunto = professorAdjunto;
		this.numMaxAlunos = numMaxAlunos;
		this.listaAluno = listaAluno;
	}



	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public Integer getCodCurso() {
		return codCurso;
	}



	public void setCodCurso(Integer codCurso) {
		this.codCurso = codCurso;
	}



	public ProfessorTitular getProfessorTitular() {
		return professorTitular;
	}



	public void setProfessorTitular(ProfessorTitular professorTitular) {
		this.professorTitular = professorTitular;
	}



	public ProfessorAdjunto getProfessorAdjunto() {
		return professorAdjunto;
	}



	public void setProfessorAdjunto(ProfessorAdjunto professorAdjunto) {
		this.professorAdjunto = professorAdjunto;
	}



	public Integer getNumMaxAlunos() {
		return numMaxAlunos;
	}



	public void setNumMaxAlunos(Integer numMaxAlunos) {
		this.numMaxAlunos = numMaxAlunos;
	}



	public List<Aluno> getListaAluno() {
		return listaAluno;
	}



	public void setListaAluno(List<Aluno> list) {
		this.listaAluno = list;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Curso other = (Curso) obj;
		if (codCurso == null) {
			if (other.codCurso != null)
				return false;
		} else if (!codCurso.equals(other.codCurso))
			return false;
		return true;
	}
	
	public Boolean adicionarUmAluno(Aluno umAluno) {
		if(listaAluno.size() < numMaxAlunos) {
			listaAluno.add(umAluno);
			System.out.println("Aluno Matriculado!\n");
			return true;
		}
		else {System.out.println("Não é possivel realizar a matricula. Não há vagas disponíveis!");
		return false;
		}
		
		
	}
	
	public void excluirAluno(Aluno umAluno) {
		if(listaAluno.equals(umAluno)) {
			listaAluno.remove(umAluno);
		}
	}



	@Override
	public String toString() {
		return "Curso: Nome: " + nome + ", Código do Curso: " + codCurso + " Máximo de Alunos: " + numMaxAlunos +"\n" +professorTitular
				+ "" + professorAdjunto + "\n";
	}
	
	public String toStringMatricula() {
		return "Curso: Nome: " + nome + ", Código do Curso: " + codCurso + "\n";
	}
	
	public String toStringMatriculado() {
		return "Curso: Nome: " + nome + ", Código do Curso: " + codCurso + " | Lista Alunos: " + listaAluno + "\n";
	}
	
	
	
	
	
	
	
}
