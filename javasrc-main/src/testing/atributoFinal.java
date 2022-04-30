package testing;

public class atributoFinal {

    final int x = 10;
    final double PI = 3.14;

    public static void main(String[] args) {
        
        atributoFinal myObj = new atributoFinal();

        System.out.println("myObj.x: " + myObj.x);  //myObj.x: 10

        // myObj.x = 50; --> da un error por estar definida como final
        

    }
    
}
