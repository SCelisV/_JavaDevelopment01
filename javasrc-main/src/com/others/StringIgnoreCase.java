package com.others;

/* String contiene métodos para trabajar con mayusculas: toUpperCase() y minusculas: toLowerCase()
 * que se pueden usar sin ó con argumento: toUpperCase(Locale locale), toLowerCase​(Locale locale)
 * Mientras que el método equals() indica si hay otra cadena que sea EXACTAMENTE igual.
 * equalsIgnoreCase() indica si todos los caracteres son los mismos con independencia de que esté escrito 
 * en MAYUSCULAS ó minusculas.
 * Aquí no se puede utilizar un locale, se utilizará el predeterminado por el sistema.
 */

public class StringIgnoreCase {

    public static void main(String[] args) {

        String name = "Sonia Celis";
        System.out.println("name: " + name);

        System.out.println("en MAYUSCULAS: " + name.toUpperCase());	// en MAYUSCULAS: SONIA CELIS
        System.out.println("en minusculas: " + name.toLowerCase());	// en minusculas: sonia celis

        String otroname = "sonia celis";
        System.out.println("otroname: " + otroname);

        if (name.equals(otroname))
            System.err.println("true - name.equals(otroname): " + name + " !equals " + otroname); 
        else
            System.err.println("false - name.equals(otroname): " + name + " equals " + otroname); // false - name.equals(otroname): Sonia Celis equals sonia celis

        if (name.equalsIgnoreCase(otroname))
            System.err.println("true - name.equalsIgnoreCase(otroname): " + name + " equalsIgnoreCase " + otroname); // true - name.equalsIgnoreCase(otroname): Sonia Celis equalsIgnoreCase sonia celis
        else
            System.err.println("false name.equalsIgnoreCase(otroname): " + name + " equalsIgnoreCase " + otroname);
        
    }
    
}
