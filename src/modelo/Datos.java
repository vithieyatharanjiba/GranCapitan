package modelo;

public class Datos {
	private  String[] diasSemana = { "lunes", "martes", "miercoles", "jueves", "viernes", "sábado", "domingo" };
    private Estudiante[] estudiantes;
    private   int numEstudiantes = 30;
	// Declarar propiedad private,un array  de Estudiantes
	// crea getter/setter
	// en el constructor de esta clase, INICIALIZAR dicho array 
	
	public Datos() {
		
	// INICIALIZA AQUI EL ARRAY estudiantes....
	estudiantes = new Estudiante[numEstudiantes];
	Estudiante est1 = new Estudiante(12);
	est1.setNombre("Pedro Perez");
	Estudiante est2 = new Estudiante(12);
	est2.setNombre("Maria Navarro");
	
	
	estudiantes[0]= est1;
	estudiantes[1]= est2;

	}

	public Estudiante[] getEstudiantes() {
		return this.estudiantes;
	}

	public void setEstudiantes(Estudiante[] estudiantes) {
		this.estudiantes = estudiantes;
	}

	public  String[] getDiasSemana() {
		return diasSemana;
	}

	public  void setDiasSemana(String[] diasSemana) {
		diasSemana = diasSemana;
	}

}
