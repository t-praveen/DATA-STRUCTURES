package Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {

	public static void main(String args[]) {

		int n, arr[];
		Scanner in = new Scanner(System.in);
		System.out.print("Please provide the array size:");
		n = in.nextInt();
		arr = new int[n];

		System.out.print("Enter " + n + " integers:");

		for (int i = 0; i < n; i++) {
			arr[i] = in.nextInt();
		}
		System.out.println("Before sorting , the array values are : ");
		for(int i = 0 ; i < n ; i++)
		{
			System.out.println(arr[i]);
		}
		ISort(arr , n);
		System.out.println("After Sorting , the array values are : ");
		for(int i = 0 ; i < n ; i++)
		{
			System.out.println(arr[i]);
		}
		in.close();
	}
	public static void ISort(int arr[] , int n)
	{
		for(int i = 1 ; i < n ; i++)
		{
			int key = arr[i] ;
			int j = i - 1 ;
			while(j >= 0 && arr[j] > key)
			{
				arr[j + 1] = arr[j] ;
				j = j - 1 ;
			}
			arr[j + 1] = key ; 
		}
	}
}
			
		
	