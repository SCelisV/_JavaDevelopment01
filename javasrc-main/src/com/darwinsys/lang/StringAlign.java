package com.darwinsys.lang;

import java.text.FieldPosition;
import java.text.Format;
import java.text.ParsePosition;

public class StringAlign extends Format{

    // Definición de las constantes para justificar
    public static final int JUST_LEFT = 'l';
    public static final int JUST_CENTRE = 'c';
    public static final int JUST_RIGHT = 'r';

    // justificación actual
    private int just;
    // longitud máx actual
    private int maxChars;

    // Constructor
    public StringAlign (int just, int maxChars){
        switch (just) {
            case JUST_LEFT:
            case JUST_CENTRE:
            case JUST_RIGHT:
                this.just = just;
                break;
            default:
                throw new IllegalArgumentException("justificación invalida");
        }
        if (maxChars < 0){
            throw new IllegalArgumentException("maxChars debe ser positivo");
        }
        this.maxChars = maxChars;
    }

    /** Tiene que implementar este método abstracto de la clase Format
    * Formatea una cadena
    * @param arg0 - la cadena que se va a alinear
    * @param arg1 - el StringBuffer al que se añadira
    * @param arg2 - un campo de posisicon, puede ser null, no especificada
    */
    public StringBuffer format(Object obj, StringBuffer sb, FieldPosition fp) {

        // convierto a string el objeto pasado
        String s = (String)obj;
        String cadena = s.substring(0, Math.min(s.length(), maxChars));

        // colocar los espacios en el sitio adecuado
        switch (just) {
            // adiciona la cadena al sb y luego los espacios
            case JUST_RIGHT:
                add_espacios(sb, maxChars - cadena.length());
                sb.append(cadena);
                break;
        
            // adiciona los espacios al sb y luego la cadena
            case JUST_LEFT:
                sb.append(cadena);
                add_espacios(sb, maxChars - cadena.length());
                break;

            // adiciona los espacios al sb y luego la cadena
            case JUST_CENTRE:
                int startPos = sb.length();
                add_espacios(sb, (maxChars - cadena.length())/2);
                sb.append(cadena);
                add_espacios(sb, (maxChars - cadena.length())/2);
                // Ajuste pare el "error de redondeo"
                add_espacios(sb, (maxChars - (sb.length() - startPos)));
                break;

        }

        return sb;
    }

    private void add_espacios(StringBuffer sb, int espacios) {
        for (int i=0; i<espacios; i++)
            sb.append(' ');
    }

    // Tiene que implementar este método abstracto de la clase Format
    public Object parseObject(String arg0, ParsePosition arg1) {
        // es requerio pero no es útil
        return arg0;
    }
    
}