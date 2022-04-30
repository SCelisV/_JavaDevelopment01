package testing;

public class ExternaInterna_test {
   
    public static void main(String[] args) {
        
        ExternaClass externa = new ExternaClass();
        ExternaClass.InternaClass interna = externa.new InternaClass();
        System.out.println(interna.y + " " + externa.x);		//	5 10

    }
}
