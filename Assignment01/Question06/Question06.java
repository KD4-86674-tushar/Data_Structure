import java.util.Scanner;

public class Question06 {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in))
		{
			int Arr[]={ 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 } ;
			int i=findUnique(Arr);
			if(i==-1)
			{
				System.out.println("Unique element not found.");
			}
			else
				System.out.println("Element found at index : "+i);
		}

	}

	private static int findUnique(int[] arr) {
		int occurrence;
		for(int i=0;i<arr.length;i++)
		{
			occurrence=0;
			for(int j=0;j<arr.length;j++)
			{
				if(arr[i]==arr[j] && i!=j)
				{
					occurrence++;
				}
			}
			if(occurrence==0)
				return arr[i];
		}
		return 0;
	}

}
