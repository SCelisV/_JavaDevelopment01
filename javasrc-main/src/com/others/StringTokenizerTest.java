package com.others;

import java.util.StringTokenizer;

/*
 * Los métodos de StringTokenizer implementan el patrón de diseño Iterator
 * StringTokenizer implementa la interfaz Enumeration directamente 
 * pero si se utiliza los métodos deberá convertir los resultados a String
 */

public class StringTokenizerTest {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("Hello World of Java");
		while (st.hasMoreTokens())
			System.out.println("Token: " + st.nextToken());		/*
																 *	Token: Hello
																 *	Token: World
																 *	Token: of
																 * 	Token: Java
																 */
		
		/*
		 * En algunas ocasiones es posible realizar la separación en otro carácter
		 */
		StringTokenizer st_02 = new StringTokenizer("Hello, World|of|Java", ", |");
		while (st_02.hasMoreElements())
			System.out.println("Token: " + st_02.nextElement());		/*
																 	 	 *	Token: Hello
																 	 	 *	Token: World
																 	 	 *	Token: of
																 	 	 * 	Token: Java
																 	 	 */
		/*
		 * En este caso tenemos delimitadores consecutivos adyacentes, conservar campos vacios..etc
		 * Para ver los delimitadores como Tokens, adicionar true
		 */
		StringTokenizer st_03 = new StringTokenizer("Hello, World|of|Java", ", |", true);
		while (st_03.hasMoreElements())
			System.out.println("Token: " + st_03.nextElement());		/*
                                                                         * Token: Hello
                                                                         * Token: ,
                                                                         * Token:  
                                                                         * Token: World
                                                                         * Token: |
                                                                         * Token: of
                                                                         * Token: |
                                                                         * Token: Java
                                                                        */
		
	}
}