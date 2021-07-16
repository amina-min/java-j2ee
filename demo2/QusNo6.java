public class QusNo6{
	public static void main(String[]args){
		
		String [] names =new String[5];
		
		names[0]="Amina";
		names[1]="Nayeem";
		names[2]="Saiful";
		names[3]="Rakib";
		names[4]="Bodrul";
		
		String searchName="Saiful";
		
		int i=0;
		while(i<names.length){
			if(names[i]==searchName){
				System.out.println("position is: "+i);								
					break;	
			}
			i++;
		}
		
		/*
		int [] arr ={25,48,12,30};
		int value=12;		
		for(int i=0;i<arr.length;i++){
			if(arr[i]==value){
				System.out.println(" matched and position is: "+i);								
					break;	
			}
		}
		*/
	}
}