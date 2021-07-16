public class TestStudent{		
	public static void main(String[]args){
		
		StudentUsingToGet student1=new StudentUsingToGet();
		System.out.println("=====default=====");
		int stId =student1.stId;
		String stname =student1.stname;
		String staddress =student1.staddress;
		System.out.println("id: "+stId+" Name: "+stname+" Address: "+staddress);
		
		System.out.println("=====default=====");
		StudentUsingToGet student=new StudentUsingToGet(101,"Arshiya","Dhaka");		
		
		System.out.println(student.getId());
		System.out.println(student.getName());
		System.out.println(student.getAddress());
		
	}
	
}