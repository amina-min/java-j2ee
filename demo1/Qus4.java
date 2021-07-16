import java.util.Scanner;
public class Qus4{
	public static void main(String[]a){
		Scanner input = new Scanner(System.in);
		System.out.println("Input first number");
		int num1=input.nextInt();
		System.out.println("Input Second number");
		int num2=input.nextInt();
		
		int result=num1*num2;
		System.out.println("Result is: "+ result);
	}
}