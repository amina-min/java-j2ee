import java.util.Scanner;
public class ComputeTax{
    public static void main(String [] args ){
        //create scanner
        Scanner input= new Scanner(System.in);

        // user status
        System.out.println(" (0 = single , 1=Marride jointly  ,  2 =Msrried separately , 3= head of , Household ) Enter the Filing status :");
         int status = input.nextInt();

         //user income
         System.out.println("Enter your taxable income  ");
         double income= input.nextDouble();

         //Compute tax
         double tax=0;
         if(status==0){
             if(income<=8350)
             tax= income*.10;
             else if(income<=33950)
             tax=8350*.10 + (income-8350)*.15;
             else if(income <=82250)
             tax= 8350*.10+(33950-8350)*.15+(income-33950)*.25;
             else if(income<=171550)
             tax= 8350*.10+(33950-8350)*.15+(82250-3350)*.25+(income-82250)*.28;
             else if(income<=372950)
             tax= 8350*.10+(33950-8350)*.15+(82250-3350)*.25+(171550-82250)*28+(income-171550)*.33;
             else 
             tax= 8350*.10+(33950-8350)*.15+(82250-3350)*.25+(171550-82250)*28+(372950-171550)*.33+(income-372950)*.35;

         }
         else if(status==1){
             
         }else if(status==2){

         }else if(status==3){

         }else {
             System.out.println(" error : invalid status ");
         }
            System.out.println( "Tax is " + (int)(tax*100)/100);

    }
}