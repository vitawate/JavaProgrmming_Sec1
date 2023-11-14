
public class Example1 {

	public static void main(String[] args) {
		String isbn="IB2-6325-85-4-1", title="Basic Java Programming";
		int unit=5;
		//
		double price = 225.75f;
		System.out.println("Book ISBN : "+isbn);
		System.out.println("Book Title : "+isbn);
		System.out.println("Book Unit : "+isbn);
		System.out.println("Book Price : "+isbn);
		System.out.println("-----------------------------------------");
		double totalPrice = unit * price;
		System.out.println("Total price is "+totalPrice);
		double vat = totalPrice +(totalPrice*7/100);
		System.out.println("Add VAT 7% is "+vat);
	}

}
