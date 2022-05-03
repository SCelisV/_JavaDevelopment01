package testing;

public class Externa2Interna_test {
   
    public static void main(String[] args) {
        
        Externa2Class externa = new Externa2Class();
        System.out.println(externa.x);		//	10
/*
     
       Externa2Class.Interna2Class interna = externa.new Interna2Class();
       System.out.println(interna.y );		//	
 */

/*
 *        
 * EException in thread "main" java.lang.Error: Unresolved compilation problems: 
	The type Externa2Class.Interna2Class is not visible
	The type Externa2Class.Interna2Class is not visible
	The type Externa2Class.Interna2Class is not visible

	at testing.Externa2Interna_test.main(Externa2Interna_test.java:10)
 */
    }
}



