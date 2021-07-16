import java.util.Scanner;

public class Ans4{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);
	System.out.println("Enter two digit and multiplication it");
	int number1 = input.nextInt();  
	int number2 = input.nextInt();
	multiplication(number1, number2);	
	
	
	int a = 4;
	int b = 5;
	addition(a,b);
	
		
	}
	
	
	
	
	public static void multiplication(int number1, int number2){
		
		int result = number1*number2;
		System.out.println("Result is "+ result);
	}
	public static void addition(int a, int b){
		
		int result1 = a+b;
		System.out.println("Result is "+ result1);
	}
	
	
}