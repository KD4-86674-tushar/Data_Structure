package Assignment03.Question01;
public class Stack {
	int top;
	int arr[];
	final int size;
	public Stack(int size)
	{
		this.size=size;
		arr=new int[size];
		top=-1;
	}
    public boolean isEmplty()
	{
		return top==-1;
	}
    public boolean isFull()
	{
		return top==size-1;
	}
    public void push(int n)
	{
		arr[++top]=n;
	}
    public int pop()
	{
		return arr[top--];
	}
    public int peek()
	{
		return arr[top];
	}
}
