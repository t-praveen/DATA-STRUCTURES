 package Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String args[]) {

		int n, search, array[];

		Scanner in = new Scanner(System.in);
		System.out.println("Please provide the array size:");
		n = in.nextInt();
		array = new int[n];

		System.out.println("Enter " + n + " integers:");

		for (int i = 0; i < n; i++) {
			array[i] = in.nextInt();
		}
		Arrays.sort(array);
		System.out.println("##########Array Values Sorted###############");
		System.out.println("After sorting the array values are : ");
		for(int i = 0 ; i < n ; i++)
		{
			System.out.println(array[i]);
		}
		System.out.println("Enter the value to find:");
		search = in.nextInt();
		in.close();
		int recursiveResult = binarySearchRecursive(search, array, 0, array.length-1);
		if (recursiveResult < 0) {
			System.out.println(search + " is not present in the list.\n");
		} else {
			System.out.println(search + " found at location " + recursiveResult);
		}
	}
	public static int binarySearchRecursive(int search, int[] array, int start, int end){
				
		int middle = (start + end)/2;
		
		if(end < start){
			 return -1;
		} 
		
		
		if (search < array[middle]){
			return binarySearchRecursive(search, array, start, middle - 1);
		}
		
		if (search > array[middle]){
			return binarySearchRecursive(search, array, middle + 1, end);
		}
		
		if (search == array[middle]){
			return middle;
		}
		
		return -1;
	}
}
