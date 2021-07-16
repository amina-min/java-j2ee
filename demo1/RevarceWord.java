import java.util.Scanner;
public class RevarceWord{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter the Digit");
		int d = input.nextInt(); //213  
		
		int d1=d/100;       // 2
		int d2=(d/10)%10;	// 1
		int d3= d%10;		// 3
		
		int result= d3*100+d2*10+d1;   // 2*100,  300+10+2=312
		
		System.out.println("Reverse: "+ result);
		
		
		
		
		
		
	}
}