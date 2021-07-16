import java.util.Scanner;
public class Qus7{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		
		int a,b,temp;
		
		System.out.println("first value is: ");
		 a=sc.nextInt();	
		System.out.println("2nd value is: ");
		 b=sc.nextInt();
		  
		System.out.println("Before Swaping :  a , b  = " + a + ","+ b);
		
		temp=a;
		a=b;		
		b=temp;
		System.out.println("After Swaping :  a , b  = "  + a + "," + b);
	}
}

