package arrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
		String[] array = {"abc", "cat", "dog", "sijfo", "asdoij"};
		//2. print the third element in the array
		System.out.println(array[2]);
		//3. set the third element to a different value
		array[2] = "spot";
		//4. print the third element again
		System.out.println(array[2]);
		//5. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		System.out.println();
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		//6. make an array of 50 integers
		int[] iArray = new int[50];
		//7. use a for loop to make every value of the integer array a random number
		Random ran = new Random();
		for (int i = 0; i < iArray.length; i++) {
			iArray[i] = ran.nextInt(100);
		}
		//8. without printing the entire array, print only the smallest number in the array
		int smallest = iArray[0];
		for (int i = 1; i < iArray.length; i++) {
			if (iArray[i] < smallest) {
				smallest = iArray[i];
			}
		}
		System.out.println(smallest);
		//9 print the entire array to see if step 8 was correct
		for (int n : iArray) {
			System.out.println(n);
		}
		//10. print the largest number in the array.
		int largest = iArray[0];
		for (int i = 1; i < iArray.length; i++) {
			if (iArray[i] > largest) {
				largest = iArray[i];
			}
		}
		System.out.println(largest);
	}
}
















