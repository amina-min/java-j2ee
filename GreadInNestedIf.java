import java.util.Scanner;
public class GreadInNestedIf{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		
		int bangla=sc.nextInt();
		int english=sc.nextInt();
		int math=sc.nextInt();
		int history=sc.nextInt();
		int avg= (bangla+english+math+history)/4;
		
		if(avg>79){
			System.out.println("a+");
		}else if(avg>69){
		System.out.println("b+");
		}else if (avg>59){
			System.out.println("c");
		}else if(avg>49){
			System.out.println("d");
		}else{System.out.println("fail");
		}
			
	}
}