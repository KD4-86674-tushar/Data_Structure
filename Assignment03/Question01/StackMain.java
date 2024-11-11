package Assignment03.Question01;
import java.util.Scanner;


public class StackMain {

	public static void main(String[] args) {
		try(Scanner sc=new Scanner(System.in))
		{
			System.out.print("Enter the size of array : ");
			int arr[]=new int[sc.nextInt()];
			Stack s=new Stack(arr.length);
			System.out.print("Enter "+arr.length+" elements in array  : \n");
			for(int i=0;i<arr.length;i++)
			{
				System.out.print("\tarr["+i+"] : ");
				arr[i]=sc.nextInt();
				s.push(arr[i]);
			}
			System.out.print("Reversed array using stack  : ");
			for(int i=0;i<arr.length;i++)
			{
				arr[i]=s.pop();
				System.out.print("\n\tarr["+i+"] : "+arr[i]);
			}
		}
	}
}
