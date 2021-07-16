import java.util.Scanner;
public class RoundingMethod{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter number : ");		
		double value= sc.nextDouble();
		
		
		
		System.out.println("rint : "+ Math.rint(value));
		System.out.println("ceil : "+ Math.ceil(value));
		System.out.println("floor: "+ Math.floor(value));
		System.out.println("round: "+ Math.round(value));
		
		
		
	}
}