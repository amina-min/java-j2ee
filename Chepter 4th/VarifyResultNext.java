public class VarifyResultNext{
	public static void main(String[] args){
		String a=1+"Welcome "+1+1;
		System.out.println(a);
		
		String b=1+"Welcome "+(1+1);
		System.out.println(b);
		
		String c=1+"Welcome "+('\u0001'+1);
		System.out.println(c);
		
		String d=1+"Welcome " +'a'+1;
		System.out.println(d);
	}
}