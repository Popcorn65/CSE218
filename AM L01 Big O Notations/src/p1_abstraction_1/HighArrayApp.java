package p1_abstraction_1;

public class HighArrayApp {
	
	public static void main(String[] args) {
		int maxSize = 20;
		HighArray a = new HighArray(maxSize);
		for (int i = 0; i < (maxSize - 1); i++) {
			long random = (long) (Math.random() * 200);
			a.insert(random);
		}

		a.display();
		System.out.println("Biggest value is " + a.removeMax());
		a.display();

		System.out.println("Going to sort the array backwards...");
		int length = a.getNumElems();
		HighArray b = new HighArray(maxSize);
		for (int j = 0; j < length; j++) {
			long item = a.removeMax();
			b.insert(item);
		}
		b.display();

		HighArray c = new HighArray(maxSize * 2);
		for (int i = 0; i < ((maxSize * 2) - 3); i++) {
			long random = (long) (Math.random() * 200);
			c.insert(random);
		}
		c.insert(70);
		c.insert(70);
		c.insert(70);
		c.display();

	}
}