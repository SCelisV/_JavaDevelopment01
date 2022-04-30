package com.others;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringDesIdentar {

    // número de espacios que se suprimen
    private int nSpaces;

    StringDesIdentar(int n){
        nSpaces = n;
    }

    // procesa un fichero, dado un BufferedReader abierto
    public void process(BufferedReader is){

        try {
        	
            String inputLine;
            
            while( (inputLine = is.readLine()) != null){
            	
                int toRemove = 0;

                for(int i=0; i<nSpaces && i<inputLine.length(); i++)
                    // return boolean 
                    // Determines if the specified character is white space according to Java.
                    // isWhitespace​(char ch)
                    if(Character.isWhitespace(inputLine.charAt(i))) {
                    	++toRemove;
                        //System.out.println("toRemove: " + toRemove);
                    }

                
                System.out.println(inputLine.substring(toRemove));
                // System.out.println("inputLine: " + inputLine.substring(toRemove));

            }
            
            is.close();
            
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }

    }
    
    public static void main(String[] av) throws FileNotFoundException {
        
    	// Crear un objeto de la clase StringDesidentar para indicar los espacios que quiere eliminar por línea
        StringDesIdentar c = new StringDesIdentar(3);
        
        FileReader fr = new FileReader("/home/hadoop/eclipse-workspace/javasrc-main/src/com/others/fileReader02.txt");
        

        switch (av.length) {

            case 0: c.process(new BufferedReader(fr));
                // System.out.println("case 0 - av.length: " + av.length);
                break;
                
             /*
              * Si quito esta parte también funciona
              */
            default:

                System.out.println("default - av.length: " + av.length);
                for(int i=0; i<av.length; i++)
                	
                try {
                   c.process(new BufferedReader(new FileReader(av[i]))); 
                } catch (FileNotFoundException e) {
                    System.err.println(e);
                }
                
        }
        


    }
}
