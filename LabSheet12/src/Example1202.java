import java.io.*;
import java.util.Scanner;
public class Example1202 {

	public static void main(String[] args) throws IOException {
		//intput data from keyboard(console)
		Scanner input = new Scanner(System.in);
		System.out.print("Input Section:");
		int section = input.nextInt();
		Header(section);
		showListStudent(section);

	}
	
	public static void showListStudent(int sectionInput) throws IOException {
		//Read data from file using BufferedReader class
		BufferedReader readFile= new BufferedReader(new FileReader("d://txtFile//List107.txt"));//อย่าลืม.txt
		String tmp = "";
		while((tmp=readFile.readLine())!=null) {
			String[] data = tmp.split("\t");
			//read midtem and final scor from file to display
			double midtemScor = Double.parseDouble(data[4]);
			double finalScore = Double.parseDouble(data[4]);
			int sectionFile = Integer.parseInt(data[3]);
			
			if(sectionFile==sectionInput) {
				System.out.println(data[0]+"\t"+data[2]+"\t"+midtemScor+"\t"+finalScore+"\t"+findResult(midtemScor,finalScore));
			}
		}
		readFile.close();
	}
	
	public static String findResult(double midtemscore,double finalscore) {
		double totalScore = midtemscore+finalscore;
		if(totalScore<=40) return "fail";
		else return "Pass";
		
		
		
	}
	
	public static void Header(int sec) {
		System.out.println("************************************************************************************");
		System.out.println("\t\tList of Data for Section " + sec); 
		System.out.println("************************************************************************************");
	}

}
