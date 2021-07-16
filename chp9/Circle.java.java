public class Circle{
	// instance level variabe 
	// data field
	// global variabe
	// state/attribute/property
	double radius;
	// class level variable, this variable is related 
	//with class and this type variable can be call callName.variable
	//name
	static double radius2;
	
	public static void main(String[] args){
		Circle c1 = new Circle();
		double d = c1.radius;
		System.out.println(d);
		double area = c1.getArea();
		System.out.println(area);
		Circle c2 = new Circle(5);
		double area2 = c2.getArea();
		System.out.println(area2);
	}
	
	// constructor: special type of method 
	// constructor name must be same class name
	// we don't create any constructor, JVM create a default constructor.
	// default constructor
	public Circle(){
		
	}
	
	// second constructor
	public Circle(double newRadius){
		radius = newRadius;
		
	}
	
	public double getArea(){
		// radius * radius * PI;
		double area = radius * radius * Math.PI;
		return area;
	}
}
