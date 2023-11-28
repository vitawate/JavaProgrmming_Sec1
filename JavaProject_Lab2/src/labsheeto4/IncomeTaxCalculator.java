package labsheeto4;
import java.util.*;
public class IncomeTaxCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Declare constants first (variables may use these constants)
		final double TAX_RATE_ABOVE_20K = 0.1;
		final double TAX_RATE_ABOVE_40K = 0.2;
		final double TAX_RATE_ABOVE_60K = 0.3;
		// Declare variables
		int taxableIncome;
		double taxPayable;
		
		//Assume input for taxableIncome
		taxableIncome =30000;
		
		//Compute tax payable in 4 cases
		if(taxableIncome<20000) { //[0-20000]
			taxPayable = 0;	
		}
		else if(taxableIncome<=40000) {//[20001-40000]
			taxPayable = (taxableIncome-20000) * TAX_RATE_ABOVE_20K;
		}
		else if(taxableIncome<=60000){//[40001-60000]
			taxPayable = 20000* TAX_RATE_ABOVE_20K+(taxableIncome-20000)*TAX_RATE_ABOVE_40K;
		}
		else { //[60001,]
			taxPayable = (20000* TAX_RATE_ABOVE_20K)+(20000*TAX_RATE_ABOVE_40K)+
					(taxableIncome-60000)*TAX_RATE_ABOVE_60K;
		}
		
		//Print tax payable rounded to 2 decimal places
		System.out.print("The income tax payable is : "+taxPayable);
		//System.out.printf("The income tax payable is : %.2f", taxPayable);
	}

}
