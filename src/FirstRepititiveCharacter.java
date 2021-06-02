import java.util.ArrayList;
import java.util.HashSet;


public class FirstRepititiveCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	 
		String s ="ILOVEMYSELF";
				
		
		s=s.toLowerCase();
		char[] ch =s.toCharArray();
		
		ArrayList<Character> hset= new ArrayList<Character>();
		
	for(int i=0;i<ch.length;i++)
	{
		if(hset.contains(ch[i]))
			
		{
			System.out.println(ch[i]);
		}
		else hset.add(ch[i]);
		
	}
	
	for(char c : hset)
	{
		System.out.println(c);
	}
	}
	}


