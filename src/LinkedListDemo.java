import java.util.LinkedList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LinkedList l= new LinkedList();
		
		l.add("A");
		l.add("B");
		
		l.add(1);
		
		l.add(2);
		l.removeFirst();
		l.addFirst(8);
		l.removeLast();
		l.add(1,"I");
		System.out.println(l.contains(2));
		
		
		System.out.println(l.get(3));
		for(int i=0;i<l.size();i++)
		{
			System.out.println(l.get(i));
		}
		
		System.out.println("for each loop");
		for(Object i : l)
		{
			System.out.println(i);
		}
		System.out.println("iterator");
		java.util.Iterator it =  l.iterator();
		
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
	
		LinkedList l2= new LinkedList();
		l2.addAll(l);
		System.out.println(l2);
		
		l2.removeAll(l);
		System.out.println(l2);

	}
	

}
