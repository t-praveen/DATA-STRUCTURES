//BUBBLE SORT PROGRAM//

package Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {

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
		Sort(arr , n);
		System.out.println("After Sorting , the array values are : ");
		for(int i = 0 ; i < n ; i++)
		{
			System.out.println(arr[i]);
		}
		in.close();
	}
	public static void Sort(int arr[] , int n)
	{
		int temp ; 
		for(int i = 0 ; i < n ; i++)
		{
			for(int j = 0 ; j < n - 1 - i ; j++)
			{
				if(arr[j] > arr[j+1])
				{
					temp = arr[j] ;
					arr[j] = arr[j+1] ;
					arr[j + 1] = temp ; 
				}
			}
		}		
	}
}
