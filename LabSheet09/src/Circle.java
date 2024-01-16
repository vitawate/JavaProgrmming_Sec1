
public class Circle {
	//The public constants
	public static final double DEFSULT_RADIUS = 1.0;
	public static final String DEFAULT_COLOR ="red";

	private double radius;
	private String color;
	
	//Default Constructor
	Circle(){
		radius = DEFSULT_RADIUS;
		color = DEFAULT_COLOR;
		
	}
	
	//Constructor with parameyer radius and default color
	//2nd Constructor
	Circle(double radius){
		this.radius = radius;
		this.color = DEFAULT_COLOR;
	}
	//Constructor with parameter radius and color
	//3rd Constructor
	Circle(double radius,String color){
		this.radius =radius;
		this.color =color;
	}
	//Retrun the radius-the public getter for private attribute radius
	public double getRadius() {
		return this.radius;
	}
	//Set the radius - the public setter for private attribute color
	public void  setRadius(doule radius) {
		
	}
	public void getColor(){
		return this.color;
	}
	
	
	//set the color - the
	public void setColor(String color) {
		this.color= color;
	}
	public String toString() {
		return "Circle[radius = "+radius +",color "+color ="]";
	}
	
	public double getArea() {
		return radius * radius * Math.PI;
	}
	public double getCircumference() {
		return 2.0* Math.PI*getRadius();
	}
	
}
