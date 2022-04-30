package com.others;

/*
 * El compilador construye de forma implícita un StringBuilder de forma automática y utiliza sus métodos append
 * Un objeto de una de las clases StringBuilder mutable representa básicamente a un conjuto de caracteres.
 * StringBuilders son mutables y están diseñadas para generar Strings.
 * Normalmente, se construye un StringBuilder, se ejecutan los métodos necesarios para obtener la secuencia de 
 * caracteres de la forma que se desee y, a continuación, se llama a toString() para generar una cadena que 
 * represente la misma secuencia de caracteres que se utilizará en la mayoria de API de Java, que se muestra 
 * en Strings.
 * Algunos de los métodos de StringBuffer(JDK 1.1) son sincronizados, que implica una sobrecarga innecesaria 
 * en una aplicación de un único subproceso. 
 * En la versión 5.0 esta clase se dividio en StringBuffer, (sincronizada) y StringBuilder (No Sincronizada),
 * por lo tanto, es más rápido y preferible para subprocesos únicos.
 * Otra nueva clase AbstractStringBulder, es la principal de ambas.
 * Todos los métodos que modifican más de un caracter de contenido de un StringBuilder 
 * (append, delete, deleteCharAt, insert, replace, reverse), 
 * devuelven una referencia al objeto que facilita la codificación
 */
/*
 * Construye la misma cadena de tres formas diferenes
 */
public class StringBufferTest {

	public static void main(String[] args) {
		String s1 = "Hello" + ", " + "World";
		System.out.println("s1: " + s1); 	// s1: Hello, World

		// Genera un StringBuffer y le añade algunos elementos
		StringBuffer sb2 = new StringBuffer();
		sb2.append("Hello");
		sb2.append(", ");
		sb2.append(" ");
		sb2.append("World");

		// Obtiene el valor de StringBuffer como String y lo imprime
		String s2 = sb2.toString();
		System.out.println("s2: " + s2); 	// s2: Hello,  World

		// De una forma más concisa y propia del mundo Java sería
		StringBuffer sb3 = new StringBuffer().append("Hello").append(", ").append(" ").append("World");
		System.out.println("sb3.toString(): " + sb3.toString()); 	// sb3.toString(): Hello,  World

	}

}

