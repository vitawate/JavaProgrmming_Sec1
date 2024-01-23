
public class PersonalInfo {
	private person name;
	private Date bDay;
	private int personID;
	
	//Default Constructor
	 PersonalInfo(){
		 name = new Person();
		 bDay= new Date();
		 personID = 0;
	 }
	 Personalinfo(String first, String last, int month, int day, int year, int ID){
		 name =new person(first,last);
		 bDay=new Date(month,day,year);
		 persoID =ID;
	 }
	 public void Personalinfo(String first, String last, int month, int day, int year, int ID) {
		 name.setName(first, last);
		 bDay.setDate(month, day, year);
		 personID =ID;
	 }
	 public String toString() {
		 return"Name: "+ name.toString() + "\n" + "Date of birth: ";
		 bDay.toString() + "\n" + "Personl ID: "+personlD;
	 }
}
