package com.others;

public class GetEnv {

	public static void main(String[] args) {
		/*
		 * Devuelve todas las variables de entorno en forma de String Map no modificable. 
		 * 
		 */
		System.out.println("System.getenv(\"PATH\") = " +
		System.getenv("PATH"));

	}

}
