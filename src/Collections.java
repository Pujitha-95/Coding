import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList fruits = new ArrayList();

		// ArrayList<String> fruits = new ArrayList<String>();
		fruits.add("Orange");
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Pineapple");

		fruits.add("Apple");
		fruits.add("Banana");

		fruits.add(100);

		fruits.add('A');

		fruits.add(true);


		fruits.remove("Orange");

	//	fruits.addAll(fruits);
		
		fruits.set(5, 10);

		System.out.println(fruits.size());

		System.out.println(fruits);
		System.out.println(fruits.get(6));
		
		System.out.println(fruits.contains(5));
		
	//for loop
		
		System.out.println("reading elements using for loop");
		
		for (int i =0;i<fruits.size();i++)
		{
			System.out.println(fruits.get(i));
		}
				
				

		//for each loop
		System.out.println("reading elements using for each loop");
		
		for(Object e: fruits)
		{
			System.out.println(e);
		}
		
		//using iterator
				System.out.println("reading elements using iterator");
				
				java.util.Iterator it = fruits.iterator();
				while(it.hasNext())
				{
					System.out.println(it.next());
				}
						
				
				
		
	}

}
