package com.others;

public class GetClassforName {

	public static void main(String[] args) {
		/*
		 * Para saber si una clase esta presente ó no en la biblioteca del sistema en tiempo de ejecución. 
		 * 
		 */
		try {
			
			// Class.forName("java.lang.reflect.Constructor");
			Class.forName("javax.swing.JButton");
			
		} catch (ClassNotFoundException e) { 
			
			String failure = "Sorry, pero esta version necesita un Java Runtime based on Java JDK 1.1 or later";
			System.err.println(failure);
			throw new IllegalArgumentException(failure);
		
		}

		System.out.println("Happy de informar que this Java Runtime is ok for MyApp");
		return;
	}

}

