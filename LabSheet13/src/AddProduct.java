import java.util.*;
import java.io.*;
public class AddProduct {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		//create object for write data to file use PrintWriter Class
	//	FileWriter filename = new FileWriter("d//txtFile//product,txt");
		PrintWriter writeFile = new PrintWriter (new FileWriter("d//txtFile//product,txt"));
		System.out.print("produst Id: ");
		String productId = input.next();
		System.out.print("produst Name: ");
		String productName = input.next();
		System.out.print("produst Unit: ");
		String productUnit = input.next();
		System.out.print("produst Unit: ");
		String productPrice = input.next();
		
		
		
		writeFile.println(productId+","+productName+","+productUnit+","+productPrice);
		System.out.println("write file already....");
		
		writeFile.close();
	}

}
