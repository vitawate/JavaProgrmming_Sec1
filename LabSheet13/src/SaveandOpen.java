import java.util.*;
import java.io.*;
public class SaveandOpen extends IOException{
	private String name;
	private String dept;
	
	public void insert() throws IOException {
		//create object for input data from keyboard(console)
		Scanner input = new Scanner(System.in);
		String answer;
		header();
		do {
			System.out.print("Enter name: ");
			name = input.next();
			System.out.print("Enter department : ");
			dept = input.next();
			writeFile.println(name+"\t"+dept);
			System.out.print("Enter dta again?: ");
			answer = input.next();
		}while(answer.equalsIgnoreCase("y"));
		//create object for write data to file use PrintWriter Class
		PrintWriter writeFile = new PrintWriter (new FileWriter("d//txtFile//product,txt"));
		writeFile.println(name+"\t"+dept);
		
		writeFile.close();
	}
	public void read() {
		try {
			Scanner readFile =new Scanner (new File("d//txtFile//product,txt"));
			boolean check = false;
			header();
			while(readFile.hasNext()) {
				name = readFile.next();
				dept = readFile.next();
				if(dept.equalsIgnoreCase(super.getDept())) {
					System.out.println(name);
					 check = true;
				}
			}
			if(check==false) {
				header();
				System.out.print("\nSorry,no department: "+super.getDept()+" in file.");
			}
		     
		}catch(IOException e) {
			System.out.print("Sorry, file not found");
		}
}
}

