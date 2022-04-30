package com.others;

/*
 * Pruebas de unidades
 */
public class Person {
	protected String fullName;
	protected String firstName, lastName;

	/*
	 * Construye un objeto Person mediante el nombre y el apellido de una persona
	 */
	
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	/*
	 * Obtiene el nombre completo de la persona
	 */
	public String getFullName() {
		if(fullName != null)
			return fullName;
		return firstName + "" + lastName;
	}
	
	/*
	 * Programa de prueba sencilla
	 */
	
	public static void main(String[] args) {
		Person p = new Person("Sonia", "Celis");
		String f = p.getFullName();
		if (!f.equals("Sonia Celis")) 
			throw new IllegalStateException("Name concatenation broken");
	System.out.println("Fullname: " + f + " looks good");
	}
}
