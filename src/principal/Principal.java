package principal;

import java.time.LocalDate;
import java.util.Arrays;

import auxiliar.Practicas;
import modelo.Datos;
import modelo.Estudiante;
import modelo.Persona;
import modelo.Profesor;

public class Principal {
	// metodo por el que debe empezar la ejecución ..
	public static void main(String[] args) {
		/*
		 * Persona persona; persona = new Persona();
		 * 
		 * persona.setNombre("Manolo"); System.out.println("nif : " + persona.getNif());
		 * System.out.println("nombre : " + persona.getNombre());
		 * System.out.println("altura : " + persona.getAltura());
		 * System.out.println("persona1 creada");
		 */
		/*
		 * Persona padre = new Persona(); padre.setNombre("JorgePadre");
		 * padre.setSexo('M'); Persona madre = new Persona();
		 * madre.setNombre("MariaMadre"); madre.setNif("44567981H"); madre.setSexo('F');
		 */

		/*
		 * Persona persona2 = new Persona("43897124R", "PEPE", 'F', LocalDate.of(1999,
		 * 9, 21), 170, padre, madre); System.out.println("persona2 creada");
		 * System.out.println("Nombre madre : " + persona2.getMadre().getNombre());
		 */
		// crear un Estudiante

		
		Estudiante estAnonimo = new Estudiante(123);
		 System.out.println(estAnonimo.toString()); 
		Estudiante estudiante = new   Estudiante(111, "44556677G","javier", 'M', LocalDate.now(), 187, estAnonimo,
		  null);
		 Estudiante estudiante2 = new  Estudiante(111, "44556677t","rafael", 'M', LocalDate.now(), 187, estAnonimo,
				  null);
		 Estudiante estudiante3 = new Estudiante(111, "44556677h","Marco", 'M', LocalDate.now(), 187, estAnonimo,
				  null);
		 Estudiante [] listaEstudiante = new Estudiante [] {estAnonimo,estudiante,estudiante2,estudiante3};
		  
		  System.out.println(estudiante.toString());
		  
		  Profesor profe1 = new Profesor(); System.out.println(profe1);
		 
		Practicas practicas = new Practicas();
		practicas.ordenaEstudiantes(listaEstudiante);
		// new Practicas().muestraNumerosDe1A1000();
		// practicas.muestraNumerosDe1A1000();
		// practicas.muestraNumeros3(20, 25);
		// practicas.generaAleatorios2(3,10,11);
		// practicas.estadisticaCadena("Las&%=\" PalmAs\\ de Gran CanarIa");
		// int [] numeros=practicas.generaAleatorios3(100, 1, 6);
		// int[] frecuencia = practicas.frecuenciaAparicion(100, 1, 8);
		// practicas.listaDiasSemana();
		// Estudiante[] lista = new Datos().getEstudiantes();
		// practicas.listaEstudiantes(new Datos().getEstudiantes());
		int[][] visitantesYear = { { 2, 4, 5, 1, 3, 2, 1, 1, 1, 3, 5, 1 },
				{ 23, 1, 56, 12, 32, 23, 17, 12, 11, 34, 45, 13 }, { 23, 3, 56, 12, 32, 23, 17, 12, 11, 34, 45, 12 },
				{ 23, 1, 56, 12, 32, 23, 17, 12, 11, 34, 45, 13 }, { 23, 4, 56, 12, 32, 23, 17, 12, 11, 34, 45, 10 },
				{ 23, 3, 56, 12, 32, 23, 17, 12, 11, 34, 45, 45 }, { 23, 1, 56, 12, 32, 23, 17, 12, 11, 34, 45, 37 }

		};
		String[] islas = { "GC", "LTE", "FTV", "TFE", "LPA", "GOM", "HIE" };
		String[] meses = { "ENE", "FEB", "MAR", "ABR", "MAY", "JUN", "JUL", "AGO", "SEP", "OCT", "NOV", "DIC" };

		/*
		 * int isla=2; int mes =7; System.out.println("Visitantes en "+ islas[isla]
		 * +" : " + practicas.visitantesIslaYear(isla, visitantesYear));
		 * System.out.println("Visitantes  en Canarias en el mes " + meses[mes]+ " : " +
		 * practicas.visitantesMesYear(mes, visitantesYear));
		 */

	/*	String[] misDatos = { "123","abc", "345", "1x2", "990" };
		//int[] res = practicas.convierteCadenasANumeros(misDatos);
		float saldo= 1000.0f;
		float[] movimientos= {10.0f, -5.0f,20.5f};
		
		float saldoFinal = practicas.calculaSaldo(saldo, movimientos);
		*/
		int[] datos = practicas.generaAleatorios3(500, 1, 500);
		//practicas.ordenaEnteros(datos);
		//Arrays.sort(datos);
		String[] cadenas =  {"perro","gato","alce"};
		practicas.ordenaCadenas(cadenas);
		System.out.println("fin");

	}

}
