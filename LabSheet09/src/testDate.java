
public class testDate {

	public static void main(String[] args) {
		// Test constructor and toString()
		Date d1 =new Date(2023,2,8);
		System.out.println(d1);
		System.out.println();
		
		d1.setYear(2012);
		d1.setMonth(12);
		d1.setDay(23);
		//12/23/2012
		System.out.println(d1);
		//Year is: 2012 
		System.out.println("Year is: "+d1.getYear());
		//Month is:12
		System.out.println("Month is: "+d1.getMonth());
		//Day is: 23
		System.out.println("day is: "+d1.getDay());
		
		//Test setData
		d1.SetDate(2024, 1, 16);
		System.out.println(d1);
	}

}
