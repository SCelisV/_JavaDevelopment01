package com.darwinsys.strings;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.io.PrintStream;

/*
 * GetMark es una herramienta general para incluir/excluir partes de un archivo.
 * Se puede utilizar, por ejemplo, para extraer partes de un archivo para su 
 * en la documentación, o para eliminar partes de un archivo como la parte de trabajo
 * de una solución.
 */
public class GetMark {

	/** La marca de inicio por default.  comienza a imprimirse */
	public final String START_MARK = "//+"; 

	/** La marca de final por default.  deja de imprimirse */
	public final String END_MARK = "//-";

    /**
     * Establezca esto a TRUE para ejecutar en modo "exclude" (por ejemplo, para
	 * construir ejercicios a partir de soluciones) y a FALSE para ejecutar
	 * en modo "extract" (por ejemplo, escribiendo un libro y omitiendo las
	 * las importaciones y las "clases públicas")
     */
	public final static boolean START = true;

	/** True si estamos actualmente dentro de las marcas */
	protected boolean printing = START;

	/** True si quieres números de línea*/
	protected final boolean number = false;

	/** Obtener partes marcadas de un archivo, dado un LineNumberReader abierto.
	 * Esta es la operación principal de esta clase, y puede ser utilizada
	 * dentro de otros programas o desde main().
	 */
	public void process(String fileName, 
                        LineNumberReader is, 
                        PrintStream out) {

		int nLines = 0;
		try {
			String inputLine;

			while ((inputLine = is.readLine()) != null) {

				if (inputLine.trim().equals(START_MARK)) {
					if (printing)
						// van a stderr, así que puede redirigir la salida
						System.err.println("ERROR: START INSIDE START, " +
							fileName + ':' + is.getLineNumber());
					printing = true;
				} else if (inputLine.trim().equals(END_MARK)) {
					if (!printing)
						System.err.println("ERROR: STOP WHILE STOPPED, " +
							fileName + ':' + is.getLineNumber());
					printing = false;
				} else if (printing) {
					if (number) {
						out.print(nLines);
						out.print(": ");
					}
					out.println(inputLine);
					++nLines;
				}
			}
			is.close();

			out.flush(); // No debe cerrarse - la persona que llama todavía puede necesitarlo

			if (nLines == 0)
				System.err.println("ERROR: No marks in " + fileName + "; no output generated!");

        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }
    }

	/** Este sencillo programa principal se encarga de los nombres de los archivos y
	 * abrir archivos y cosas por el estilo, cuando GetMark está siendo utilizado de forma autónoma.
	 */
	public static void main(String[] args) {

        // Crea una instancia de GetMark
		GetMark o = new GetMark();
		PrintStream pw = new PrintStream(System.out);

	// Si no le paso parametros a la clase espera a que le escriba el nombre del fichero por el teclado
	if (args.length == 0) {
		
		o.process("standard input", new LineNumberReader(
			new InputStreamReader(System.in)), pw);
		} else {
			for (int i=0; i<args.length; i++)
				try {
					o.process(args[i],
						new LineNumberReader(new FileReader(args[i])), pw);
				} catch (FileNotFoundException e) {
					System.err.println(e);
				}
        }
    }
}
