package com.others;

import java.util.Stack;
import java.util.StringTokenizer;

public class StringReverseLIFOChars {

    public static void main(String[] args) {

        String s = "Sonia Celis esta haciendo una prueba";
        System.out.println("input string: " + s);		// input string: Sonia Celis
        
        // Se coloca en la pila
        Stack myStack = new Stack();
        StringTokenizer st = new StringTokenizer(s);

        while (st.hasMoreTokens()) {
            myStack.push(st.nextElement());
        }


        // Imprime la pila
        while(!myStack.empty()){
            System.out.println("pila: " + myStack.pop());
        }
        
        /*
         * pila: prueba
         * pila: una
         * pila: haciendo
         * pila: esta
         * pila: Celis
         * pila: Sonia
         */

    }
    
}
