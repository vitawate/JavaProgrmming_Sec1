import java.util.*;
import java.io.*;
public class SentenceText {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		//อ่านไม่แยอะ
		PrintStream writeFile =new PrintStream((new File("d://txtFile//sentence.txt")));
		
		Scanner input = new Scanner(System.in);
		int i=1;
		while(true) {
			System.out.print("Sentence: ");
			String word = input.next().toUpperCase();
			
			if(word.equalsIgnoreCase("stop")) {
				break;
			}
			writeFile.println(i+":"+word);
			i++;
		}
		System.out.println("File is save!!");
		writeFile.close();

	}

}
