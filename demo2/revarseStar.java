public class revarseStar{
	public static void main(String[]args){
		
		for(int i=0;i<=10;i++){	
			for(int j=10-i;j>=0;j--){	
				System.out.print(" ");		
								
			}
			for(int o=0;o<=i;o++){	
					System.out.print("*");
				}
				System.out.println( );			
		}		
	}
}