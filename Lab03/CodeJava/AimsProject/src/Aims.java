
public class Aims {

	public static void main(String[] args) {

		    Cart anOrder = new Cart();


		    DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);


		    DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);


		    DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);
		    anOrder.addDigitalVideoDisc(dvd2, dvd3);
		    
		    System.out.println("Total Cost is: " + anOrder.totalCost());

		    System.out.println("Removing 'Star Wars' from the cart...");
	        anOrder.removeDigitalVideoDisc(dvd2);

	        System.out.println("Total Cost after removing 'Star Wars': " + anOrder.totalCost());
	}

}