package es.maestredam;
public class Alumno {
	
	private String nombre;
	private String curso;
	private int altura;  //En cm

	
	
	/**
	 * Construye objeto Alumno con todos los datos
	 * 
	 * @param nombre el nombre del alumno
	 * @param curso el curso (por ejemplo DAM1M)
	 * @param altura la altura en cm
	 */
	public Alumno (String nombre,String curso, int altura) {
		this.nombre = nombre;
		this.curso = curso;
		this.altura = altura;
	}
	/**
	 * Getter:Devuelve el valor del atributo alumno
	 * @return el nombre del alumno
	 */



	public String getNombre() {
		return nombre;
	}



	public String getCurso() {
		return curso;
	}



	public int getAltura() {
		return altura;
	}
	//Herede equals de Object PERO lo sobreescribo para alumno
	
	/**
	 * Compara dos objetos Alumno
	 * Heredo equals de object PERO lo SOBRESCRIBO para Alumno
	 * 
	 * Devuelve true cuando un alumno tiene el mismo que el alumno pasado;false en otro caso
	 * @return
	 */
	
	public boolean equals(Object obj) {
		boolean ret = false;
		
		
		if (obj == null) {
			return false;
		}
		//obj.getNombre NO Funcione porque obj es Object aunque apunte al objeto Alumno pasado
		//Casting: Obtengo referencia a alumno
		
		//Hago casting solo si el obj pasado es Alumno
		if (obj instanceof Alumno) {
			//Ahora si puedo hacer Casting 
			Alumno alumno = (Alumno)obj;
			String nombre1 = alumno.getNombre();
			String nombre2 = this.getNombre();
			if (nombre1.equals(nombre2)) {
				ret = true;
		}
		
		
		
		}
		return ret;
		
	}
	@Override
	/**
	 * 
	 */
	public String toString() {
		String str = getNombre() + "de "+ getCurso()+"mide "+ getAltura()+"cm";
		return str;
	}

}
