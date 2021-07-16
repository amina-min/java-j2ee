public class StudentUsingToGet{
	public int stId=11;
	public String stname="amina";
	public String staddress="Dhaka";
	
	public StudentUsingToGet(){
		
	}
	
	
	public StudentUsingToGet(int stId,String stname,String staddress){
		this.stId=stId;
		this.stname=stname;
		this.staddress=staddress;
		
	}
		public int getId(){
			return stId;
		}
		public String getName(){
			return stname;
		}
		public String getAddress(){
			return staddress;
		}	
}