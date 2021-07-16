public class ShowCorrentTime{
	public static void main(String [] args){
		//TotalMillisecends
		long totalMilliseconds=System.currentTimeMillis();
		
		//TotalSecend
		long totalSeconds=totalMilliseconds/1000;
		
		//currentSecends
		long currentSecond= totalSeconds /60;
		
		//totalminutes
		long totalMinutes=totalSeconds/60;
		
		//corrent minutes
		long currentMinute=totalMinutes % 60;
		
		//total hour
		long totalHours=totalMinutes/60;
		
		//correntHours
		long currentHour=totalHours % 24;
		
		System.out.println("Current time is " + currentHour+":" + currentMinute + ":" +currentSecond + "GMT");
	}
}