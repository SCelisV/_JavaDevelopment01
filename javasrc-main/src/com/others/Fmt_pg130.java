package com.others;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Fmt_pg130 {
    
    // Ancho máx de la columna
    public static final int COLWIDTH = 72;

    // Archivo a leer
    BufferedReader in;

    /*
     * es aconsejable envolver un BufferedReader alrededor de cualquier Reader cuyas operaciones de read()
     * puedan ser costosas, como FileReaders e InputStreamReaders
     * construye un objeto Fmt dado un nombre de archivo
     */
    public Fmt_pg130(String fname) throws IOException{
        in = new BufferedReader(new FileReader(fname));
    }

    /*
     * Para una mayor eficiencia, considere envolver un InputStreamReader dentro de un BufferedReader.
     * construye un objeto Fmt dado un Stream
     */
    public Fmt_pg130(InputStream sname) throws IOException{
        in = new BufferedReader(new InputStreamReader (sname));
    }

    /*
     * Formatea el archivo
     */
    public void format() throws IOException{
        String w, f;
        int col = 0;
        while ( (w = in.readLine()) != null ){

            System.out.println("w: " + w);

        	if (w.length() == 0) { // no hay línea
                System.out.println("\n");
                if (col > 0){
                    System.out.println("\n");
                    col = 0;
                }
                continue;
        	}
            StringTokenizer st = new StringTokenizer(w);
            while (st.hasMoreTokens()){
                f = st.nextToken();

                if (col + f.length() > COLWIDTH){
                    //System.out.println("col+f.length: " + col + f.length());
                    //System.out.println("mayor 72");
                    System.out.println("\n");
                    col = 0;
                }
                System.out.println(f + " ");
                col += f.length() + 1;
                System.out.println("col: " + col);
            }

        }

        if (col > 0) System.out.println("\n");

        in.close();
    }
    public static void main(String[] args) throws IOException{
        if (args.length == 0)
            new Fmt_pg130(System.in).format();
        else for (int i=0; i<args.length; i++)
            new Fmt_pg130(args[i]).format();
    }
}