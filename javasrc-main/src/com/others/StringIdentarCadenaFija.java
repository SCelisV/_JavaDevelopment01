package com.others;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/* Sangria
 * Genera un String de longitud fija y la antepone a cada línea de salida.
 */

public class StringIdentarCadenaFija {

    // Procesa un archivo, dado un BufferedReader abierto 
	public static void process(BufferedReader is){

        try {
        	
			String inputLine;
			String cadenaFija = "    ";
            int nSpaces = 10;
            while((inputLine = is.readLine()) != null){

                System.out.print(cadenaFija);
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
