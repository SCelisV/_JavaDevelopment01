package com.others;

import java.util.ArrayList;
import java.util.List;

public class CSV {

    private static final char DEFAULT_SEP = ',';

    /*
     * Constructor con un separador predeterminado 
     */
	public CSV(){
        this (DEFAULT_SEP);
    }

	private char cSep;
    /*
     * Constructor con un separador dado
     * @param sep,  el caracter separador
     */
	public CSV(char sep){
        cSep = sep;
    }
    
	/*
	 * Lista de campos de la que se puede obtener un Iterator para controlar el bucle y su método next() para obtener el objeto siguiente.
	 */
    private List list = new ArrayList();
    
    /*
     * El método parse divide el String de entrada en campos
     * @devuelve java.util.Iterator que contiene cada campo del original en forma de String en orden.
     */
    public List parse(String line) {
    
    	/*
    	 * Un StringBuffer es como un String, pero puede ser modificado. 
    	 * En cualquier momento contiene una secuencia particular de caracteres, 
    	 * pero la longitud y el contenido de la secuencia pueden ser cambiados a través de ciertas llamadas a métodos.
    	 */
        // Constructs a string buffer with no characters in it and an initial capacity of 16 characters.
    	StringBuffer sb = new StringBuffer();
    	list.clear();
    	int i = 0;
    	
    	if(line.length() == 0) {
            list.add(line);
            return list;
    	}
  
        do {
            sb.setLength(0);
            
            System.out.println("i: " + i);

            if (i < line.length() && line.charAt(i) == '"')
                i = conComillas(line, sb, ++i);
            else
                i = sinComillas(line, sb, i);

            System.out.println("i: " + i);

            list.add(sb.toString());
            System.out.println("csv: " + sb.toString());
            i++;
            
        } while (i < line.length());

		return list;
    	
    }

    /*
     * Campo sin comillas; devuelve el indice del separador siguiente
       se analiza una linea del tipo: ("LU;86.25;11/4/1998;2:19PM;+4.0625");
     */
	private int sinComillas(String line, StringBuffer sb, int i) {
        System.out.println("sin comillas: " + line + " " + sb + "" + i);

        int j;
        j = line.indexOf(cSep, i); // busca el separador
        System.out.println("j: " + j);

        if (j == -1){ // No encontro nada
            System.out.println("line.substring(i): " + line.substring(i));
            sb.append(line.substring(i));
            System.out.println("i: " + i + " j: " + j);
            return line.length();
        } else {
            System.out.println("line.substring(i, j): " + line.substring(i, j));
            sb.append(line.substring(i, j));
            System.out.println("i: " + i + " j: " + j);
            return j;
        }
	}

	/*
     * Campo con comillas; devuelve el indice del separador siguiente
       se analiza una linea del tipo:(""LU",86.25,"11/4/1998","2:19PM",+4.0625");
	 */

	private int conComillas(String line, StringBuffer sb, int i) {
        System.out.println("con comillas: " + line + " " + sb + "" + i);

        int j;
        int len = line.length();
        System.out.println("line.length: " + len);
        for (j=i; j<len; j++){
            System.out.println("i: " + i + " j: " + j);
            if(line.charAt(j) == '"' && j+1 < len){
                if (line.charAt(j) == '"'){
                    j++; // salta las comillas
                } else if (line.charAt(j+1) == cSep){
                    j++; // omite las comillas finales
                    break;
                }
            } else if(line.charAt(j) == '"' && j+1 == len){ // comillas del final de la línea
                    break;
            }
            sb.append(line.charAt(j)); // caracter normal
        }
		return j;
	}

}
