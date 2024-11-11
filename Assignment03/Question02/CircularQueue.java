package Assignment03.Question02;

public class CircularQueue {
	final int SIZE;
	int front,rear;
	int arr[];
	int counter;
	CircularQueue(int SIZE){
		this.SIZE=SIZE;
		arr=new int[SIZE];
		front =rear=-1;
		counter=0;
	}
	public boolean isEmpty()
	{
		return counter==0;
	}
	public boolean isFull()
	{
		return counter==SIZE;
	}
	public void push(int n)
	{
		++counter;
		rear=(rear+1)%SIZE;
		arr[rear]=n;
	}
	public int pop()
	{
		--counter;
		int temp=arr[(front+1)%SIZE];
		front=(front+1)%SIZE;
		if(front==rear)
		{
			front=rear=-1;
		}
		return temp;
	}
	public int peek()
	{
		return arr[(front+1)%SIZE];
	}
}
