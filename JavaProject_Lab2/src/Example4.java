import java.text.DecimalFormat;

import javax.swing.*;
public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat frm = new DecimalFormat("#,###.00");
		String productName = JOptionPane.showInputDialog("Input product name : ");
		
		//input unit price from dialog box 
		
		String strUnit = JOptionPane.showInputDialog ("Input prduct unit : ");
		int productUnit = Integer.parseInt(strUnit);
		
		//input price per unit from dialog box
		//int productUnit = Inter.parseInt(JOptionPane.showInputDialog ("Input prduct unit : ");
		
		String strPrice = JOptionPane.showInputDialog("Input price per unit  : ") ;
		float pricePerUnit = Float.parseFloat(strPrice) ;
		
		//calculate total price
		float totalPrice = productUnit * pricePerUnit;
		
		//display data to dialog box(null,"Total Price is "+ totalPrice);
		
		
		
		float addvat=totalPrice + (totalPrice*7/100);
		JOptionPane.showMessageDialog(null,"Total Price is "
		+frm.format(totalPrice)+"baht"+"\nAdd VAT 7% "+frm.format(addvat)+"baht"
		,"INFORMATION-MESSAGE"
		,JOptionPane.INFORMATION_MESSAGE);
		
		
	}

}
