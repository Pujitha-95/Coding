import java.util.Scanner;

public class DeleteElement {

	public static void main(String[] args) {
		//TODO Auto-generated method stub

		int a[]= new int[5];
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter 5 digits");
		for(int i=0;i<a.length;i++)
		{
			
			
			a[i]= sc.nextInt();
		}
	
		int location=0;
	
		System.out.println("enter location");
		location=sc.nextInt();
		

		for(int i=location;i<a.length-1;i++)
		{
			a[i]=a[i+1];
		}
		
		System.out.println("elements after deleting");
		for(int i=0;i<a.length-1;i++)
		{
			
			System.out.println(a[i]);
		}
			
		
		
		
	}

		
	


	}


