import java.util.Scanner;

public class Ans7{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int a, b, temp;
		a = 15;
		b = 27;
		System.out.println("Before swapping : a , b  = " + a + ","+ b);
		
		
		temp = a;
		a = b;
		b = temp;   
		System.out.println("After swapping : a, b = "+a+", "+ + b);
			
		
	}
}