public class LoopPractice{
	public static void main(String[] args){
		
		String msg = "Welcome to java";
		/*
		for (int i=0; i< msg.length();i++){
			
			if(i<7)continue;
				System.out.print(msg.charAt(i));	
			
			
			//ulta
			
			
			for (int i=msg.length()-1; i>0 ; i--){
			
			if(i<6)continue;
			System.out.print(msg.charAt(i));	
			*/
			
			for (int i= 0; i< 100;i++){
				if(i%2==1)
					System.out.println(i);
		}
	}
	
}