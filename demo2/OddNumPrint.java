public class OddNumPrint{
	public static void main(String[]args){
	System.out.println("print odd num ");
		int [] arr ={25,48,12,30,5,47,80};		
			
			
		for(int i=0;i<arr.length;i++){  
			if( (arr[i] % 2) !=0 ){  
				System.out.println(arr[i]);
			}
		} 
						
	}
}