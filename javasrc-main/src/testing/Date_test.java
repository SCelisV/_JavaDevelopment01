package testing;

import java.time.Instant;
import java.util.Date;

public class Date_test {

	public static void main(String[] args) {
		
		/*
		 * Date
		 * representa un instante específico en el tiempo, con precisión de milisegundos. 
		 * 1 day = 24 × 60 × 60 = 86400 seconds in all cases
		 * Sin embargo, en el UTC, aproximadamente una vez cada uno o dos años hay un segundo extra, llamado "segundo bisiesto".
		 * se añade siempre como último segundo del día, y siempre el 31 de diciembre o el 30 de junio
		 * La mayoría de los relojes de ordenador no son lo suficientemente precisos como para poder reflejar la distinción de los segundos bisiestos
		 * Hora media de Greenwich (GMT) <==> hora universal (UT)
		 * UTC se basa en un reloj atómico
		 * UT se basa en observaciones astronómicas, la rotación de la tierra no es uniforme, se ralentiza y acelera de forma complicada
		 * Un año y <==> entero y - 1900.  
		 * Un mes <==> entero de 0 a 11; 0 = enero, 1 = febrero, ..., 11 = diciembre.
		 * Una fecha (día del mes) <==> número entero de 1 a 31.  
		 * Una hora <==> número entero de 0 a 23.  
		 * Un minuto <==> número entero de 0 a 59.  
		 * Un segundo <==> número entero de 0 a 61; 60 y 61 para los segundos bisiestos. 
		 */

		/*
		 * Constructor 	
		 * Date() 	
		 * Crea un ojeto y lo inicializa para que represente la hora a la que fue asignado, medida al milisegundo más cercano
		 */
		Date myDateObj = new Date();
		System.out.println("new Date(): " + myDateObj);	// new Date(): Wed May 04 13:16:31 CEST 2022

		System.out.println("getTime: " + myDateObj.getTime()); // getTime: 1651675342363
		
		/*
		 * Constructor 	
		 * Date​(long date) 	
		 * Crea un objeto y lo inicializa para representar el número especificado de milisegundos desde la hora base estándar 
		 * es decir, el 1 de enero de 1970, 00:00:00 GMT.
		 */
	
		System.out.println("new Date(0L): " + new Date(0L));	// new Date(0L): Thu Jan 01 01:00:00 CET 1970

		 /*
		  * return Date
		  * from​(Instant instant) --> Obtains an instance of Date from an Instant object.
		  */
		System.out.println(Date.from(Instant.now()));	// Wed May 04 13:06:26 CEST 2022

		 /*
		  * return long 	
		  * getTime() --> number of milliseconds since January 1, 1970, 00:00:00 GMT represented by this Date object.
		  */

		Date myDateObj3 = new Date();
		long mylongObj = myDateObj3.getTime();
		System.out.println("Date.getTime: " + mylongObj);	// Date.getTime: 1651675342394

		/*
	 	 * void 
		 * setTime​(long time) --> Sets this Date object to represent a point in time that is time milliseconds after January 1, 1970 00:00:00 GMT.
	 	 */

		Date myDateObj2 = new Date();
		long mylongObj2 = 1661674670179L;
		myDateObj2.setTime(mylongObj2);
		System.out.println("Date.setTime(mylongObj2): " + myDateObj2.toString());	// Date.setTime(mylongObj2): Sun Aug 28 10:17:50 CEST 2022
		  
		/*
		 * Returnt Instant 	
		 * toInstant() 	--> Converts this Date object to an Instant.
		 */

		Instant myInstantObj = myDateObj2.toInstant();
		System.out.println("Date.toInstant(): " + myInstantObj); // Date.toInstant(): 2022-08-28T08:17:50.179Z


		 /*
		  * return boolean 
		  * after​(Date when) --> Tests if this date is after the specified date
		  * true if and only if the instant represented by this Date object is strictly later than the instant represented by when; false otherwise
		  * 
		  */
		Date myDateObj4 = null;

		try {
			// if (myDateObj2.after(myDateObj4))
			if (myDateObj2.after(myDateObj))
				System.out.println("Date.after(Date): " + " es " + true);	//	(myDateObj2.after(myDateObj)) --> Date.after(Date):  es true
			else
				System.out.println("Date.after(Date): " + " es " + false);	//	(myDateObj.after(myDateObj2)) --> Date.after(Date):  es false
				
		} catch (NullPointerException e) {

			System.out.println("NullPointerException - se accede a una variable que no apunta a ningún objeto y se refiere a nada o a null");
            e.printStackTrace();

		}
		
		/*
		 * Return boolean 	
		 * before​(Date when) --> Tests if this date is before the specified date.
		 * true if and only if the instant of time represented by this Date object is strictly earlier than the instant represented by when; false otherwise.
		 */

		try {
			// if (myDateObj2.before(myDateObj4))
			if (myDateObj.before(myDateObj2))
				System.out.println("Date.before(Date): " + " es " + true);	//	(myDateObj.before(myDateObj2)) --> Date.before(Date):  es true
			else
				System.out.println("Date.before(Date): " + " es " + false);	//	(myDateObj2.before(myDateObj)) --> Date.before(Date):  es false
				
		} catch (NullPointerException e) {

			System.out.println("NullPointerException - se accede a una variable que no apunta a ningún objeto y se refiere a nada o a null");
            e.printStackTrace();

		}

		/*
		 * Return Object 	
		 * clone() 	--> Return a copy of this object.
		 */

		Date myDateObjClone = (Date) myDateObj.clone();
		System.out.println("Date.clone(): " + myDateObjClone.toString());	//	Date.clone(): Wed May 04 22:11:00 CEST 2022
		
		/*
		 * Return int 	
		 * compareTo​(Date anotherDate) --> Compares two Dates for ordering.
		 * the value 0 if the argument Date is equal to this Date; 
		 * a value less than 0 if this Date is before the Date argument; 
		 * and a value greater than 0 if this Date is after the Date argument.
		 */

		try {

			if ((myDateObj.compareTo(myDateObj2)) == 0)
			// if ((myDateObj.compareTo(myDateObjClone)) == 0)
				System.out.println("Los objetos son iguales: " + myDateObj + " = " + myDateObjClone);	//	Los objetos son iguales: Wed May 04 22:32:35 CEST 2022 = Wed May 04 22:32:35 CEST 2022
			else if ((myDateObj.compareTo(myDateObj2)) < 0)
			// else if ((myDateObj2.compareTo(myDateObj)) < 0)
					System.out.println("myDateObj is antes myDateObj2: " + myDateObj + " < " + myDateObj2);	//	myDateObj is antes myDateObj2: Wed May 04 22:27:51 CEST 2022 < Sun Aug 28 10:17:50 CEST 2022	
				else
					System.out.println("myDateObj is después myDateObj2: " + myDateObj + " > " + myDateObj2);	//	myDateObj is después myDateObj2: Sun Aug 28 10:17:50 CEST 2022 > Wed May 04 22:34:43 CEST 2022
			
		} catch (NullPointerException e) {
			
			System.out.println("NullPointerException - se accede a una variable que no apunta a ningún objeto y se refiere a nada o a null");
            e.printStackTrace();

		}
		
		/*
		 * return boolean 	
		 * equals​(Object obj) --> Compares two dates for equality.
		 * The result is true if and only if the argument is not null and is a Date object that represents the same point in time, 
		 * to the millisecond, as this object.  
		 * dos objetos Date son iguales si y sólo si el método getTime devuelve el mismo valor largo para ambos
		 */

		if (myDateObj.equals(myDateObjClone))
			System.out.println("los objetos son iguales: " + myDateObj + " = " + myDateObjClone);	// los objetos son iguales: Wed May 04 23:01:01 CEST 2022 = Wed May 04 23:01:01 CEST 2022
		else 
			System.out.println("los objetos no son iguales: " + myDateObj + " != " + myDateObjClone);
		
		/*
		 * Return static Date 	
		 * from​(Instant instant) --> Obtains an instance of Date from an Instant object.
		 * 
		 */

		Instant objInstant = Instant.now();
		Instant objInstant01 = Instant.MAX;

		try {

			// Date.from(objInstant);
			System.out.println("from(objInstant): " + Date.from(objInstant));	//	from(objInstant): Wed May 04 23:51:36 CEST 2022
			System.out.println("from(objInstant01): " + Date.from(objInstant01));	//	
			 
		} catch (NullPointerException e) {

			System.out.println("NullPointerException - if instant is null.");
            e.printStackTrace();

		} catch (IllegalArgumentException e) {

			System.out.println("IllegalArgumentException - if the instant is too large to represent as a Date.");
            e.printStackTrace();

		}

		/*
		 * Return int 	
		 * hashCode() --> Returns a hash code value for this object.
		 * The result is the exclusive OR las dos mitades del valor long primitivo devuelto por el método getTime()
		 * (int)(this.getTime()^(this.getTime() >>> 32))
		 */
		
		int objInt = 0;
		objInt = myDateObj.hashCode();
		System.out.println("hasCode: " + objInt);	//	hasCode: -1859034105
		
		int objInt02 = 0;
		objInt02 = myDateObjClone.hashCode();
		System.out.println("hasCode: " + objInt02);	//	hasCode: -1857871760

		/*
		 * Returns Instant 	
		 * toInstant() --> Converts this Date object to an Instant.
		 */

		System.out.println("toInstant(): " + myDateObj.toInstant());	//	toInstant(): 2022-05-04T22:48:57.584Z
		System.out.println("toInstant(): " + myDateObjClone.toInstant());	//	toInstant(): 2022-05-04T22:48:57.584Z
		
	}

}
