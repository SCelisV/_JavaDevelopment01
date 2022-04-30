//+
package testing;

public class spc {

	/*
	 * //- y //+ Utilizados en la clase GetMark.java
	 */
        public final static StringBuffer espacios(StringBuffer sb, int cuantos){
        //-
        	// System.out.println("\n" + sb.toString());
            // System.out.println("\n" + cuantos);
        //+
            for (int i=0; i<cuantos; i++)
                sb.append('-');
            return sb;
        }

    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer();
        String s = " esta es la cadena que quiero centrar   ";

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
                //-
                // Ajuste para el "error de redondeo"
                // System.out.println("maxChars: " + maxChars);
                // System.out.println("sb.length(): " + sb.length());
                // System.out.println("startPost: " + startPos);
                //+
                espacios(sb, (maxChars - sb.length() - startPos));
                break;
        
            default:
                break;
        }

        System.out.println("1234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890123456789012345678901234567890");
        System.out.println("\n" + sb.toString());

        System.out.println("separador de linea del sistema: " + System.getProperty("line.separator"));
        
        System.out.println("cadena: " + cadena); 
        //- 
        // cadena:  esta es la cadena que quiero centrar
        //+
        System.out.println("cadena.trim: " + cadena.trim()); 
        //- 
        // cadena.trim: esta es la cadena que quiero centrar
        //+	
    }
    
}

/*

npi



		int longDoc = 132;
		System.out.println("longDoc: " + longDoc);
		String sInput = string;
		System.out.println("sInput: " + sInput);
		int min = Math.min(sInput.length(), longDoc);
		System.out.println("min: " + min);
		
		String sOutput = sInput.substring(0, Math.min(sInput.length(), longDoc));

npi

int ancho = 20;//Tamaño del campo a ocupar por la cadena
String s = "12345678";//Texto
int lonText=s.length();//longitud del texto
//Se divide el ancho/2  y tamañoCampo/2
//en este caso serian 5 y 2 se suman y da 5+2=7 sacamos la mitad del tamaño a ocupar
int tamañoCampo=(ancho/2)+(lonText/2);
 
//Se da el primer formateo a (s) con el tamañoCampo=7 lo que seria [***1234]
//ponemos asteriscos por la izquierda para llenar el total del campo
//String.format("%7s",s) Justifica el texto a la derecha rellenado con espacios
String m= String.format("%" + tamañoCampo + "s", s);
s = String.format("%" + tamañoCampo + "s", s).replace(" ","*");
 
System.out.print("["+s+"] Primer formateo\n");
System.out.print("|"+m+"|Primer formateo\n");
//Se da el segundo formateo a (s) con ancho.Tenemos que s="***1234"=7
//Con el segundo formato se quedaria s="***1234***"=10
//ponemos asteriscos por la derecha para llenar el total del campo
//String.format("%-10s",s) Justifica el texto a la izquierda rellenado con espacios
s = String.format("%-" + ancho  + "s", s).replace(" ","*");
m = String.format("%-" + ancho + "s", m);
System.out.print("["+s+"] Segundo formateo ");
 System.out.print("\n|"+m+"|Segundo formateo\n\n");

 */