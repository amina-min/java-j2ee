import java.util.Scanner;
public class ReprateAdditionQuize{
	public static void main(String[] args){
		
		int num1=(int)(Math.random()*10);
		int num2=(int)(Math.random()*10);
		
		System.out.println(" enter your no ");
		Scanner sc= new Scanner(System.in);
		
		System.out.println( num1 + " + " + num2 +"="+ " ?");
		int ans =sc.nextInt();
		
		 while(num1+num2=ans){			 
			 System.out.println(" Wrong,try again. What is "+ num1 + " + " + num2 + "?");
			 ans =sc.nextInt();
			 
		 }
		 
		 while(num1+num2!=ans){			 
			 System.out.println(" Wrong,try again. What is "+ num1 + " + " + num2 + "?");
			 ans =sc.nextInt();
			 
		 }
		 System.out.println("correct");
	}
}