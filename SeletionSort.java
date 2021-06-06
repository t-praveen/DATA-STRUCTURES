package Recursion;
import java.util.Scanner;

public class SeletionSort {

	public static void main(String[] args) {
		
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
		SSort(arr , n);
		System.out.println("After Sorting , the array values are : ");
		for(int i = 0 ; i < n ; i++)
		{
			System.out.println(arr[i]);
		}
		in.close();
	}
	public static void SSort(int arr[] , int n)
	{
		int i , j , min , temp ;
		for(i = 0 ; i < n - 1 ; i ++)
		{
			min = i ;
			for(j = i + 1 ; j < n ; j ++)
			{
				if(arr[j] < arr[min])
				{
					min = j ;
				}
			}
			temp = arr[i] ;
			arr[i] = arr[min] ;
			arr[min] = temp ; 
		}
	}
}		
