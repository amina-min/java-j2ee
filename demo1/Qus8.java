import java.util.Scanner;
public class Qus8{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Reverse it: ");
		
		String r = sc.nextLine();
		
		for(int i=0;i<r.length();i++){
			System.out.print(r.charAt(r.length()-1-i));
		}
	}
}