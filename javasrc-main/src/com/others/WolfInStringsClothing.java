package com.others;

/*
 * Si esta clase pudiera compilarse, la seguridad en Java sería un mito
 */
public class WolfInStringsClothing {
	/*
	 * En teoria no se podria compilar pero javac WolfInStringsClothing.java no me dio error
	 * String es un tipo fundamental en Java
	 * El comportamiento de las cadenas no se puede modificar
	 * La clase del API se marca como final, de modo que no es posible asignarla a una subclase.
	 * Por lo tanto no es posible proporcionar un método setChartAt()
	 */
	public void setCharAt(int index, char newChar) {
		// La implementación de este método
		// constituye un ejercicio para el lector
		// Sugerencia: compile este código exactamente como está antes de irritarse
		
	}
}
