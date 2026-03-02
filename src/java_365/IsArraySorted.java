package java_365;
/* Logic to Check if Array is Sorted (Ascending Order)
1️. Start from index 0
2️. Compare current element with next element
3️. If array[i] > array[i+1]
→ That means order is broken
→ Return false immediately
4️.If loop completes without problem
→ Return true*/
public class IsArraySorted {
	public static void main(String[] args) {
		// int arr[]= {10,20,70,50};//Not sorted array
		int arr[] = { 10, 20, 40, 50 };// sorted array
		if (isArraySorted(arr)) {
			System.out.println("Given array is sorted");
		} else {
			System.out.println("Given array is not sorted");
		}

	}

	public static boolean isArraySorted(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			if (array[i] > array[i + 1]) {
				return false;
			}
		}
		return true;
	}

}
