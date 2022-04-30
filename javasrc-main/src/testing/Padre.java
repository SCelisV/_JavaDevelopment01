package testing;

class Padre {
	/*
	 * Si fuera private la clase hijo no puede acceder
	 */
    protected String name_variable_padre = "Cesar";

    public void metodo(){
        System.out.println("ejecución del método definido en la clase Padre");
    }
    
}
