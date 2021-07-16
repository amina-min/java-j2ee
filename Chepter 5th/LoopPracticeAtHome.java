import java.util.Scanner;
public class LoopPracticeAtHome{
    public static void main (String[]a){
        Scanner sc= new Scanner(System.in);
        System.out.println(" User value ");
        int value=sc.nextInt();
        
        int i=0;
        while(i<value){
            System.out.println(i + " Programming is a fun ");
            i++; 
        }
    }
}