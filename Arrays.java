import java.util.List;
import java.util.ArrayList;

public class Arrays {
	public static void main(String[] args) {
		int[] myArray = {33,8,2,1,90,8353,76,3,2,6,899,2};
		for (int i = 0; i<myArray.length; i++) {
			int currentNum = myArray[i];
			System.out.println(currentNum);
			if(currentNum == 76) { 
				System.out.println("We found the number 76 at index" +  i);
			}
		}

		List<String> myList = new ArrayList<>();
		myList.add("Lawrence");
		myList.add("Joy");
		myList.add("Maalik");
		myList.add("Taylor");
		myList.add("Nina");
		System.out.println(myList);

		for (int j=0; j<myList.size(); j++) {
			System.out.println(myList.get(j));
		}

		myList.set(3,"New Name Updated at index 3");
		System.out.println(myList);

		myList.remove(2);
		System.out.println("New list after removing element at index 2 is: " +myList);

	}
}	
