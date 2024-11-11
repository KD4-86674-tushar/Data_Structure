import java.util.Scanner;

public class Question01 {

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
			System.out.print("\nEnter the element to find last occurence : ");
			int n=sc.nextInt();
			int i=findOcurrence(arr,n);
			if(i==-1)
				System.out.println("Element not found.");
			else
				System.out.println("Elemensts last Ocurrence : "+i);
		}

	}

	private static int findOcurrence(int[] arr, int n) {
		int index=-1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==n)
			  index=i;
		}
		return index;
	}

}
