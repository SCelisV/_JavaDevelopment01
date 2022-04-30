package testing;

public class AtributoStaticPublic {

    public void myPublicMethod(){
        System.out.println("Los métodos públicos deben ser llamados mediante la creación de objetos");
    }

    static void myStaticMethod(){
        System.out.println("Los métodos estáticos se pueden llamar sin crear objetos");
    }


    public static void main(String[] args) {

    	/*
    	 * llamada al método static
    	 */
        myStaticMethod(); // Los métodos estáticos se pueden llamar sin crear objetos

        /*
         * Esto da un error: No se puede hacer una referencia estática al método no estático myPublicMethod()
         * myPublicMethod(); 
         */

        /*
         * Create an object de la clase 
         * llamada al método public
         */
        AtributoStaticPublic myObj = new AtributoStaticPublic(); 
        myObj.myPublicMethod();     // Los métodos públicos deben ser llamados mediante la creación de objetos 

    }
    
}
