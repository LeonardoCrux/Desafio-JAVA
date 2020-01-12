package model;

public class ProfessorAdjunto extends Professor {

	private Integer monitoria;

	

	public ProfessorAdjunto(String nome, String sobrenome, Integer tempoCasa, Integer codProfessor, Integer monitoria) {
		super(nome, sobrenome, tempoCasa, codProfessor);
		this.monitoria = monitoria;
	}

	public ProfessorAdjunto(Professor prof) {
		// TODO Auto-generated constructor stub
	}

	public Integer getMonitoria() {
		return monitoria;
	}

	public void setMonitoria(Integer monitoria) {
		this.monitoria = monitoria;
	}

	@Override
	public String toString() {
		return "Professor Adjunto: Monitoria: " + monitoria + ", Nome: " + getNome() + ", Sobrenome:"
				+ getSobrenome() + ", Tempo de Casa: " + getTempoCasa() + ", Código Professor: " + getCodProfessor() + "\n";
	}
	
	
	
	
	
}
