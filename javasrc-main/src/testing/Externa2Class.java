package testing;

/*
 * Definimos la clase interna como privada para que objetos externos NO accedan a la clase interna.
 */

class Externa2Class {
	  int x = 10;

	  private class Interna2Class {
	    int y = 5;
	  }
}

