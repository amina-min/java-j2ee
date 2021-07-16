import java.util.Scanner;
public class Qus6{
	public static void main(String[]a){
		Scanner input = new Scanner(System.in);
		System.out.println("enter the first num :");
		Double num1= input.nextDouble();
		
		System.out.println("enter the Second num :");
		Double num2= input.nextDouble();
		
		System.out.println("enter the third num :");
		Double num3= input.nextDouble();
		
		Double result= (num1+num2+num3)/3;
		System.out.println("Average number is: "+result);
	}
}