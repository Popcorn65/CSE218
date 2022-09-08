package p3_simple_sorting;

public class Demo {

	public static void main(String[] args) {
		SimpleSorts a = new SimpleSorts(10);
		a.insert(4);
		a.insert(9);
		a.insert(2);
		a.insert(7);
		a.insert(3);
		a.insert(5);
		a.insert(8);
		a.insert(6);
		a.insert(1);
		a.insert(10);
		
		a.display();
		a.selectionSort();
		a.display();
		
	}

}
