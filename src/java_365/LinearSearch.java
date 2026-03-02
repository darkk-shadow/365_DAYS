package java_365;
/*  ****LOGIC****
1️.Start from the first element of the array.
2️.Check:
Is this element equal to the number you are searching?
3️.If yes:
Stop and return the index.
4.If no:
Move to the next element.
5.Repeat until:
You find the element
OR
You reach the end of the array.
6.If you reach the end and didn’t find it:
Return -1 (means not found).*/

public class LinearSearch {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int key = 3;

		int index = searchElement(array, key);

		if (index == -1) {
			System.out.println("Element not found");
		} else {
			System.out.println("Element found at index: " + index);
		}
	}

	public static int searchElement(int[] arr, int key) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}
}