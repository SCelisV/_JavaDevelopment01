package com.others;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/* Crea una sangría, utilizando un bucle for para imprimir un número 'n' de espacios antes de cada linea
 */

public class StringIdentar {

    // Procesa un archivo, dado un BufferedReader abierto 
	public static void process(BufferedReader is){

        try {
        	
			String inputLine;

            int nSpaces = 5;
            while((inputLine = is.readLine()) != null){

                for (int i=0; i<nSpaces; i++) System.out.print(' ');
                System.out.println(inputLine);
            }

		    is.close();

            
		} catch (IOException e) {
			System.out.println("IOException: " + e);
		}

    }
    
    public static void main(String[] args) throws FileNotFoundException {
        
        FileReader fr = new FileReader("/home/hadoop/eclipse-workspace/javasrc-main/src/com/others/fileReader.txt");
		BufferedReader br = new BufferedReader(fr);    

        process(br);

    }
}
