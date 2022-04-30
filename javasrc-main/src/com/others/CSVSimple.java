package com.others;

import java.util.Iterator;
import java.util.List;

public class CSVSimple {
    public static void main(String[] args) {
         /*
          * El método parse de la clase CSV divide el String de entrada en campos
          * @devuelve java.util.Iterator que contiene cada campo del original en forma de String en orden.
          * 
          */
    	/*
    	 * para probar el método parse.conComillas descomente el siguiente código:
                                           1         2         3         
                                  123456789012345678901234567890123456789
                                  "LU",86.25,"11/4/1998","2:19PM",+4.0625
    	 */
        /*

        CSV parser = new CSV();
        List list = parser.parse("\"LU\",86.25,\"11/4/1998\",\"2:19PM\",+4.0625");

        */


        /*
        para probar el método parse.sinComillas descomente el siguiente código:
                                  123456789012345678901234567890123
                                  LU-86.25-11/4/1998-2:19PM-+4.0625
        */

    	/*

        CSV parser = new CSV('-');
        List list = parser.parse("LU-86.25-11/4/1998-2:19PM-+4.0625");

    	 */

        Iterator it = list.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
    
}
