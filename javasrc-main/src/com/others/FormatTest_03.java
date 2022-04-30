package com.others;

public class FormatTest_03{

        public final static StringBuffer espacios(StringBuffer sb, int cuantos){
            // System.out.println("\n" + sb.toString());
            // System.out.println("\n" + cuantos);
            for (int i=0; i<cuantos; i++)
                sb.append('-');
            return sb;
        }

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();
        String s = "esta es la cadena que quiero centrar";

        int maxChars = 132;

        String cadena = s.substring(0, Math.min(s.length(), maxChars));
        System.out.println("cadena: " + cadena);

        char just = 'c';

        switch (just) {
            case 'l':
                sb.append(cadena);
                espacios(sb, maxChars - cadena.length());
                break;
            case 'r':
                espacios(sb, maxChars - cadena.length());
                sb.append(cadena);
                break;
            case 'c':
                int startPos = sb.length(); 
                System.out.println("startPost: " + startPos);
                espacios(sb, (maxChars - cadena.length())/2);
                sb.append(cadena);
                espacios(sb, (maxChars - cadena.length())/2);
                // Ajuste para el "error de redondeo"
                // System.out.println("maxChars: " + maxChars);
                // System.out.println("sb.length(): " + sb.length());
                // System.out.println("startPost: " + startPos);
                espacios(sb, (maxChars - sb.length() - startPos));
                break;
        
            default:
                break;
        }

        System.out.println("1234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890");
        System.out.println("\n" + sb.toString());

    }
    
}
