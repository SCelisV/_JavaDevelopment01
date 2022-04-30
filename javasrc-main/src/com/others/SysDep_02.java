package com.others;

public class SysDep_02 {
	/*
	 * Algunos sistemas operativos proporcionan un mecanismo denominado
	 * "el dispositivo nulo", que permite descartar los resultados (normalmente utilizado para calcular el tiempo)
	 * Pregunta a las propiedades del sistema por os.name y 
	 * utiliza esta propiedad para configurar un nombre (en este caso junk), que se pueda utilizar para descartar datos.
	 * Si no se conoce ningún dispositovo nulo para la plataforma dada, se devuelve un nombre no deseado,
	 * lo que significa que en tales plataformas, se crean, ocasionalmente, archivos no deseados 
	 * 
	 * Hay otro caso en el que es necesario comprobar el sistema operativo.
	 * Mac OS X tiene una serie de utilidades de interfaz de usuario.
	 * Apple señala que busque la cadena mrj.version para determinar si OS X se encuentra en ejecución:
	 */
	public static String getDevNull() {
        String isMacOS = System.getProperty("mrj.version");
        System.out.println("isMacOS: " + isMacOS);
        /*
        if (isMacOS == null){
            return "junk";
        }
		*/

        return isMacOS;
        //return "/dev/null";
	}

}
