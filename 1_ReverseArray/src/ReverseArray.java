import java.util.Scanner;

public class ReverseArray {
	
	
	
	//Method to reverse an Array
	static void reverseArray(int arr[],int start,int end) {
		
		while(start>=end) 
			return;
		
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			reverseArray(arr, start+1, end-1);
		
	}
	
	//Method to Print element of the Array in Reverse
	static void printReverseArray(int arr[],int length) {
		for(int i=length-1;i>=0;i--) {
			System.out.print(arr[i]+" ");
		}
	}

	/*
	 * Utility that prints out an array on a line
	 */
	static void printArray(int arr[], int size) {
		for (int i = 0; i < size; i++)
			System.out.print(arr[i] + " ");

		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of the Array");
		int length = sc.nextInt();

		System.out.println("Enter the Elements of the Array");
		int arr[] = new int[length];

		for (int i = 0; i < length; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Elements of the Array");
		printArray(arr, length);
		
		
		System.out.println("Print the elements of the array in Reverse Order");
		printReverseArray(arr, length);
		
		System.out.println();
		
		System.out.println("Reverse the elements of the Array");
		reverseArray(arr, 0,length-1);
		printArray(arr, length);

	}
}
