import java.util.Scanner;
public class LeapYear{
	public static void main(String []args){
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter a year     ");
		
		int Year= sc.nextInt();
		
		boolean LeapYear= (Year %4==0 && Year%100!=0 )|| (Year% 400==0);
		
		if (LeapYear){
			System.out.println(Year + "  is LeapYear");
		}else{
			System.out.println(Year+" is not LeapYear ");
		}
			
	}
}