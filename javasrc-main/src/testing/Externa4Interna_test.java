package testing;

public class Externa4Interna_test {
	
	public static void main (String[]args){
		
        Externa4Class externa = new Externa4Class();
        System.out.println(externa.x);		//	10
		
		Externa4Class.Interna4Class interna = externa.new Interna4Class();
		System.out.println(interna.myInternalMethod());	// 10
		
	}

}
