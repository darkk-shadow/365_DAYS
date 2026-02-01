package java_365;

public class Largest_Number1 {
	public static void main(String[] args) {
		int arr[]= {0,1,211,3,4,5,99,1022};
		
		int max=arr[0];
		for(int i=0;i<=arr.length-1;i++) { //for(int i=0;i<arr.length;i++)This logic also fine
			if(arr[i]>max)
			max=arr[i];
		}
		System.out.println(max);
	}

}
