import java.util.Scanner;

public class Ans5{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter radius for calculated area");
		double radius = 7.5;
		double pi = 3.14159;
		double area =  (radius * radius * pi);
		System.out.println("Area : "+ area);
		
		double Perimeter = 2 * pi * radius;
		System.out.println("Perimeter : "+ Perimeter);
	}
}