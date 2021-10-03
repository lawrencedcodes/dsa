import java.util.List;
import java.util.ArrayList;

public class Arrays {
	public static void main(String[] args) {
		int[] myArray = { 33, 8, 2, 1, 90, 8353, 76, 3, 2, 6, 899, 2 };
		for (int i = 0; i < myArray.length; i++) {
			int currentNum = myArray[i];
			System.out.println(currentNum);
			if (currentNum == 76) {
				System.out.println("We found the number 76 at index" + i);
			}
		}
		for (int item : myArray) {
			System.out.println(item);
		}

		int[][] twoDeeArray = { { 3, 4, 5 }, { 7, 8, 9 }, { 10, 11, 12 } };
		int middle = twoDeeArray[1][1];
		System.out.println(middle);

		int[] primes = { 1, 3, 5, 7, 9 };
		int[] evens = { 2, 4, 6, 8, 10 };
		System.arraycopy(primes, 0, evens, 0, primes.length);
		System.out.println(evens[0]);


		public static void sortArray(int[] a) {
			int n = a.length;
			int incr = n/2;
			while (incr>=1) {
				for (int i=incr; i<n; i++) {
					int temp = a[i];
					int j = i;
					while (j>=incr && a[j-incr]>temp) {
						a[j] = a[j-incr];
						j = j-incr;
					}
					a[j] = temp;
				}
				incr = incr/2;
			}
		}

		List<String> myList = new ArrayList<>();
		myList.add("Lawrence");
		myList.add("Joy");
		myList.add("Maalik");
		myList.add("Taylor");
		myList.add("Nina");
		System.out.println(myList);

		for (int j = 0; j < myList.size(); j++) {
			System.out.println(myList.get(j));
		}

		myList.set(3, "New Name Updated at index 3");
		System.out.println(myList);

		myList.remove(2);
		System.out.println("New list after removing element at index 2 is: " + myList);

	}
}
