package Assignment.Question2;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in))
		{
			System.out.print("Enter the Size of Array : ");
			int arr[]=new int[sc.nextInt()];
			System.out.print("Enter "+(arr.length-1)+" elements in array : \n");
			for(int i=0;i<arr.length;i++)
			{
				System.out.print("arr["+i+"] : ");
				arr[i]=sc.nextInt();
			}
			System.out.print("\nEnter the element to find comparisions : ");
			int n=sc.nextInt();
			int i=findComparisions(arr,n);
			if(i==-1)
				System.out.println("Element not found.");
			else
				System.out.println("Number of comparisions needed : "+i);
		}

	}

	private static int findComparisions(int[] arr, int n) {
		int comparisions=0;
		for(int i=0;i<arr.length;i++)
		{
			comparisions++;
			if(arr[i]==n)
				return comparisions;
		}
		return -1;
	}

	

}
