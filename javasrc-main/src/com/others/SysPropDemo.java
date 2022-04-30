package com.others;

import java.util.*;

public class SysPropDemo {

	public static void main(String[] args) {
		/*
		 * Demuestra las propiedades del sistema
		 */
		System.out.println("System Properties: ");
		Properties p = System.getProperties();
		p.list(System.out);
	}

}
