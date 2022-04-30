package com.others;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* REGEXP - Expresiones Regulares
 * El patrón más implicado empleado en la coincidencia de CSV consta de tres alternativas:
 * - busca un campo con comillas, 
 * - busca un campo sin comillas,
 * - busca un campo nulo. 
 */
public class CSVRE{

    public static final String CSV_PATTERN = "\"([^\"]+?)\",?|([^,]+),?|,";
    private static Pattern csvRE;

    /*
     * construye una expresión regular basada en un analizador CSV
     */
    public CSVRE(){
        csvRE = Pattern.compile(CSV_PATTERN);
    }

    /** Procesa un archivo.
     * Delega en parse() linea a linea
     */
    public void process(BufferedReader in) throws IOException{
        String line;

        // para cada línea
        while ( (line = in.readLine()) != null){
            System.out.println("\nline = `" + line + "'");
            List l = parse(line);

            System.out.println("\nencontrados: " + l.size() + " items.");
            for (int i = 0; i < l.size(); i++){
                System.out.println(l.get(i));
            }
            System.out.println();
        }
    }


    /** Analiza una línea
     * @devuelve una lista de Strings, menos las comillas dobles
     */
    private List parse(String line) {
        List list = new ArrayList();
        Matcher m = csvRE.matcher(line);

        // para cada campo
        while(m.find()){
            String match = m.group();
            System.out.println("\n m.group(): " + match);
            if (match == null)
                break;
            if (match.endsWith(",")){ // Si termina con ',' 
                match = match.substring(0, match.length() -1); // quita la coma
                System.out.println("\n match.endsWith: " + match);
            }
            if (match.startsWith("\"")){ // Si inicia con ", asume que termina con " 
                match = match.substring(1, match.length() -1); // quita las comillas de los extremos
                System.out.println("\n match.starsWith: " + match);
            }
            if (match.length() == 0){
                match = null;
                System.out.println("\n match.length: " + match);
            }

            list.add(match);
        }

        return list;
    }

    /*
     * Cada vez que pulse "Enter", se ejecutará el analizador de línea
     */
    public static void main(String[] args) throws IOException{
        System.out.println("CSV_PATTERN: " + "\n" + CSV_PATTERN);
        new CSVRE().process(new BufferedReader(new InputStreamReader(System.in)));
    }
    
}