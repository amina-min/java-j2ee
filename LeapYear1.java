import java.util.Scanner;
public class LeapYear1{
    public static void main(String[]args){
        // create scanner
        Scanner input= new Scanner(System.in);

        System.out.println("Enter a year ");

        int year= input.nextInt();          


        //check leapyear
        boolean isLeapyear=( year % 4==0 && year % 100 != 0) || ( year % 400==0);

        //result
        System.out.println( year + " is a leap year ? " + isLeapyear);

    }
}