import java.util.HashMap;
import java.util.Map.Entry;

public class Occuranceofaword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Bull big Bull  hundred big buffalo big buffalo";
		
		String[] s1 = s.split(" ");

		
		HashMap<String ,Integer> hmap= new HashMap<String, Integer>();
		
		
		
		for( String i : s1)
		{
			
			if(hmap.containsKey(i))
			{
			
				hmap.put(i, hmap.get(i)+1);
			}
			else hmap.put(i,1);
	
		}
		
		for(Entry<String, Integer> entry : hmap.entrySet())
		{
			if(entry.getValue()>1)
			{
			
			System.out.println(entry.getKey()+ "    "+entry.getValue());
			} 
		
	}

}
}