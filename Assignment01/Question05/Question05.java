import java.util.Scanner;

public class Question05 {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in))
		{
			int arr[]= {1,2,1,2,1,2,1,2,1};
			System.out.print("Enter element to find : ");
			int n=sc.nextInt();
			System.out.print("Enter the occurrence  : ");
			int o=sc.nextInt();
			int i=findElement(arr,n,o);
			if(i==-1)
			{
				System.out.println("Element not found.");
			}
			else
				System.out.println("Element "+o+"th ocurrence found at index : "+i);
		}

	}

	private static int findElement(int[] arr, int n, int o) {
		int occurrence=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==n)
			{
				occurrence++;
				if(occurrence==o)
					return i;
			}
		}
		return -1;
	}

}
