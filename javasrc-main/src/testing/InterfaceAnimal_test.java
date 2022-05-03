package testing;

public class InterfaceAnimal_test {
	
	/*
	 *    Al igual que las clases abstractas, 
	 *    las interfaces no pueden utilizarse para crear objetos 
	 */

	public static void main(String [] args) {
		
		/*
		 * Aquí no es posible crear un objeto de la clase "Animal".
		 */
		Pig3 myPig = new Pig3();
		Dog3 myDog = new Dog3();
		
		myPig.animalSound();			//	El cerdo dice: oinks, oinks
		myPig.sleep();					//	Zzz
		
		myDog.animalSound();			// 	El perro dice: wow, wow
		myDog.sleep();					//	Zzz
		
	}
	
}
