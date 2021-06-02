
public class PrimeNumberBeforeandAfter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 int n=5;
 
 int flag=0;
	 
	 for(int i=2;i<n/2;i++)
		 
		 
	 {
		  if(n%i==0)
		 {
			 flag=1;
		 }
	 }
		 
		if(flag==1)
		{
			 System.out.println("Number is not a prime number");
		}
		
		else
			System.out.println("Number is  a prime number");
			
	 }
	 
 }
		
		
	

