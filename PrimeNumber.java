import java.util.Scanner;
public class PrimeNumber{
	public static void main(String[]args){
		System.out.println(" Enter a number ");
		Scanner sc=new Scanner (System.in);
		int num = sc.nextInt();
		
		boolean result= isPrime(num);
		
		 if (result){
			 System.out.println(num +" is a Prime number");
		 }else
			 System.out.println(num +" is not a Prime number");
	}
	
	
	public static boolean isPrime(int num){
		if(num<2)return false;
		for(int i=2;i<num;i++){
			if(num%i==0)return false;
		}return true;
		
	}
	
	
	
}