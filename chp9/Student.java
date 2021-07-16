public class Student{
		//variable diclaresion
	int id;
	String name;
	int phoneNo;
	String address;
	
	
	// constructor object declaretion
	
	//default constructor
	Student(){		
	}
	
	// 2 perameter declaretion
	Student(int id,String name){
		this.id=id;
		this.name=name;
		
	}	
	// 4 perameter declaretion
	Student(int id,String name,int phoneNo,String address){
		this.id=id;
		this.name=name;
		this.phoneNo=phoneNo;
		this.address=address;
		
	}
		//main method
	public static void main(String[]args){
		Student std1=new Student();
		System.out.println("============Defult Object============");
		System.out.println("Id: "+std1.id);
		System.out.println("Name: "+std1.name);
		System.out.println("Phone No: "+std1.phoneNo);
		System.out.println("Address: "+std1.address);
		
		Student std2=new Student(1,"Amina");
		System.out.println("============Parameter 2 Object============");
		System.out.println("Id: "+std2.id);
		System.out.println("Name: "+std2.name);
		System.out.println("Phone No: "+std2.phoneNo);
		System.out.println("Address: "+std2.address);
		
		Student std3=new Student(2,"Rabu",015212524,"Dhaka");
		System.out.println("============Parameter 4 Object============");
		System.out.println("Id: "+std3.id);
		System.out.println("Name: "+std3.name);
		System.out.println("Phone No: "+std3.phoneNo);
		System.out.println("Address: "+std3.address);
		
	}
}