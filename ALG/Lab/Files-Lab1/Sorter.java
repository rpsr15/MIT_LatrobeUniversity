import java.util.*;

public class Sorter {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		names.add("anuraja");
		names.add("zufi");
		names.add("ravi");
		names.add("ktya");
		insertionSort(names);
		System.out.println(names);
	}

		int first = 0;
		int last = list.size() - 1;

		int pos = first + 1;

		while (true) {
			if (pos > last) {
				return; // done
			} else if (pos == first) {
				pos = first + 1; // move right
			} else if (list.get(pos).compareTo(list.get(pos - 1)) >= 0) {
				pos++; // move right

			} else // list.get(pos).compareTo(list.get(pos-1)) < 0
			{
				swap(list, pos, pos - 1);
				pos--; // swap and move left
			}
		}
	}

	// Swap elments at positions i and j
	//
	private static <E extends Comparable<E>> void swap(List<E> list, int i, int j) {
		E temp = list.get(i);
		list.set(i, list.get(j));
		list.set(j, temp);
	}

	// Generic method to perform bubble sort

	// Generic method to perform selection sort
	public static <E extends Comparable<E>> void insertionSort(List<E> list) {
		for (int i = 1; i < list.size(); i++) {
			E val = list.get(i);
			int j = i - 1;
			while (j >= 0 && (list.get(j).compareTo(val) > 0)) {
				list.set(j + 1, list.get(j));
				j--;
			}
			// insert at j+1
			list.set(j + 1, val);
		}

	}
	//generic shell sort
	 public static <E extends Comparable<E>> void shellSort(List<E> list)
	 {
		 
	 }
	
	
}


	

	
	
		

		
		
			
			
		
		
		
	



	