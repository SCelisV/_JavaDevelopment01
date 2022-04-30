package com.others;

import java.util.StringTokenizer;

/*
 * Convertir una lista de elementos en una lista separada por comas
 * Se puede llamar al método informativo hasMoreElements() de Enumeration ó
 * hasNext() de Iterator, más de una vez en cada elemento.
 * Funciona y evita que haya una coma adicional tras el último elemento de la lista
 */
public class StringBufferTest_02 {


	public static String getString() {

		StringTokenizer st = new StringTokenizer("Hello World Java is Great");

		StringBuffer sb4 = new StringBuffer();
		while (st.hasMoreElements()){
			sb4.append(st.nextToken());
			if (st.hasMoreElements())
				sb4.append(", ");
		}
		return sb4.toString();
	}


	public static void main(String[] args) {

		System.out.println("Token: " + getString() );		// Token: Hello, World, Java, is, Great

	}
}
