import java.util.Scanner;

public class Question07 {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in))
		{
			int Arr[]= { 10, 20, 15, 3, 4, 4, 1 };
			System.out.print("Enter element to find rank : ");
			int i=findRank(Arr,sc.nextInt());
			System.out.println("Rank : "+i);
			
		}
	}

	private static int findRank(int[] arr, int n) {
		int rank=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<=n)
			{
				rank++;
			}
		}
		return rank;
	}

}
