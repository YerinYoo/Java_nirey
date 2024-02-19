package second;

public class ExBag {

	public static void main(String[] args) {
		
		Bag bag = new Bag();
		
		bag.brand="Dior";
		bag.model="Lady Bag";
		bag.price=8400000;
		
		System.out.println("bag.brand : " + bag.brand);
		System.out.println("bag.model : " + bag.model);
		System.out.println("bag.price :" + bag.price);
		
		System.out.println("================");
		
		Bag bag1 = new Bag ();
		
		bag1.brand="Bottega Veneta";
		bag1.model="Cassette Bag";
		bag1.price=5600000;
		
		System.out.println("bag.brand : " + bag1.brand);
		System.out.println("bag.model : " + bag1.model);
		System.out.println("bag.price :" + bag1.price);
		
		
		
	}
}
