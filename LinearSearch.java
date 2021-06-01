package Recursion;
import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the no . of elements to be entered in the array : ");
		int n = sc.nextInt();
		System.out.print("Enter the elements into the array : ");
		int a[] = new int[n];
		for(int i = 0 ; i < n ; i++)
		{
			a[i] = sc.nextInt();
		}
		System.out.print("Enter the element to be searched in the array : ");
		int ele = sc.nextInt();
		LS(a , ele);
		sc.close();

	}
	public static void LS(int a[] , int ele)
	{
		int i ;
		for(i = 0 ; i < a.length ; i++)
		{
			if(a[i] == ele)
			{
				System.out.println(ele+" , Element found at index : "+i);
				break ;
			}
		}
		if(i == a.length)
		{
			System.out.println("Element not found .");
		}
	}

}


/*   OR
 * 
 * 		int i ;
 * 		int flag ; 
		for(i = 0 ; i < a.length ; i++)
		{
			if(a[i] == ele)
			{
				System.out.println(ele+" , Element found at position : "+(i+1));
				flag = 1 ;
				break ;
			}
		}
		if(flag==0)
		{
			System.out.println("Element not found .");
		}
 * 
 * 
 * 
 * 
 * 
 * 
 */
