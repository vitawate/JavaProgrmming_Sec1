import java.io.*;
import java.util.Scanner;
public class Lab1205 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		
		
		//Scanner ed = new Scanner(new File("d://txtFile//StudentList108.txt"));
		
	}
	
	public static String Level(String id)throws IOException {
		BufferedReader ed= new BufferedReader(new FileReader("d://txtFile//List107.txt"));
		String tmp = "";
		while((tmp=ed.readLine())!=null) {
			
		}
		
		
		
		
		
		return"";
	}
	
	
	public static void Header(){
		
		System.out.println("NO.\tID\t\t\tLevel\tName\t\t\tGrade\tStatus");
		System.out.println("************************************************************************************");
	}
}
