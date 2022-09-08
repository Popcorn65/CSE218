package p2_abstraction;

public class BagApp {

	public static void main(String[] args) {
		int maxSize = 20;
		Bag a = new Bag(maxSize);
		for (int i = 0; i < (maxSize - 1); i++) {
			long random = (long) (Math.random() * 200);
			a.insert(random);
		}

		a.display();
		System.out.println("Biggest value is " + a.getMax());

		a.removeMax();
		a.display();
	
	
	}
}