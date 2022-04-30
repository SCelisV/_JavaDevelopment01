package testing;

public class Abstracto_test {

    public static void main(String[] args) {
        
        /*
         * Este objeto tiene acceso a los atributos definidos en la clase abstracta por que los ha heredado
         */
        Student myObj = new Student();

        System.out.println("fname: " + myObj.fname);    // fname: Sonia
        System.out.println("age: " + myObj.age);        // age: 24
        /*
         * Este objeto tiene acceso a los atributos definidos en su propia clase
         */
        System.out.println("graduationYear: " + myObj.graduationYear);  // graduationYear: 2022

        
    }
    
}
