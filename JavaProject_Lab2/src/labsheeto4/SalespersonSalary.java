import java.text.DecimalFormat;
import java.util.*;
 
public class SalespersonSalary {
 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		DecimalFormat w = new DecimalFormat("#,###.00");
		
		 final double COMMISSION_RATE = 0.15;
		 final int SENTINEL = -1;
		
		 int sales;
		 double salary;
		 while(true) {
			 System.out.print("Enter sales in dollars (or -1 to end): ");
			 sales = input.nextInt();
			 if(sales == -1) {
				 System.out.print("\nbye");
				 break;
			 }
			 salary = 1000+ sales * COMMISSION_RATE;
			 System.out.println("Salary is: $"+ w.format(salary));
			
		 }
		 System.out.println();
 
	}
 
}