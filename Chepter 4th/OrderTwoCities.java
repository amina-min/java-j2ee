import java.util.Scanner;
public class OrderTwoCities{
	public static void main(String[]a){
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the first city");
		String city1=sc.nextLine();
		
		System.out.println("enter the secend city");
		String city2=sc.nextLine();
		
		if(city1.compareTo(city2)< 0)
			System.out.println("==========" +city1 + " " +city2 );
		else
			System.out.println("==========" +city2 + " " +city1 );
		
	}
}