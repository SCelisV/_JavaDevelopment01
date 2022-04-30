package com.others;

import java.util.StringTokenizer;

public class StringTokenizerTest_03{
    public static void main(String[] args) {

        StringTokenizer st = new StringTokenizer("Sonia Celis esta haciendo una prueba");
            while (st.hasMoreTokens()) {
                System.out.println("StringTokenizer: " + st.nextToken());
            }
            /*
             * StringTokenizer: Sonia
             * StringTokenizer: Celis
             * StringTokenizer: esta
             * StringTokenizer: haciendo
             * StringTokenizer: una
             * StringTokenizer: prueba
             */

        // Con String 

        String s = new String("Sonia Celis esta haciendo una prueba");
        String[] result = s.split("\\s");
        for (int x=0; x<result.length; x++)
            System.out.println("String: " + result[x]);
            /*
             * String: Sonia
             * String: Celis
             * String: esta
             * String: haciendo
             * String: una
             * String: prueba
             */
    }
}



