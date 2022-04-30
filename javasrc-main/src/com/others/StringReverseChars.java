package com.others;

public class StringReverseChars {

    public static void main(String[] args) {

    String s = "Sonia Celis esta haciendo una prueba";
    System.out.println("input string: " + s);		// input string: Sonia Celis esta haciendo una prueba
    /*
    StringBuilder​(String str) 	
    Constructs a string builder initialized to the contents of the specified string.
    */
    StringBuilder sb = new StringBuilder(s);        
    System.out.println("StringBuilder: " + sb.reverse());	// StringBuilder: abeurp anu odneicah atse sileC ainoS
    }


}
