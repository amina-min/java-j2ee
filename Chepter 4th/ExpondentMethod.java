import java.util.Scanner;
public class ExpondentMethod{
	public static void main(String[]a){
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter a value");		
		double value= sc.nextDouble();
		
		System.out.println("enter a value");		
		double value1= sc.nextDouble();
		/*
		System.out.println("exp : " + Math.exp(value));
		System.out.println("Log : " + Math.log(value));
		System.out.println("sqrt : " + Math.sqrt(value));
		*/
		//power
		
		System.out.println("pow : " + Math.pow(value,value1));
	}
}