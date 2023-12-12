package Example_;
import java.util.*;


public class Example_503 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Input a sent ence: ");
		String sentence = scan.nextLine();
		while(!sentence.endsWith(".")){
			System.out.print("Input a sentence,again: ");
			sentence = scan.nextLine();
		}
		System.out.println();
		
		int spacebar = 0 ;
		for(int i=0;i<sentence.length();i++) {
			if(sentence.charAt(i)==' ') {
				spacebar +=1;
			}
		}
		System.out.print("this sentece has "+ spacebar + " spacebar.");
		System.out.print("this sentece has "+ (spacebar+1) + " spacebar.");
	}

}
