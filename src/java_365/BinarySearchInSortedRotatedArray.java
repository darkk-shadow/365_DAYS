package java_365;

import java.util.*;

public class BinarySearchInSortedRotatedArray {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int arr[] = { 4, 5, 6, 7, 0, 1, 2, 3 };
		System.out.println(Arrays.toString(arr));
		System.out.print("Enter Element to be searched : ");
		int target = sc.nextInt();
		int res = searchElement(arr, target);
		System.out.println(res);
		if (res == -1) {
			System.out.print(target + " Element was not found");
		} else {
			System.out.print(target + " Element was found at " + res + " Index");
		}
	}

	public static int searchElement(int[] arr, int target) {

		int start = 0;
		int end = arr.length - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (target == arr[mid])
				return mid;

			if (arr[start] <= arr[mid]) {
				if (target >= arr[start] && target < arr[mid]) {
					end = mid - 1;
				} else {
					start = mid + 1;
				}
			} else {
				if (target > arr[mid + 1] && target < arr[mid]) {
					start = mid + 1;
				} else {
					end = mid - 1;
				}

			}
		}
		return -1;
	}
}
