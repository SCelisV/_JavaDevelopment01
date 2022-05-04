package testing;

/* java.time
 * La principal API para fechas, horas, instantes y duraciones. 
 * Se basan en el sistema de calendario ISO,
 * sigue las reglas del Gregorian
 * Todas las clases son inmutables
 * Para acceder a los campos a un nivel inferior --> package java.time.temporal.
 * opciones de personalización. --> package java.time.format 
 */
import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.MonthDay;
import java.time.OffsetDateTime;
import java.time.OffsetTime;
import java.time.Period;
import java.time.Year;
import java.time.YearMonth;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimePackage_test {

	public static void main(String[] args) {

	/* Instant a timestamp
	 * es la clase equivalente más cercana a java.util.Date
	 * An instantaneous point on the time-line.
	 * return static Instant 	
	 * now() --> Obtains the current instant from the system clock.
	 */

	/*
	 * Creo my Obj Instant 
	 * Instant myObjInstant = Instant.now(); 
	 * System.out.println("Instant.now(): " + myObjInstant);	// Instant.now(): 2022-05-03T13:54:59.892Z
	 * ó mejor:
	 */

	System.out.println("Instant.now(): " + Instant.now());	// Instant.now(): 2022-05-03T13:54:59.892Z

	/*
	 * The maximum supported Instant, 
	 * System.out.println("MAX: " + myObjInstant.MAX);	// MAX: +1000000000-12-31T23:59:59.999999999Z
	 * ó mejor:
	 */

	System.out.println("MAX: " + Instant.MAX);	// MAX: +1000000000-12-31T23:59:59.999999999Z

	/*
	 * A string representation of this instant using ISO-8601 representation.  
	 * System.out.println(myObjInstant.toString());	// 2022-05-03T13:54:59.892Z
	 * ó mejor:
	 */

	 System.out.println(Instant.now().toString());	// 2022-05-03T13:54:59.892Z

	/*
	 * A date without a time-zone in the ISO-8601 calendar system, such as 2007-12-03.  
	 * Creo my Obj LocalDate 
	 * LocalDate myObjLocalDate = LocalDate.now();
	 * ó mejor:
	 */
	
	System.out.println("LocalDate.now(): " + LocalDate.now());	// LocalDate.now(): 2022-05-03
	/*
	 * The maximum supported LocalDate, 
	 * System.out.println("MAX: " + myObjLocalDate.MAX);	// MAX: +999999999-12-31
	 * ó mejor:
	 */
	System.out.println("MAX: " + LocalDate.MAX);	// MAX: +999999999-12-31

	/*
	 * LocalTime
	 * A time without a time-zone in the ISO-8601 calendar system, such as 10:15:30. 
	 * return LocalTime 	
	 * of​(int hour, int minute) --> Obtains an instance of LocalTime from an hour and minute.
	 * LocalTime myObjLocalTime = LocalTime.of(16, 39);
	 * System.out.println("LocalTime.of(16,39): " + myObjLocalTime);	// LocalTime.of(16,39): 16:39
	 * ó mejor:
	 */
	System.out.println("LocalTime.of(16,39): " + LocalTime.of(16,39));	// LocalTime.of(16,39): 16:39

	CharSequence cs = "10:15:30";
	/*
	 * return LocalTime 	
	 * parse​(CharSequence text) --> Obtains an instance of LocalTime from a text string such as 10:15.
	 * System.out.println("LocalTime. : " + myObjLocalTime.parse(cs));	// LocalTime. : 10:15:30
	 * ó mejor:
	 */
	System.out.println("LocalTime. : " + LocalTime.parse(cs));	// LocalTime. : 10:15:30

	/*
	 * LocalDateTime --> A date-time without a time-zone in the ISO-8601 calendar system, such as 2007-12-03T10:15:30. 
	 * return LocalDateTime 	
	 * now() --> Obtains the current date-time from the system clock in the default time-zone.
	 */

	System.out.println("LocalDateTime. : " + LocalDateTime.now());	// LocalDateTime. : 2022-05-03T23:07:22.838

	/*
	 * ZonedDateTime
	 * es la clase equivalente más cercana a java.util.GregorianCalendar. 
	 * A date-time with a time-zone in the ISO-8601 calendar system, such as 2007-12-03T10:15:30+01:00 Europe/Paris.
	 * This class stores all date and time fields, to a precision of nanoseconds, and a time-zone, 
	 * with a zone offset used to handle ambiguous local date-times. 
	 * return ZonedDateTime
	 * now() --> Obtains the current date-time from the system clock in the default time-zone.
	 */
	System.out.println("ZonedDateTime. : " + ZonedDateTime.now());	// ZonedDateTime. : 2022-05-03T23:15:47.700+02:00[Europe/Madrid]

	/*
	 * MonthDay 	
	 * A month-day in the ISO-8601 calendar system, such as --12-03.
	 * now() --> Obtains the current month-day from the system clock in the default time-zone
	 */
	System.out.println("MonthDay : " + MonthDay.now());	// MonthDay : --05-03

	/*
	 * OffsetDateTime 	
	 * A date-time with an offset from UTC/Greenwich in the ISO-8601 calendar system, such as 2007-12-03T10:15:30+01:00.
	 */
	System.out.println("OffsetDateTime: " + OffsetDateTime.now());	// OffsetDateTime: 2022-05-04T00:09:23.749+02:00
	/*
	 * OffsetTime 	
	 * A time with an offset from UTC/Greenwich in the ISO-8601 calendar system, such as 10:15:30+01:00.
	 */
	System.out.println("OffsetTime: " + OffsetTime.now());	// OffsetTime: 00:09:23.750+02:00
	/*
	 * Period 	
	 * A date-based amount of time in the ISO-8601 calendar system, such as '2 years, 3 months and 4 days'.
	 */
	System.out.println("Period: " + Period.of(10, 05, 3));	// Period: P10Y5M3D
	/*
	 * Year 	
	 * A year in the ISO-8601 calendar system, such as 2007.
	 */
	System.out.println("Year: " + Year.now());	// Year: 2022
	/*
	 * YearMonth 	
	 * A year-month in the ISO-8601 calendar system, such as 2007-12.
	 */
	System.out.println("YearMonth: " + YearMonth.now());	// YearMonth: 2022-05
	
	/*
	 * DayOfWeek is an enum representing the 7 days of the week - 
	 * Monday, Tuesday, Wednesday, Thursday, Friday, Saturday and Sunday. 
	 */
	DayOfWeek viernes = DayOfWeek.FRIDAY;
	System.out.println("viernes: " + viernes);		//	viernes: FRIDAY

	/*
	 * Gets the day-of-week int value.
	 */
	System.out.println(viernes.getValue());		//	5
	
	for (DayOfWeek myDay : DayOfWeek.values()) {
		System.out.println("myDay: " + myDay);	
		/*
		 * myDay: MONDAY 
		 * myDay: TUESDAY 
		 * myDay: WEDNESDAY 
		 * myDay: THURSDAY 
		 * myDay: FRIDAY 
		 * myDay: SATURDAY 
		 * myDay: SUNDAY
		 */
	}

	System.out.println("DayOfWeek: " + DayOfWeek.of(3));	//	DayOfWeek: WEDNESDAY

	System.out.println("LocalDateTime antes de formatear: " + LocalDateTime.now());	// LocalDateTime antes de formatear: 2022-05-04T12:29:56.268

	/* DateTimeFormatter
	 * Formateador para imprimir y analizar objetos de fecha-hora.
	 * Esta clase proporciona el principal punto de entrada de la aplicación para la impresión y el análisis sintáctico y 
	 * proporciona implementaciones comunes de DateTimeFormatter: 
	 */
	LocalDateTime myLDTObj = LocalDateTime.now();

	/*
	 * El método ofPattern() 
	 * acepta todo tipo de valores, para mostrar en formato diferente
	 */

	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
	System.out.println("LocalDateTime después de formatear: " + myLDTObj.format(formatter));	// LocalDateTime después de formatear: 04-05-2022 12:29:56

	DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	System.out.println("LocalDateTime después de formatear: " + myLDTObj.format(formatter2));	// LocalDateTime después de formatear: 2022-05-04
	
	DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	System.out.println("LocalDateTime después de formatear: " + myLDTObj.format(formatter3));	// LocalDateTime después de formatear: 04/05/2022

	DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("dd-MMM-yyyy");
	System.out.println("LocalDateTime después de formatear: " + myLDTObj.format(formatter4));	// LocalDateTime después de formatear: 04-May-2022

	DateTimeFormatter formatter5 = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
	System.out.println("LocalDateTime después de formatear: " + myLDTObj.format(formatter5));	// LocalDateTime después de formatear: Wed, May 04 2022

	}

}