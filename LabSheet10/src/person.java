
public class person {
	private String firstName;	
	private String lastName;
	
	//
	Person(){
		firstName=lastName="";
	}
	
	Person(String first, String last) {
		firstName = first;
		lastName = last;
		//setB+Name(first,last);
	}
	public void setName(String first,String last) {
		firstName = first;
		lastName = last;
	}
	public String getFirstName() {
		return firstName;
	}
	public String toString() {
		return firstName+" "+lastName;
	}
}
