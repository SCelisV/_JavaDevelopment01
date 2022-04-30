package testing;

import com.others.Person;

import junit.framework.*;

/**
 * Un caso de prueba ara la clase Person
 * @author hadoop
 *
 */

public class PersonTest extends TestCase{
	
	/*
	 * Las clases de prueba de JUnit requieren este constructor
	 */
	public PersonTest(String name) {
		super(name);
	}
	
	public void testNameConcat() {
		Person p = new Person("Sonia", "Celis");
		String f = p.getFullName();
		assertEquals(f, "Sonia Celis");
		
	}

}
