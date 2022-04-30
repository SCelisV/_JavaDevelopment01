package com.others;

import java.text.Format;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Testing Clase Format 
 */

public class FormatTest {

	public static void main(String[] args) {

	/**
     * Formatear tipo Date a String "yyyy/MM/dd - HH:mm:ss"
     */

		Format formatter = new SimpleDateFormat("yyyy/MM/dd - HH:mm:ss");
        String dateTimeFormatter = formatter.format(new Date());
		System.out.println("dateTimeFormatter: " + dateTimeFormatter);	// dateTimeFormatter: 2022/03/31 - 15:57:16

	}
}
