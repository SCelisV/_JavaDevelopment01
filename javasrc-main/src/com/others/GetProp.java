package com.others;

public class GetProp {

	public static void main(String[] args) {
		/*
		 * Devuelve las propiedades del systema
		 * 
		 */
		System.out.println("System.getProperties() = " +
		System.getProperties());

		/*
		 * Devuelve el valor de la propiedad "java.runtime.name" 
		 * 
		 */		
		System.out.println("System.getProperty(\"java.runtime.name\") = " + 
		System.getProperty("java.runtime.name"));
		
		String os_name = System.getProperty("os.name");
		System.out.println("System.getProperty(\"os.name\")=  " + os_name);
		
        String os_arch = System.getProperty("os.arch");
		System.out.println("System.getProperty(\"os.arch\")=  " + os_arch);

        String os_version = System.getProperty("os.version");
		System.out.println("System.getProperty(\"os.version\")=  " + os_version);

        String java_class_path = System.getProperty("java.class.path");
		System.out.println("System.getProperty(\"java.class.path\")=  " + java_class_path);
		
        String java_lang_version = System.getProperty("java.lang.version");
		System.out.println("System.getProperty(\"java.lang.version\")=  " + java_lang_version);

        System.out.println("System.getProperty(\"java.specification.version\")= " + System.getProperty("java.specification.version"));

        /*establecer una propiedad - set */

        System.setProperty("pencil color", "Red");

        String pencil_color= System.getProperty("pencil color");
		System.out.println("System.getProperty(\"pencil color\")=  " + pencil_color);
		
		System.getProperties().list(System.out);
		
	}

}
