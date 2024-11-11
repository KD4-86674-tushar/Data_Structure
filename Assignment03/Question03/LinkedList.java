package Assignment03.Question03;

public class LinkedList {
	static class Node{
		int data;
		Node next;
		public Node(int data)
		{
			this.data=data;
		}
	}
	Node head;
	public void addNode(int data) {
		Node newNode=new Node(data);
		if(head==null)
		    head=newNode;
		else if(head.next==null || data<head.data)
		{
			if(head.data>newNode.data)
			{
				newNode.next=head;
				head=newNode;
			}
			else
				head.next=newNode;
		}
		else
		{
			Node temp=head;
			while(temp.data>=data || temp.next!=null)
			    temp=temp.next;
			newNode.next=temp.next;
			temp.next=newNode;
		}
		System.out.println("Node added Successfully");
	}
	public void traverseList() {
		if(head==null)
		    System.out.println("Nothing to display ");
		else
		{
			System.out.print("List : [ ");
			Node temp=head;
			while(temp!=null)
			{
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
			
			System.out.print("] \n");
		}
	}
}
