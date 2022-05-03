package testing;

abstract class AbstractAnimal_test {

	public static void main(String [] args) {
		
		  Pig2 myPig = new Pig2(); // Create a objeto de la Clase Pig2 que extiende de la clase AbstractAnimal
		  Dog2 myDog = new Dog2(); 
		  
		  myPig.animalSound();		// El cerdo dice: oinks, oinks
		  myPig.sleep();			// Zzz
		  

		  myDog.animalSound();		// El perro dice: wow, wow
		  myDog.sleep();			// Zzz
	}
}
