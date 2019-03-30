import java.util.*;

public class Sorter {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<>();
		names.add("anuraja");
		names.add("zufi");
		names.add("ravi");
		names.add("ktya");
		insertionSort(names);
		// System.out.println(names);

		ArrayList<Integer> numbers = new ArrayList<>();
		numbers.add(61);
		numbers.add(109);
		numbers.add(149);
		numbers.add(111);
		numbers.add(34);
		numbers.add(2);
		numbers.add(24);
		numbers.add(119);
		numbers.add(122);
		numbers.add(125);
		numbers.add(27);
		numbers.add(145);
		shellSort(numbers);
	}

	// Generic method to perform gnome sort
	//
	public static <E extends Comparable<E>> void gnomeSort(List<E> list) {
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

	// Generic shellSort
	public static <E extends Comparable<E>> void shellSort(List<E> list) {
		int gap = list.size() / 2;
		System.out.println("the gap is " + gap);
		while (gap > 0) {
			for (int i = 0; i + gap < list.size() && gap > 0; i++) {
				System.out.println("the gap is " + gap);
				System.out.println("caomparig " + list.get(i) + " with" + list.get(i + gap));
				int j = i;
				while (j >= 0 && (list.get(j + gap).compareTo(list.get(j)) < 0)) {
					System.out.println("swapping");
					E val = list.get(j);
					list.set(j, list.get(j + gap));
					list.set(j + gap, val);
					j = j - gap;
				}
				// if (list.get(i + gap).compareTo(list.get(i)) < 0) {
				// // swap
				// System.out.println("swapping");
				// E val = list.get(i);
				// list.set(i, list.get(i + gap));
				// list.set(i + gap, val);
				// }

			}
			gap = gap / 2;
			System.out.println(list);
		}

	}

}
