import java.util.Scanner;
public class Qus2{
	public static void main(String[]a){
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter the frist number");	
	int num1=sc.nextInt();
	
	System.out.println("Enter the second number");
	int num2=sc.nextInt();
	
	int result=num1+num2;
	System.out.println("addition : "+ result);
	}	
}