package model;

public class ProfessorTitular extends Professor {
	
	private String especialidade;
	
	

	public ProfessorTitular() {
	}
	
	public ProfessorTitular(Professor prof) {
	}

	public ProfessorTitular(String nome, String sobrenome, Integer tempoCasa, Integer codProfessor,
			String especialidade) {
		super(nome, sobrenome, tempoCasa, codProfessor);
		this.especialidade = especialidade;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	@Override
	public String toString() {
		return "Professor Titular: Especialidade: " + especialidade + ", Nome: " + getNome() + ", Sobrenome: "
				+ getSobrenome() + ", Tempo de Casa: " + getTempoCasa() + ", Código Professor: " + getCodProfessor() + "\n";
				
	}
	
	
	
	
	
	
	
	

}
