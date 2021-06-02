
public class SortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {34, 12, 134, 3, 1};
		int length= arr.length;
		int temp;
	
		for(int i=0; i<length;i++)
		{
			for(int j=i+1;j<length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
					
				}
				
				
			}
			System.out.print(" " +arr[i]);

		}
		int min = arr[0];

		for (int i = 1; i < length; i++) {
			if (min > arr[i])

			{
				arr[i] = min;
			}

		}

		System.out.print(" " +min);

		
		//System.out.println(max);
		

	}

}
