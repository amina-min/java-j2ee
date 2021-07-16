import java.util.Scanner;
public class PrintingArray{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String [] n={"Shakib", "Rabu", "Hasan", "Saiful","Rakib"};
		
		
		for(int i=0;i<n.length;i++){
			//System.out.println(n[i]);
			
			if(n[i]=="Saiful")
				continue;
			System.out.println(n[i]);
			
		}
		  
	}
}