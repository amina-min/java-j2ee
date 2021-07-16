import java.util.Scanner;
public class AditionalQuiz{
    public static void main(String[]args){
        int num1= (int)(System.currentTimeMillis()%20); 
        int num2= (int)(System.currentTimeMillis()/7%20);

        //create a scanner
        Scanner input= new Scanner(System.in);
         
         System.out.println(num1 + " + " + num2 + " = " +" ? " );

         int ans = input.nextInt();
         System.out.println(num1 + " + " + num2 +" = " +ans + " is " +(num1+num2 == ans) );


    }
}