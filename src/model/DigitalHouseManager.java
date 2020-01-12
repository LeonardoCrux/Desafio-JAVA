package model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class DigitalHouseManager {

	private List<Aluno> listaAluno = new ArrayList<>();
	private List<Professor> listaProfessor = new ArrayList<>();
	private List<Curso> listaCurso = new ArrayList<>();
	private List<Matricula> listaMatricula = new ArrayList<>();

	public DigitalHouseManager() {
		super();
	}

	public List<Aluno> getListaAluno() {
		return listaAluno;
	}

	public void setListaAluno(List<Aluno> listaAluno) {
		this.listaAluno = listaAluno;
	}

	public List<Professor> getListaProfessor() {
		return listaProfessor;
	}

	public void setListaProfessor(List<Professor> listaProfessor) {
		this.listaProfessor = listaProfessor;
	}

	public List<Curso> getListaCurso() {
		return listaCurso;
	}

	public void setListaCurso(List<Curso> listaCurso) {
		this.listaCurso = listaCurso;
	}

	public List<Matricula> getListaMatricula() {
		return listaMatricula;
	}

	public void setListaMatricula(List<Matricula> listaMatricula) {
		this.listaMatricula = listaMatricula;
	}

	public void registrarCurso(String nome, Integer codCurso, Integer numMaxAlunos) {
		Curso curso = new Curso(nome, codCurso, numMaxAlunos);
		listaCurso.add(curso);

	}

	public void excluirCurso(Integer codigoCurso) {
		Curso curso = new Curso();
		int i = 0;
		for (Curso delCurso : listaCurso) {
			if (delCurso.getCodCurso().equals(codigoCurso)) {
				curso = delCurso;
				i++;
			} else {
				System.out.println("Curso Não encontrado");
			}
		}

		if (i > 0) {
			listaCurso.remove(curso);
			System.out.println("Curso Removido!");
		}
	}

	public void registrarProfessorAdjunto(String nome, String sobrenome, Integer tempocasa, Integer codProfessor,
			Integer monitoria) {
		ProfessorAdjunto professorAdjunto = new ProfessorAdjunto(nome, sobrenome, tempocasa, codProfessor, monitoria);
		listaProfessor.add(professorAdjunto);
	}

	public void registrarProfessorTitular(String nome, String sobrenome, Integer tempocasa, Integer codProfessor,
			String especialidade) {
		ProfessorTitular professorTitular = new ProfessorTitular(nome, sobrenome, tempocasa, codProfessor,
				especialidade);
		listaProfessor.add(professorTitular);
	}

	public void excluirProfessor(Integer codigoProfessor) {
		Professor prof = new Professor();
		int i = 0;
		for (Professor delProf : listaProfessor) {
			if (codigoProfessor.equals(delProf.getCodProfessor())) {
				prof = delProf;
				i++;
			}
		}
		if (i > 0) {
			listaProfessor.remove(prof);
			System.out.println("Professor Removido!");
		}
	}
	
	public Boolean adicionarUmAluno(Aluno umAluno) {
		if(listaAluno.contains(umAluno)) {
			return false;
		}
		else return true;
	}

	public void matricularAluno(String nome, String sobrenome, Integer codAluno) {
		Aluno aluno = new Aluno(nome, sobrenome, codAluno);
		listaAluno.add(aluno);
	}

	public void matricularAluno(Integer codigoAluno, Integer codigoCurso) {
		Aluno alunoM = new Aluno();
		Curso cursoM = new Curso();

		for (Curso curso : listaCurso) {
			if (curso.getCodCurso().equals(codigoCurso)) {
				System.out.println(curso.toStringMatricula());
				if (curso.getListaAluno().size() < curso.getNumMaxAlunos()) {
					cursoM = (Curso) curso;

					for (Aluno aluno : listaAluno) {
						if (aluno.getCodAluno().equals(codigoAluno)) {
							System.out.println("Dados do Aluno: " + aluno.toString());
							alunoM = (Aluno) aluno;
						}

					}

					Matricula matricula = new Matricula(alunoM, cursoM, new Date());

					listaMatricula.add(matricula);

					System.out.println("Matricula efetuada com sucesso!\n");
					curso.adicionarUmAluno(alunoM);
				}

				else {
					System.out.println("Não é possivel efetuar a matricula. Não há vagas disponíveis.\n");
				}

			}
		}

	}

	public void alocarProfessores(Integer codigoCurso, Integer codigoProfessorTitular, Integer codigoProfessorAdjunto) {

		for (Professor prof : listaProfessor) {
			if (prof instanceof ProfessorTitular) {
				if (prof.getCodProfessor().equals(codigoProfessorTitular)) {
					for (Curso lCurso : listaCurso) {
						if (lCurso.getCodCurso().equals(codigoCurso)) {
							System.out.println("Dados Professor: " + prof.toString());
							ProfessorTitular profTitular = (ProfessorTitular) prof;
							lCurso.setProfessorTitular(profTitular);
						}
					}
				}
			}
		}

		for (Professor prof : listaProfessor) {
			if (prof instanceof ProfessorAdjunto) {
				if (prof.getCodProfessor().equals(codigoProfessorAdjunto)) {
					for (Curso lCurso : listaCurso) {
						if (lCurso.getCodCurso().equals(codigoCurso)) {
							System.out.println("Dados Professor: " + prof.toString());
							ProfessorAdjunto profAdjunto = (ProfessorAdjunto) prof;
							lCurso.setProfessorAdjunto(profAdjunto);
						}
					}

				}

			}
		}
	}

}