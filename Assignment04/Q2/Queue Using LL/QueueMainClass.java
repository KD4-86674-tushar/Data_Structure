package com.autm;

import java.util.*;

class LinkedListForQueue {

	static class Node{
		
		private int data;
		private Node next;
		
		Node(int val)
		{
			data = val;
			next = null;
		}		
	}
	
	private Node head, tail;
	
	public void push(int val) // add at last
	{
		if(head==null)
		{
			head =  tail = new Node(val);
		}
		else
		{
			Node nd = new Node(val);
			
			Node iterator = head;
			
			while(iterator.next != null)
			{
				iterator = iterator.next;
			}
			
			iterator.next = nd;		
		}
		
	}
	
	public void peek()
	{
		System.out.println("Element at Peek: " + tail.data);
	}
	
	public void pop() // delete at First
	{
		if(head == null)
		{
			return;
		}
		else
		{
			Node iterator = head;
			
			head = iterator.next;
		}
		
	}
	
	public void displayAll()
	{
		Node iterator = head;
		
		System.out.print("Elements in Queue: ");

		while(iterator!= null)
		{
			System.out.println(iterator.data + " ");	
			iterator = iterator.next;
		}
		
		System.out.println();
	}
	

}

public class QueueMainClass {

	public static void main(String[] args) {
		
		Scanner cin = new Scanner(System.in);
		
		LinkedListForQueue stack = new LinkedListForQueue();
		
		stack.push(10);
		stack.push(20);
		stack.push(30);
		stack.push(40);
		
		boolean iterator = true;
		
		while(iterator)
		{
			int choice;
			
			System.out.println("0. Display");
			System.out.println("1. Push");
			System.out.println("2. Pop");
			System.out.println("3. Top");
			System.out.println("4. Exit");
			
			System.out.print("Your choice: ");
			choice = cin.nextInt();
			
			if(choice == 0)
			{
				stack.displayAll();
			}
			else if(choice == 1)
			{
				System.out.print("Enter Value");
				int val = cin.nextInt();
				stack.push(val);
			}
			else if(choice == 2)
			{
				stack.pop();
			}
			else if(choice == 3)
			{
				stack.peek();
			}
			else if(choice == 4)
			{
				iterator = false;
			}
			else
			{
				System.out.println("Enter Valid Choice Dude...!!!");
			}
			
		}
		
	}

}








