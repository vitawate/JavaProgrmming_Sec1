package Example_;
import java.util.*;
public class Lab501 {

	public static void main(String[] args) {
		
		Scanner op = new Scanner(System.in);
		System.out.print("Full Name: ");
		String amd = op.nextLine();
		int space = amd.trim().indexOf(" ");
		String ez = amd.toLowerCase();
		if(space==-1) {
			System.out.print("Incorrect Name");
		}
		else System.out.print(
				"First Name: "+ez.substring(0,space)
				+"\nlast Name: "+ez.substring(space+1));
	}

}
