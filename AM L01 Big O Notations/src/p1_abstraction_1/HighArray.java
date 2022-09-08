/**
 * 
 */
package p1_abstraction_1;

import java.lang.Math;

public class HighArray {
	private long[] a;
	private int nElems;

	public HighArray(int max) {
		a = new long[max];
		nElems = 0;
	}

	public int getNumElems() {
		return nElems;
	}

	public boolean find(long searchKey) {
		int j;
		for (j = 0; j < nElems; j++) {
			if (a[j] == searchKey)
				break;
		}
		if (j == nElems)
			return false;
		else
			return true;
	}

	public void insert(long value) {
		a[nElems] = value;
		nElems++;
	}

	public long delete(long value) {
		int j;
		for (j = 0; j < nElems; j++) {
			if (a[j] == value)
				break;
		}
		if (j == nElems)
			return 0;
		else {
			int k;
			for (k = j; k < (nElems - 1); k++) {
				a[k] = a[k + 1];
			}
			nElems--;
			return value;
		}
	}

	public long getMax() {
		int j;
		long biggest = -1;
		if (nElems == 0)
			return biggest;
		else {
			for (j = 0; j < nElems; j++) {
				if (a[j] > biggest)
					biggest = a[j];
			}
			return biggest;
		}
	}

	public long removeMax() // Finds the biggest entry and deletes it
	{
		int j;
		long biggest = -1;
		if (nElems == 0)
			return biggest;
		else {
			for (j = 0; j < nElems; j++) {
				if (a[j] > biggest)
					biggest = a[j];
			}
			delete(biggest);
			return biggest;
		}
	}

	
	public void display() {
		for (int j = 0; j < nElems; j++) {
			System.out.print(a[j] + " ");
		}
		System.out.println("");
	}
}