import java.util.Scanner;
public class SwitchExample{
public static  void main(String[]ages){
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("enter the bangla num  :");	
		double bangla=sc.nextDouble();	
			System.out.println("enter the english num  :");
		double english=sc.nextDouble();
			System.out.println("enter the math num  :");
		double math=sc.nextDouble();
			System.out.println("enter the history num  :");
		double history=sc.nextDouble();
		double avg= (bangla+english+math+history)/4;
		
		
		
		switch(sc.nextInt()){
			case sc>=80:
				System.out.println(" Your grad is:  A+");
				break;
			case sc>=70:
				System.out.println(" Your grad is:  A");
				break;
			case sc>=60:
				System.out.println(" Your grad is:  A-");
				break;
			default:				
				System.out.println(" Fail");
		}
		
	}	
	
}