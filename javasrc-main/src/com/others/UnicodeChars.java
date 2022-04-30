package com.others;
/*
 * Conversión entre caracteres Unicode y Strings
 * Utiliza el calculo de chars para controlar un bucle y adjuntar también los caracteres en un StringBuilder
 */
public class UnicodeChars {

    public static void main(String[] args) {

       StringBuilder sb = new StringBuilder(); 
      
       // adiciona los char (a, b, c)
       for(char c = 'a'; c<'d'; c++){
            System.out.println("c: " + c);
            // public StringBuilder append​(char c)
            // Appends the string representation of the char argument to this sequence. 
            sb.append(c);
            System.out.println("sb: " + sb);
       }
       /*
        c: a
        sb: a
        c: b
        sb: ab
        c: c
        sb: abc
       */

       // StringBuilder append​(char c)
       // Appends the string representation of the char argument to this sequence. 
       sb.append('\u00a5'); // Símbolo del yen japonés ¥
       sb.append('\u01FC'); // AE romano con acento agudo Ǽ
       sb.append('\u0391'); // Alfa mayúscula Α
       sb.append('\u03A9'); // Omega mayúscula Ω

       // StringBuilder 	append​(String str) 	
       // Appends the specified string to this character sequence.
       sb.append("sonia"); // sonia
       
       for (int i=0; i<sb.length(); i++){
            // Returns the char value at the specified index.
            // char 	charAt​(int index) 	
            System.out.println("Character #" + i + " is: " + sb.charAt(i));
       }
       /*
        Character #0 is: a
        Character #1 is: b
        Character #2 is: c
        Character #3 is: ¥
        Character #4 is: Ǽ
        Character #5 is: Α
        Character #6 is: Ω
        Character #7 is: s
        Character #8 is: o
        Character #9 is: n
        Character #10 is: i
        Character #11 is: a
        */
       System.out.println("los characters acumulados son: " + sb); // los characters acumulados son: abc¥ǼΑΩsonia
    }
}