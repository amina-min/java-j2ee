import java.util.Scanner;

public class Lottery{
	public static void main(String[] args){
		
		//generate lottery number
		int lottery = (int)(Math.random()*100);                   //45 35
		
		//get number from user
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your two digit number");
		int givenNumber = input.nextInt();													
		
		//get digit from lottery
		int lotteryDigit1 = lottery/10;
		int lotteryDigit2 = lottery%10;
		
		//get digit from user 
		int givenNumber1 = givenNumber/10;
		int givenNumber2 = givenNumber%10;
		
		System.out.println("Lottery number is" + lottery);
		
		if (givenNumber==lottery)
			System.out.println("Exact Match : You win $10000");								
		else if (givenNumber1 == lotteryDigit2 && givenNumber2 == lotteryDigit1)
			System.out.println("Two Dizit Match : You win $3000");
		else if (givenNumber1 == lotteryDigit1 || givenNumber1 == lotteryDigit2 || givenNumber2==lotteryDigit1 || givenNumber2 == lotteryDigit2)
			System.out.println("one digit match : You win $1000");
		else
			System.out.println("Sorry! No digit match");
	}
	
}