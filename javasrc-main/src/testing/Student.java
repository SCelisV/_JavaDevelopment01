package testing;
/*
 * Subclase que hereda de la clase abstracta Abstracto
 * Tiene que implementar el método study definido en la clase Abstracta - Abstracto.study()
 */
public class Student extends Abstracto{

    public int graduationYear = 2022;

    public void study(){

        System.out.println("Este es el cuerpo del método abstracto definido en la clase abstracta e implementado aquí");

    }

}
