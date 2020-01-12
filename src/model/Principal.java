package model;

public class Principal {

	public static void main(String[] args) {
		DigitalHouseManager digital = new DigitalHouseManager();

		digital.registrarCurso("Android", 20002, 2);
		digital.registrarCurso("Full Stack", 20001, 3);

		digital.registrarProfessorTitular("John", "Blue", 2, 1, "A");
		digital.registrarProfessorTitular("Bob", "Brown", 1, 2, "B");
		digital.registrarProfessorAdjunto("Maria", "Green", 1, 3, 1);
		digital.registrarProfessorAdjunto("Alex", "Red", 1, 4, 4);

		digital.alocarProfessores(20002, 1, 3);
		digital.alocarProfessores(20001, 2, 4);

		digital.matricularAluno("John", "Silver", 1);
		digital.matricularAluno("James", "Black", 2);
		digital.matricularAluno("Peter", "Gray", 3);
		digital.matricularAluno("Olivia", "White", 4);
		digital.matricularAluno("Emily", "Orange", 5);

		System.out.println("---------------------------------------------------------------------------");

		digital.matricularAluno(1, 20002);
		digital.matricularAluno(2, 20002);
		digital.matricularAluno(3, 20001);
		digital.matricularAluno(4, 20001);
		digital.matricularAluno(5, 20002);

		System.out.println("-----------------------------------------------------------");

		System.out.println(digital.getListaCurso().toString());

		System.out.println(">>>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<<<<<<<\n");

		for (Curso curs : digital.getListaCurso()) {
			System.out.println(curs.toStringMatriculado());
		}

	}

}
