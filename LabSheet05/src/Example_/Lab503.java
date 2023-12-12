package Example_;
import java.util.*;
public class Lab503 {

	public static void main(String[] args) {
		Scanner yy = new Scanner(System.in);
		System.out.print("Message : ");
		String ee = yy.nextLine();	
		String rr = ee.toLowerCase();
		
		
		String t ="";
		int op = 0;
		
		if(ee.indexOf("nichi")>=0) {
			op++;
		}
		if(op==0) {
			System.out.print(ee );
		}
		
		else {
			System.out.print("Nichi is a sentence");
		
		
		}
		
		}
}
