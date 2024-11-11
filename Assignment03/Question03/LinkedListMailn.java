package Assignment03.Question03;

import java.util.Scanner;

public class LinkedListMailn {
    static Scanner sc;
	public static void main(String[] args) {
		sc=new Scanner(System.in);
		LinkedList l=new LinkedList();
		int choice=0;
		while((choice=menu())!=0)
		{
			switch(choice)
			{
			case 1:
				System.out.print("Enter the data to add : ");
				l.addNode(sc.nextInt());
				break;
			case 2:l.traverseList();
				break;
			default: System.out.print("Invalid choice!");
			}
		}
		sc.close();
	}
	static int menu()
	{
		System.out.println("-------------------------");
		System.out.println("Menu");
		System.out.println("0.exit");
		System.out.println("1.add node");
		System.out.println("2.traverse list");
		System.out.print("\nEnter choice : ");
		return sc.nextInt();
	}
}
