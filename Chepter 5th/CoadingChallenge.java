import java.util.Scanner;
public class CoadingChallenge{
    public static void main(String[]a){
       
        
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a value  ");
        int num=sc.nextInt();

        /*
        // no 1.

         for(int i=0; i<=num; i++){
           System.out.println(i);
         }
        

         // Print the odd numbers less than 100
        for(int i=1; i<=100; i+=2){
           System.out.println(i);

        }
         */
         // Print the multiplication table with 7

         for (int i=0;i<=10;i++){
             String r = num + "*" + i + "=" + num * i;
             System.out.println(r);
         }

         // Print all the multiplication tables with numbers from 1 to 10

         
         
    }   
}