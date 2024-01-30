import javax.swing.*;
public class RectangleDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//double widthInput = Double.parseDouble(JOptionPane.showInputDialog("Input width"));
		//double lengthInput =Double.parseDouble(JOptionPane.showInputDialog("Input width"));
		//String colorInput = JOptionPane.showInputDialog("Input color");
		//Rectangle objl = new Rectangle(widthInput,lengthInput,colorInput);
		
		//JOptionPane.showMessageDialog(null, objl.toString()+
				//"\nArea of Rectangle = "+ objl.getArea());
		double widthInput = Double.parseDouble(JOptionPane.showInputDialog("Input width"));
		double lengthInput = Double.parseDouble(JOptionPane.showInputDialog("Input length"));
		
		Rectangle2 obj2 = new Rectangle2(widthInput,lengthInput);
		JOptionPane.showMessageDialog(null,obj2.toString()+
			"\nArea of Rectengle = "+ obj2.getArea());
		
		
	}

}
