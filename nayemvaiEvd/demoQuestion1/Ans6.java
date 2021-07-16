import java.util.Scanner;

public class Ans6{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your first number");
		double number1 = input.nextInt();
		
		System.out.println("Enter your Second number");
		double number2 = input.nextInt();
		
		System.out.println("Enter your Third number");
		double number3 = input.nextInt();
		
		double average = (number1+number2+number3)/3;
		
		System.out.println ("Average number is "+  average);
		
		
	}
}