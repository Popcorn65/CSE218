package p1_abstraction;

public class ArrayApp {

	public static void main(String[] args) {
		long[] arr = new long[100];
		int nElems = 0;
		int j; // loop counter
		long searchKey;

		// insert 10 items
		arr[0] = 88;
		arr[1] = 66;
		arr[2] = 22;
		arr[3] = 11;
		arr[4] = 00;
		arr[5] = 99;
		arr[6] = 77;
		arr[7] = 33;
		arr[8] = 44;
		arr[9] = 55;

		nElems = 10;

		// display items
		for (j = 0; j < nElems; j++) {
			System.out.print(arr[j] + " ");
		}
		System.out.println();

		// find a search key
		searchKey = 66;
		for (j = 0; j < nElems; j++) {
			if (arr[j] == searchKey) {
				break;
			}
		}

		if (j == nElems) {
			System.out.println("Can't find " + searchKey);
		} else {
			System.out.println("Found " + searchKey);
		}

		// delete item with a key
		searchKey = 55;
		for (j = 0; j < nElems; j++) {
			if (arr[j] == searchKey) {
				break;
			}
		}
		for (int k = j; k < nElems - 1; k++) {
			arr[k] = arr[k + 1];
		}

		nElems--;
		
		// display items
		for(j=0; j < nElems; j++) {
			System.out.print(arr[j] + " ");
		}
		System.out.println();
	}

}
