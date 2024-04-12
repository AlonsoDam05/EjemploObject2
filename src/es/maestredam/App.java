package es.maestredam;

public class App {
	public static void main (String[]args) {
		Alumno lucas = new Alumno("Lucas", "DAM1M", 160);
		Alumno alonso = new Alumno ("Alonso", "DAM1M", 185);
		Alumno otrolucas = new Alumno ("lucas", "DAM1M", 185);
		
		System.out.println("Referencia lucas" +lucas);
		
		System.out.println("Referencia alonso" +alonso);
		
		if (lucas.equals(alonso)) {
			System.out.println("Lucas y Alonso coinciden");
		}
		else {
			System.out.println("Lucas y Alonso no coinciden");
		}
		
		//Prueba 2

		if (lucas.equals(otrolucas)) {
			System.out.println("Lucas y otrolucas coinciden");
		}
		else {
			System.out.println("Lucas y otrolucas no coinciden");
		}
		//Al usar instanceof antes del casting, evito la Excepcion al llamar con un texto(que es un String)
		
		String texto ="BLABLABLA";
		if (lucas.equals(texto)) {
			System.out.println("Funciona!");
		}
		else {
			System.out.println("No es igual lucas que BLABLABLA");
		}
		
		
		//print llama implicitamente al método toString de la clase
		//Se deberia sobreescribir para devolver una cadena útil
		System.out.println(lucas);
		System.out.println(alonso);
	}

}
