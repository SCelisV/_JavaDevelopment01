package testing;

public class Externa3Interna_test {
   
    public static void main(String[] args) {
        
        Externa3Class externa = new Externa3Class();
        System.out.println(externa.x);		//	10

        /*
         * no tengo que utilizar el objeto externa ya que he definido la clase interna como static
         */
        Externa3Class.Interna3Class interna = new Externa3Class.Interna3Class();
        System.out.println(interna.y );		//	5

    }
}



