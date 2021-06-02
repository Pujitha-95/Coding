import java.util.Scanner;

public class InsertElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]= new int[5];
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter 4 digits");
		for(int i=0;i<a.length-1;i++)
		{
			
			
			a[i]= sc.nextInt();
		}
	
		int location=0;
		int value=0;
		System.out.println("enter location");
		location=sc.nextInt();
		System.out.println("enter value");
	
		value=sc.nextInt();

		for(int i=a.length-1;i>location;i--)
		{
			a[i]=a[i-1];
		}
		
		a[location]=value;
		
		System.out.println("elements after inserting");
		
		for(int i=0;i<a.length;i++)
		{
		
		System.out.println(a[i]);
		}
		
	}

}
