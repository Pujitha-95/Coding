import java.util.HashMap;
import java.util.Map.Entry;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Arraysorting {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {0,1,0, 1, 1,0,1,0,1,0};
		
	

		for (int i = 0; i < arr.length; i++)   
		{  
		for (int j = i + 1; j < arr.length; j++)   
		{  
		int tmp = 0;  
		if (arr[i] > arr[j])   
		{  
		tmp = arr[i];  
		arr[i] = arr[j];  
		arr[j] = tmp;  
		}  
		}  
		//prints the sorted element of the array  
		System.out.println(arr[i]);  
		}  
		}  
		 
		
		
}


	