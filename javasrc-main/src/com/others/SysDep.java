package com.others;

public class SysDep {
	/*
	 * Algunos sistemas operativos proporcionan un mecanismo denominado
	 * "el dispositivo nulo", que permite descartar los resultados (normalmente utilizado para calcular el tiempo)
	 * Pregunta a las propiedades del sistema por os.name y 
	 * utiliza esta propiedad para configurar un nombre (en este caso junk), que se pueda utilizar para descartar datos.
	 * Si no se conoce ningún dispositovo nulo para la plataforma dada, se devuelve un nombre no deseado,
	 * lo que significa que en tales plataformas, se crean, ocasionalmente, archivos no deseados 
	 */
	public static String getDevNull() {
        String sys = System.getProperty("os.name");
        if (sys == null){
            return "junk";
        }
        if (sys.startsWith("Windows")){
            return "NUL";
        }
        return "/dev/null";
	}

}
