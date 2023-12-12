package Example_;
import java.util.*;
public class Example_502 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String yourEmail = JOptionPane.showInputDiaLog("Input your e-mail");
		while(yourEmail.startsWith("@")|yourEmail.startsWith("")){
		 yourEmail= JOptionPane.showInputDiaLog("Input your e_mail,again : ");	
		}
		yourEmail = yourEmail.toLowerCase();
     if(yourEmail.endsWith("hotmail.com")||yourEmail.endsWith("gmail.com")) {
    	 JOptionPane.showMessageDiaLog (n)
     }
	}

}
