package com.others;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class RE {

    public static void main(String[] args) throws PatternSyntaxException{

        String pattern = "^Q[^u]\\d+\\.";
        String input = "QA777. es el próximo vuelo. It is on time.";   

        Pattern p = Pattern.compile(pattern);

        // contenido de Pattern p
        System.out.println("to string: " + p.toString()); // ^Q[^u]\d+\

        Matcher m = p.matcher(input);
        
        // contenido de Matcher m
        System.out.println("to string: " + m.toString()); // java.util.regex.Matcher[pattern=^Q[^u]\d+\. region=0,42 lastmatch=]

        boolean found = m.lookingAt();

        System.out.println("encontro: " + found); // true

        System.out.println("'" + pattern + "'" + (found ? " matches '" : " doesn't match '") + input + "'"); // '^Q[^u]\d+\.' matches 'QA777. es el próximo vuelo. It is on time.'

        boolean b = Pattern.matches("a*b", "aaaaab");
        System.out.println((b? " matches " : " doesn't match '")); // matches  


        String s = p.pattern();
        System.out.println("s: " + s); // s: ^Q[^u]\d+\.

        // Returns the offset after the last character matched.
        int iend = m.end();
        System.out.println("iend: " + iend); // 6

    }
    
}
