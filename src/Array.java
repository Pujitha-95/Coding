
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {3, 5, 1, 3, 2, 2,10};
		int length = a.length;

		
		for(int i=0; i<length;i++)
		{
			for(int j=i+1; j< length; j++)
			{
				
				if(a[i]==a[j])
				{
					System.out.println(a[j]);
					
					System.out.println("   ");
					
					a[j]=a[length-1];
					
					length--;
				}
				
				
			}
		}
		
		
		for(int i=0; i<length;i++)
		{
			System.out.print(a[i]+ " ");
		}
		
	}
}
