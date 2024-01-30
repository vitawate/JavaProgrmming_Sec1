import javax.swing.*;

public class Rectangle2 implements Shape2 {
	private double width,length;
	
	Rectangle2(double width,double length){
		this.width =width;
		this.length = length;
				
	}
	@Override
	public double getArea() {
		return this.width * this.length;
	}
	public double getWidth() {
		return this.width;
	}
	public double getLength() {
		return this.length;
	}
	public String toString() {
		return "REctangle[width =" + this.width + ",length= "+ this.length+","+ super.toString()+"]";
	}
	
	
	//showMessageDiaLog(null,obj.toString()+
	//"\nArea of Rectengle = "+ obj2.getArea());
	//JOptionPane.showMessageDiaLog(null,obj.toString()+
	//"\nArea of Rectengle = "+ obj2.getArea());
	
	
}
