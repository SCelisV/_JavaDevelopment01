package com.others;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * Leer un fichero
 */

public class ReadFile{

    public static final String FILE = "/home/hadoop/eclipse-workspace/javasrc-main/src/com/others/fileReader.txt";

    public static void main(String[] args) {

        try {
            FileReader fr = new FileReader(FILE);
		    BufferedReader br = new BufferedReader(fr);    
            String strLinea;
			while ((strLinea = br.readLine()) != null){
					System.out.println("strLinea: " + strLinea);
					/*
					 * strLinea: Este es un archivo que he creado para utilizar en la clase ChekSum.java para realizar una suma de comprobación del fichero, y/o ChekSum
					 */
			}
			br.close();

	    } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
/*
En este caso el fichero /home/hadoop/eclipse-workspace/javasrc-main/src/com/others/fileReader.txt contiene:
Este es un archivo que he creado para utilizar en la clase ChekSum.java para realizar una suma de comprobación del fichero, y/o ChekSum
*/