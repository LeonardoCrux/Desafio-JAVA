package model;

public class Aluno {

	private String nome;
	private String sobrenome;
	private Integer codAluno;

	public Aluno() {
	}

	public Aluno(String nome, String sobrenome, Integer codAluno) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.codAluno = codAluno;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Integer getCodAluno() {
		return codAluno;
	}

	public void setCodAluno(Integer codAluno) {
		this.codAluno = codAluno;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codAluno == null) ? 0 : codAluno.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		if (codAluno == null) {
			if (other.codAluno != null)
				return false;
		} else if (!codAluno.equals(other.codAluno))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Aluno Nome:" + nome + ", Sobrenome: " + sobrenome + ", Código Aluno: " + codAluno + " | ";
	}

}
