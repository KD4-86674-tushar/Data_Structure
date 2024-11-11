package Assignment.Question3;

import java.util.Scanner;

public class Question3 {
	static Scanner sc = null;

	public static void main(String[] args) {
		sc=new Scanner(System.in);
		System.out.print("Enter the Size of Array of Employees : ");
		Employee arr[]=new Employee[sc.nextInt()];
		int choice = 0,count=0;
		while ((choice = menu())!=0) {
			switch(choice)
			{
			case 1:
				if(count<arr.length)
				{
					System.out.println("Enter the details of employee : \n");
					System.out.print("Emp ID : ");
					int id=sc.nextInt();
					System.out.print("Name   : ");
					String name=sc.next();
					System.out.print("Salary : ");
					double salary=sc.nextDouble();
					Employee e=new Employee(id,name,salary);
					arr[count++]=e;
				}
				else
					System.out.println("Array is full");
				break;
			case 2:
				System.out.print("\nEnter the Empid to find Employee : ");
				Employee n=findById(arr,sc.nextInt());
				if(n==null)
				{
					System.out.println("Employee is not found");
				}
				else
					System.out.println(n);
				break;
			case 3:
				System.out.print("\nEnter the name to find Employee : ");
				Employee e=findByName(arr,sc.next());
				if(e==null)
				{
					System.out.println("Employee is not found");
				}
				else
					System.out.println(e);
				break;
		    default : System.out.println("Invalid choice!");
		}

	}
	}

	private static Employee findByName(Employee[] arr, String name) {
		for(int i=0;i<arr.length;i++)
		{
			if(name.equals(arr[i].getName()))
				return arr[i];
		}
		return null;
	}

	private static Employee findById(Employee[] arr, int id) {
		for(int i=0;i<arr.length;i++)
		{
			if(id==arr[i].getEmpid())
				return arr[i];
		}
		return null;
	}

	private static int menu() {
		System.out.println("---------------------------------");
		System.out.println("Menu");
		System.out.println("0.exit");
		System.out.println("1.add employee");
		System.out.println("2.find by empid");
		System.out.println("3.find by name");
		System.out.print("\nEnter your choice : ");
		return sc.nextInt();
	}

}
