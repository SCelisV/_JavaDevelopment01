package testing;

public class ExternaInterna_test {
   
    public static void main(String[] args) {
        
        ExternaClass externa = new ExternaClass();
        System.out.println(externa.x);		//	10
        
        ExternaClass.InternaClass interna = externa.new InternaClass();  
        System.out.println(interna.y);		//	5

    }
}
