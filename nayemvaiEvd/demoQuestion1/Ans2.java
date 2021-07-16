import java.util.Scanner;

public class Ans2{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your first Digit");
		int number1 = input.nextInt();
		
		System.out.print("Enter your Second Digit");
		int number2 = input.nextInt();
		
		int result = (number1+number2);
		System.out.print("Total: " + result);
		
	}
}