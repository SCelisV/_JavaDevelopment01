package testing;

public class EnumFor {

	public static void main(String[] args) {

		for (Nivel myVar : Nivel.values()) {
			  System.out.println(myVar);			
			  /*
			   * LOW
			   * MEDIUM
			   * HIGH
			   * 
			   */
		}
	}
}

