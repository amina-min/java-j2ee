import java.util.Scanner;

public class Ans3{
	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter two number , this addition will be multiplication with 6" );
		int a = input.nextInt();
		int b = input.nextInt();
		int result = a+b * 6;
		System.out.println("Result a is " + result );	
		
	
		
		System.out.println("Enter two number , this addition will be modulas with 9" );
		int c = input.nextInt();
		int d = input.nextInt();
		int result2 = (c+d)%9;
		System.out.println("Result b is " + result2 );
		
		
		
		
		int result3 = (20 + -3 * 5 / 8);
		System.out.println("Result c is " + result3 );
		
		
		int result4 = 5 + 15 / 3 * 2 - 8 % 3;
		System.out.println("Result d is " + result4 );
		
	}
}