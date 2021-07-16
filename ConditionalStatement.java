import java.util.Scanner;
public class ConditionalStatement{
	public static void main(String [] args){
				
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a X value");
		
		int x =sc.nextInt();
		if(x>0){
			System.out.println(x+ ">0" + " = " + true);
		}else{
			System.out.println(x + "<0" +" = " + false );
		}
		
		if(x==5){
			System.out.println(x + "=5" +" = " + true );
		}else{
			System.out.println(x + "!=5" +" = " + false );
		}
		if(x>=0){
			System.out.println(x + ">=0" +" = " + true );
		}else{
			System.out.println(x + "<=0" +" = " + false );
		}
		
		if(x!=1){
			System.out.println(x + "!=0" +" = " + false );
		}else{
			System.out.println(x + "==0" +" = " + true );
		
	}
		}
}