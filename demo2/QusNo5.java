public class QusNo5{
	public static void main(String[]args){
		int [] arr ={25,48,12,30};
		
		//int [] arr =new int[]{25,48,12,30};
		
		double avg=0;
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
			avg=sum/arr.length;
					}		
			System.out.println("sumArray : "+sum);
			System.out.println("avgArray : "+avg);			
	}
}