package testing;

public class Herencia_test {
   
    public static void main(String[] args) {
        
       Padre p = new Padre();
       Hijo h = new Hijo();

       /*
        * el hijo puede llamar a los métodos del padre
        */
        h.metodo();		// ejecución del método definido en la clase Padre							
       /*
        * El hijo puede hacer uso directo de los atributos del padre
        */
        System.out.println(h.name_variable_padre);			// Cesar 
       /*
        * al definir private el atributo en la clase hijo tengo que utilizar los métodos get y set
        */
        System.out.println(p.name_variable_padre + " es el padre de " + h.getName_variable_hijo()); 	// Cesar es el padre de Samuel
       /*
        * al definir protected el atributo en la clase hijo puedo usarlo directamente 
        * o usar los métodos get y set
        */
        System.out.println(p.name_variable_padre + " es el padre de " + h.name_variable_hijo); 	// Cesar es el padre de Samuel


    }
}
