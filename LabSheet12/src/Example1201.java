import java.io.*;
import java.util.Scanner;
public class Example1201 {
	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner readFile = new Scanner(new File("d://txtFile//MemberLogin.txt"));
		
		while(readFile.hasNext()) {
			String fname= readFile.next();
			//String lname =readFile.next();
			readFile.next();//read surname from file
			readFile.next(); //read password from file
			String email = readFile.next().toUpperCase(); //toUpperCase ทำให้ตัวใหญ่	//read email from file
			System.out.println(fname+" "+"("+email +")");
			
			
		}
		readFile.close();
	}

}
