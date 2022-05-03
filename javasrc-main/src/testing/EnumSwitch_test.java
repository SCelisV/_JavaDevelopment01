package testing;

public class EnumSwitch_test {

	public static void main(String[] args) {
		
		Nivel myVar = Nivel.MEDIUM;
		
	    switch(myVar) {
	      case LOW:
	        System.out.println("Nivel Low");
	        break;
	      case MEDIUM:
	         System.out.println("Nivel Medium");	//	Nivel Medium
	        break;
	      case HIGH:
	        System.out.println("Nivel High");
	        break;
	    }
		
	}

}
