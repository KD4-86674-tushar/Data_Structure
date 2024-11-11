import java.util.Scanner;

public class Question04 {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in))
		{
			int arr[]= {10,9,8,7,6,5,4,3,2,1};
			System.out.print("Enter element to find : ");
			int i=findElement(arr,sc.nextInt());
			if(i==-1)
			{
				System.out.println("Element not found.");
			}
			else
				System.out.println("Element found at index : "+i);
		}

	}

	private static int findElement(int[] arr, int n) {
		int left=0;
		int right=arr.length-1;
		int mid;
		while(left<=right)
		{
			mid=(left+right)/2;
			if(arr[mid]==n)
				return mid;
			else if(n>arr[mid])
			    right=mid-1;
			else
				left=mid+1;
		}
		return -1;
	}

}
