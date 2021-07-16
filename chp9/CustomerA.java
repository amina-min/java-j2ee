public class CustomerA{	
		//variable diclaresion
	int id;	
	String phoneNo;
	String address;
	
	
	// constructor object declaretion
	
	//default constructor

	CustomerA(){		
	}
	
		// 2 perameter declaretion
	CustomerA(int id,String phoneNo){
		this.id=id;
		this.phoneNo=phoneNo;
		
	}	
// 3rd eta dea hoyni --------------------------------
	CustomerA(int id,String phoneNo,String address){
		this.id=id;
		this.phoneNo=phoneNo;
		this.address = address;
		
	}	
	// 4 perameter declaretion
	CustomerA(int id,String name,String phoneNo,String address){
		this.id=id;
		this.phoneNo=phoneNo;
		this.address=address;		
	}
	public static void main(String[]args){
		CustomerA cust=new CustomerA();
		System.out.println("============Defult Object============");
		System.out.println("Id: "+cust.id);		
		System.out.println("Phone No: "+cust.phoneNo);
		System.out.println("Address: "+cust.address);
		
		CustomerA cust1=new CustomerA(001,"01748542720");
		System.out.println("============parametter 2 Object============");
		System.out.println("Id: "+cust1.id);		
		System.out.println("Phone No: "+cust1.phoneNo);
		System.out.println("Address: "+cust1.address);
		
		CustomerA cust2=new CustomerA(002,"1754865201","Dhaka");
		System.out.println("============parametter 3 Object============");
		System.out.println("Id: "+cust2.id);		
		System.out.println("Phone No: "+cust2.phoneNo);
		System.out.println("Address: "+cust2.address);
		System.out.println(cust2);
	}	
}
