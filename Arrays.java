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
	}
	
	public static void evenOdd(List<Integer> A) {
		int nextEven = 0, nextOdd = A.size() -1;
		while (nextEven < nextOdd) {
			if (A.get(nextEven) % 2 == 0) {
				nextEven++;
			} else {
				Collections.swap(A, nextEven, nextOdd);
				nextOdd--;
			}
		}
	}

	public static int[] lotteryDraw(int high, int target) {
			int i;
			int[] numbers = new int[high];
			int result[]  = new int[target];
			// fill an array with numbers 1 2 3 ... high
			for (i=0; i<high; i++) {
				numbers[i] = i+1;
			}
			for (i=0; i<number; i++) {
				int j = (int)(Math.random() * (high-i));
				result[i] = numbers[j];
				numbers[j] = numbers[high - 1 - i];
			}
			return result;
	}

	public static List<integer> plusOne(List<Integer> A) {
		int carry = 1;
		for (int i = A.size() - 1; i >= 0; i--) {
			int sum = A.get(i) + carry;
			A.set(i, sum % 10);
			carry = sum / 10;
		} 
		if (carry > 0) {
			A.add(0, carry);
		}
		return A;
	}		


		List<String> myList = new ArrayList<>();
		myList.add("Lawrence");
		myList.add("Joy");
		myList.add("Maalik");
		myList.add("Taylor");+
		myList.add("Nina");
		System.out.println(myList);

		for (int j = 0; j < myList.size(); j++) {
			System.out.println(myList.get(j));
		}

		myList.set(3, "New Name Updated at index 3");
		System.out.println(myList);

		myList.remove(2);
		System.out.println("New list after removing element at index 2 is: " + myList);

	}}
