package tarea.interfaces;

public class MatriculaUniversidadCatolica implements MatriculaInterfaz{
	
	public void verificarMateriasEstudiante() {
		System.out.println(" *El sistema verifica si el estudiante aprobo materias* ");
	}

	public void verificarAlgunImpedimentoLegal() {
		System.out.println(" *El sistema verifica si hay deudas  pendientes a pagar* ");
	}

	public void registrarMateriasYHorarios() {
		System.out.println("Materia 1: ");
		System.out.println("Materia 2: ");
		System.out.println("Materia 3: ");
		System.out.println("Materia 4: ");
		System.out.println(" *El sistema registra las materias que seleccionó el estudiante* ");
	}

	public void restarMatriculasConformeSeMatriculenLosEstudiantes() {
		System.out.println(" *El sistema elimina una matricula una vez termina el proceso un estudiante* ");
	}

	public void enviarRegistroALasFacultades() {
		System.out.println(" *El sistema envia el registro del estudiante matriculado a la facultad* ");
	}

}
