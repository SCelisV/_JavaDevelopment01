package com.others;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// Lee un fichero e imprime su salida implementando try catch en el main

public class LeerEImprimirFichero {

    // Procesa un archivo, dado un BufferedReader abierto 
	public static void process(BufferedReader is){

        try {
        	
			String inputLine;

            while((inputLine = is.readLine()) != null){

                System.out.println(inputLine);
            }

		    is.close();

            
		} catch (IOException e) {
			System.out.println("IOException: " + e);
		}

    }
    
    public static void main(String[] args) {
        
        FileReader fr = null;
		try {
			fr = new FileReader("/home/hadoop/eclipse-workspace/javasrc-main/src/com/others/fileReader.txt");
		} catch (FileNotFoundException e) {
			System.out.println("reemplazo el throw FileNotFoundException por try/catch e imprimo la cola ");
			System.out.println("\n");
			e.printStackTrace();
		}
		BufferedReader br = new BufferedReader(fr);    

        process(br);

    }
}
