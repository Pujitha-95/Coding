
public class DuplicateElementsinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int arr[]= {34, 1, 34, 3, 1};
		int length= arr.length;
		int temp;
	int count =1;
		for(int i=0;i<length;i++)
		{
			for(int j=i+1;j<length;j++)
			{
				if(arr[i]==arr[j])
				{
					count++;
					arr[j]=0;
					
				}
				if(count>1&& arr[i]!=0)
				{
					System.out.println(arr[i]);
	}
			
		}
	}
	

	}
}
