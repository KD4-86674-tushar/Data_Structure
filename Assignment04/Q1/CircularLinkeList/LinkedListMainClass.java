package com.autm;

import java.util.Scanner;


class CircularLinkedListWithoutHead{
	
	static class Node{
		
		private int data;
		private Node next;
		
		Node(int val)
		{
			data = val;
			next = null;
		}		
	}
	
	private Node tail;
	int ct = 0;
	
	public CircularLinkedListWithoutHead()
	{
		tail = null;
	}
	
	public void addLast(int val)
	{
		Node nd = new Node(val);
		
		if(tail == null || ct == 0)
		{
			tail = nd;
			nd.next = tail;
		}
		else
		{
			nd.next = tail.next;
			tail.next = nd;
			tail = nd;
		}
		
		ct++;
	}
	
	public void addFirst(int val)
	{
		Node nd = new Node(val);
		
		if(tail == null || ct == 0)
		{
			tail = nd;
			nd.next = tail;
		}
		else
		{
			nd.next = tail.next;
			tail.next = nd;
		}
		
		ct++;
	}
	
	public void display()
	{
		Node iterator = tail.next;
		
		do {
			System.out.print(iterator.data + " ");
			iterator = iterator.next;
		}
		while(iterator != tail.next);	
		
		System.out.println();
		System.out.println();
	}
	
	public void addAtPosition(int val, int pos)
	{
		Node nd = new Node(val);
		
		if(tail == null || ct == 0)
		{
			tail = nd;
			nd.next = tail;
		}
		else if(pos > (ct+1) || pos < 1)
		{
			System.out.println("Cannot add at that location dude...!!!");
		}
		else if(pos == 1)
		{
			addFirst(val);
			return;
		}
		else if(pos == ct)
		{
			addLast(val);
			return;
		}
		else
		{
			Node iterator = tail.next;
			
			for(int i = 1; i < pos-1; i++)
			{
				iterator = iterator.next;
			}
			
			nd.next = iterator.next;
			iterator.next = nd;	
		}
		
		ct++;
			
	}
	
	public void deleteFirst()
	{
		if(tail == null)
		{
			System.out.println("LinkedList is Empty");
		}
		else
		{
			tail.next = tail.next.next;
		}
		ct--;
	}
	
	public void deleteLast()
	{
		if(tail == null)
		{
			System.out.println("LinkedList is Empty");
		}
		else
		{
			Node iterator = tail.next;
			
			for(int i=1;i<ct-1;i++)
			{
				iterator = iterator.next;
			}
			
			iterator.next = tail.next;
			tail = iterator;
		}
		ct--;
	}
	
	public void deleteAtPosition(int pos)
	{
		if(tail == null)
		{
			System.out.println("Linked List is Empty");
		}
		else if(pos > ct || pos < 1)
		{
			System.out.println("Invalid Position Entered Dude...!!!");
		}
		else if(pos == 1) 
		{
			deleteFirst();
			return;
		}
		else if(pos == ct)
		{
			deleteLast();
			return;
		}
		else
		{
			Node iterator = tail.next;
			
			for(int i = 1; i < pos-1; i++)
			{
				iterator = iterator.next;
			}
			
			iterator.next = iterator.next.next;
			
		}
		
	}
	
	
}

public class LinkedListMainClass {

	public static void main(String[] args) {
		
		CircularLinkedListWithoutHead cll = new CircularLinkedListWithoutHead();
		
		cll.addLast(40);
		cll.addLast(30);
		cll.addLast(20);
		cll.addLast(10);
		
		Scanner cin = new Scanner(System.in);
		
		boolean iterator = true;
		
		while(iterator)
		{
			System.out.println("0. Display");
			System.out.println("1. Add First");
			System.out.println("2. Add Last");
			System.out.println("3. Add Position");
			System.out.println("4. Delete First");
			System.out.println("5. Delete Last");
			System.out.println("6. Delete Position");
			System.out.println("7. Exit");
			
			int choice;
			System.out.print("Your Choice: ");
			choice = cin.nextInt();
			
			if(choice == 0)
			{
				cll.display();
			}
			else if(choice == 1)
			{
				int val;
				System.out.print("Enter Value: ");
				val = cin.nextInt();
				cll.addFirst(val);
			}
			else if(choice == 2)
			{
				int val;
				System.out.print("Enter Value: ");
				val = cin.nextInt();
				cll.addLast(val);
			}
			else if(choice == 3)
			{
				int val, pos;
				System.out.print("Enter Value: ");
				val = cin.nextInt();
				System.out.print("Enter Position: ");
				pos = cin.nextInt();
				cll.addAtPosition(val, pos);	
			}
			else if(choice == 4)
			{
				cll.deleteFirst();
			}
			else if(choice == 5)
			{
				cll.deleteLast();
			}
			else if(choice == 6)
			{
				int pos;
				System.out.print("Enter Position: ");
				pos = cin.nextInt();
				cll.deleteAtPosition(pos);
			}
			else if(choice == 7)
			{
				iterator = false;
			}
			else
			{
				System.out.println("Wrong Choice Entered...!!!");
			}
			
		}
		
	}

}
