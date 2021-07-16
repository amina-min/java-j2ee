public class CheckExpression{
	public static void main(String[] args){
		String s = "Welcome to Java";  
		String s1 = "Hello World";
		String s2 = " Welcome to Java Programming";
		
		//correct
		
		String s3 = s1 + s2;  			
		System.out.println(s3); 
		
		// incorrect
		/*
		String s3 = s1 - s2;		//variable name same
		System.out.println(s3);  
		*/
		
		//correct
		boolean a = (s1==s2);
		System.out.println(a); 
		
		 //Incorrect
		/*
		boolean b = (s1>=s2);  
		System.out.println(b);
		*/
		
		 //correct  
		int c = s1.compareTo(s2); 
		System.out.println(c);
		
		//correct
		int i = s1.length();   
		System.out.println(i);
		
		//incorrect
		/*
		char d = s1.length;
		System.out.println(d); 
		*/
		
		
		char e = s1.charAt(s1.length());
		System.out.println(e);				
		
		
		
	}
	
}
