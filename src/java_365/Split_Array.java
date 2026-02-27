package java_365;

import java.util.*;

public class Split_Array {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		System.out.println("Before split : " + Arrays.toString(arr));
		split(arr);

	}

	public static void split(int arr[]) {
		int evenSize = 0;
		int oddSize = 0;
		int evenCount = 0;
		int oddcount = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				evenSize++;
			} else {
				oddSize++;
			}
		}
		int Evenarr[] = new int[evenSize];
		int oddarr[] = new int[oddSize];

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				Evenarr[evenCount] = arr[i];
				evenCount++;
			} else {
				oddarr[oddcount] = arr[i];
				oddcount++;
			}
		}
		System.out.println("Even Array : " + Arrays.toString(Evenarr));
		System.out.println("Odd Array : " + Arrays.toString(oddarr));

	}

}
