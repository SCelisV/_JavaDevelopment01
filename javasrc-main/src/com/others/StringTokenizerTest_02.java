package com.others;

import java.util.*;

/*
 * Muestra el uso de un StringTokenizer, incluido el hecho de obtener de nuevo los delimitadores
 * Los campos vacios se gestionan correctamente
*/

public class StringTokenizerTest_02 {

	public final static int MAXFIELDS = 5;
	public final static String DELIM = "|";

	/** Procesa una cadena; la devuelve como una matriz de cadenas */
	public static String[] process(String line){

		String[] results = new String[MAXFIELDS];

		// Si no se le pide a StringTokenizer que proporcione los tokens
		// descarta silensiosamente varios nulos
		StringTokenizer st = new StringTokenizer(line, DELIM, true);

		// Coloque cada token en la ranura actual de la matriz
		int i = 0;
		while(st.hasMoreTokens()){
			String s = st.nextToken();
			if (s.equals(DELIM)){
				if (i++ >= MAXFIELDS)
				throw new IllegalArgumentException("Input line " + line + " has too many fields");
				continue;
			}
			results[i] = s;
		}
		return results;
	}

	public static void printResults(String input, String[] outputs){
		System.out.println("Input: " + input);
		for(int i=0; i<outputs.length; i++)
			System.out.println("Output: " + i + " era: " + outputs[i]);
	}


	public static void main(String[] args) {
		printResults("A|B|C|D", process("A|B|C|D"));
/*
Input: A|B|C|D
Output: 0 era: A
Output: 1 era: B
Output: 2 era: C
Output: 3 era: D
Output: 4 era: null
*/
		printResults("A||C|D", process("A||C|D"));
/*
Input: A||C|D
Output: 0 era: A
Output: 1 era: null
Output: 2 era: C
Output: 3 era: D
Output: 4 era: null
*/
		printResults("A|||D|E", process("A|||D|E"));
/*
Input: A|||D|E
Output: 0 era: A
Output: 1 era: null
Output: 2 era: null
Output: 3 era: D
Output: 4 era: E
*/
	}
}
