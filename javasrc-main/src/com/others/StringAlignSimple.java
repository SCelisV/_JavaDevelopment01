package com.others;

import com.darwinsys.lang.StringAlign;

// Alinea un número de página en una línea de 70 caracteres
public class StringAlignSimple {

    public static void main(String[] args) {

        // Construir un formateador para centrar cadenas
        StringAlign formatter = new StringAlign(StringAlign.JUST_CENTRE,70);

        System.out.println("1234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890");
        // Pruebelo con la página "i"
        System.out.println(formatter.format("- i -"));

        System.out.println("1234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890");
        // Pruebelo con la página 4. Dado que el formateador se ha optimizado para Strings, y no para números de página en concreto, es necesario convertir el número a String
        System.out.println(formatter.format(Integer.toString(4)));
        
    }
    
}