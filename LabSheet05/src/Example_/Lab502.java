package Example_;

import java.util.Scanner;

public class Lab502 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Input some sentence : ");
		String rob = scan.nextLine();
		Scanner op = new Scanner(System.in);
		System.out.print("The sentence must end with full stop point : ");
		String lox = op.nextLine();
		
		while(!lox.endsWith(".")) {
			System.out.print("The sentence must end with full stop point : ");
			lox = op.nextLine();
		}
		int sbar =0;
		for(int i=0;i<lox.length();i++) {
			if(lox.charAt(i)==' ') {
				System.out.println();
			}
			else {
				System.out.print(lox.charAt(i));
			}
			
		}
			
	}

}
