package com.others;

import java.util.Calendar;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class FormatTest_02 {

	public static void main(String[] args) {

		int number = 1234;
		Formatter fmt = new Formatter();
		// alinear a la izquierda
		fmt = fmt.format("Contenido %-4d unidades.", number);	
		System.out.println(fmt.toString());			// Contenido 1234 unidades.

		// Left justifies - justifica a la Izquierda
		String formateado = String.format("Contenido %-8d unidades", number);		
        System.out.println(formateado);				// Contenido 1234     unidades

		// justifies - justifica a la Right
		String formateado_R = String.format("Contenido %8d unidades", number);		
        System.out.println(formateado_R);			// Contenido     1234 unidades

		// Constructor
		// StringBuilder()
		StringBuilder sb = new StringBuilder();
   		// Send all output to the Appendable object sb
		// le aplico el método append al objeto append(String str) que me retorna un StringBuilder
		sb.append("adiciono");
		sb.append(" ");
		sb.append("un");
		sb.append(" ");
		sb.append("String");
		sb.append(" ");
		sb.append("al");
		sb.append(" ");
		sb.append("objeto");
		sb.append(" ");
		sb.append("StringBuilder");

		/*
		 * ó de otra manera ... 
		 */
		// Constructor
		// StringBuilder()
		// método append(String str) que devuelve un StringBuilder
		StringBuilder sb2 = new StringBuilder().append("").append("nuevo").append(" ").append("StringBuilder").append(" ").append("y").append(" ").append("adiciono").append(" ").append("el").append(" ").append("anterior").append(": ").append(sb);

		// Devuelve la clase del objeto
		// getClass()
		System.out.println("getClass(): " + sb2.getClass());
				
		// convierte el objeto StringBuilder a String y lo imprime
		String s2 = sb.toString();
		System.out.println("\n s2: " + s2);			// adiciono un String al objeto StringBuilder
		
		String s3 = sb2.toString();
		System.out.println("\n s3: " + s3); 		// s3: nuevo StringBuilder y adiciono el anterior: adiciono un String al objeto StringBuilder

		// formato para imprimir el objeto: 
		// %[argument_index$][flags][width][.precision]conversion
		// %'t', 'T' --> date/time conversion

		// devuelve un PrintStream 	
		//         printf(String format, Object... args)
		System.out.printf("\n Hora local hh:mm:ss: %tT ", Calendar.getInstance());	//  Hora local: 16:32:21 
		
		//                                                             D Date formatted as "%tm/%td/%ty"
		System.out.printf("\n Fecha local mm/dd/yy: %tD ", Calendar.getInstance());	//  Fecha local: 04/05/22

		// Constructor
        // GregorianCalendar(int year, int month, int dayOfMonth)
		Calendar c = new GregorianCalendar(1968, 04, 06);
		TimeZone tm = c.getTimeZone();
		String stm = tm.toString();
		System.out.println("\n stm: " + stm);			
		
		// sun.util.calendar.ZoneInfo[id="Europe/Madrid",offset=3600000,dstSavings=3600000,useDaylight=true,transitions=163,lastRule=java.util.SimpleTimeZone[id=Europe/Madrid,offset=3600000,dstSavings=3600000,useDaylight=true,startYear=0,startMode=2,startMonth=2,startDay=-1,startDayOfWeek=1,startTime=3600000,startTimeMode=2,endMode=2,endMonth=9,endDay=-1,endDayOfWeek=1,endTime=3600000,endTimeMode=2]] 
	
		System.out.println("YEAR: " + c.get(Calendar.YEAR)); 					// YEAR: 1968
 		System.out.println("MONTH: " + c.get(Calendar.MONTH)); 					// MONTH: 4
 		System.out.println("DAY_OF_MONTH: " + c.get(Calendar.DAY_OF_MONTH)); 	// DAY_OF_MONTH: 6

		if (((GregorianCalendar) c).isLeapYear(c.get(Calendar.YEAR)))
			System.out.println("\n Es bisiesto: " + c.get(Calendar.YEAR));	 	// Es bisiesto: 1968	
		else
			System.out.println("\n NO es bisiesto: " + c.get(Calendar.YEAR));			


		// String s5 = c.toString();
		// System.out.println("\n s5: " + s5);	veo el objeto Calendar pero como String
		
		// String(String original)
		// método          format(String format, Object... args) devuelve un static String
		String s4 = String.format("Sonia's Birthday: %1$tY %1$tm,%1$td", c);
		System.out.println("\n s4: " + s4);			//  s4: Sonia's Birthday: 1968 05,06
		
		
		int ancho = 132;		// Tamaño del registro
		int longitud = s3.length();	// longitud del texto
		
		System.out.println("\n longitud: " + longitud);		//	longitud: 86
		
		int espacios = (ancho - longitud) / 2;
		
		//System.out.println("\n" + )
		
		
	}

}
