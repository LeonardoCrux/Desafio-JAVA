package model;

public class Professor {

	private String nome;
	private String sobrenome;
	private Integer tempoCasa;
	private Integer codProfessor;

	public Professor() {

	}

	public Professor(String nome, String sobrenome, Integer tempoCasa, Integer codProfessor) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.tempoCasa = tempoCasa;
		this.codProfessor = codProfessor;
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

	public Integer getTempoCasa() {
		return tempoCasa;
	}

	public void setTempoCasa(Integer tempoCasa) {
		this.tempoCasa = tempoCasa;
	}

	public Integer getCodProfessor() {
		return codProfessor;
	}

	public void setCodProfessor(Integer codProfessor) {
		this.codProfessor = codProfessor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codProfessor == null) ? 0 : codProfessor.hashCode());
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
		Professor other = (Professor) obj;
		if (codProfessor == null) {
			if (other.codProfessor != null)
				return false;
		} else if (!codProfessor.equals(other.codProfessor))
			return false;
		return true;
	}

}
