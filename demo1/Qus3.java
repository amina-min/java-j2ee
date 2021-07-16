import java.util.Scanner;
public class Qus3{
	public static void main(String[]a){
		Scanner sc=new Scanner(System.in);
	
		// a
		System.out.println("Enter the first number");
		int num1=sc.nextInt();		
		System.out.println("Enter the 2nd number");
		int num2=sc.nextInt();		
		int result1= num1+num2*6;
		System.out.println("result1 is: "+result1);
		
		
		//b
		System.out.println("Enter the first number");
		int a1=sc.nextInt();		
		System.out.println("Enter the 2nd number");
		int a2=sc.nextInt();		
		int result2= (a1+a2)%9;
		System.out.println("result2 is: "+result2);
	
		
		//c				20-1
		int result3= 20+-3*5/8;		// 19
		System.out.println("result3 is: "+result3);
		
		
		//d				
		int result4= 5+15/3*2-8%3;  // 13    */%+-
		System.out.println("result4 is: "+result4);
		
		
		
	}
}