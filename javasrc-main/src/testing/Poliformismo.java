package testing;

public class Poliformismo {

    public static void main(String[] args) {
        
        Animal unAnimal = new Animal();     // Crea un objeto de la clase Animal
        Animal unCerdo = new Pig();         // Crea un objeto de la clase Pig 
        Animal unGato = new Cat();          // Crea un objeto de la clase Cat
        Animal unPerro = new Dog();         // Crea un objeto de la clase Dog

        unAnimal.animalSound();		// los animales emiten sonidos
        unCerdo.animalSound();		// El cerdo dice: oinks, oinks
        unGato.animalSound();		// El gato dice: meow, meow
        unPerro.animalSound();		// El perro dice: wow, wow
        
    }
    
}
