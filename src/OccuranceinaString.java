import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class OccuranceinaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s = "ILoveIndia";
		
	s=	s.toLowerCase();
	//System.out.println(s);
	
	


HashMap<Character, Integer> hmap= new HashMap<Character, Integer>();
char[]	s1 = s.toCharArray();
for(Character e: s1 )
{
	//System.out.println(e);
if(hmap.containsKey(e))
{
	
	
	System.out.println(hmap);
	
	//System.out.println(hmap.get(e));
	hmap.put(e, hmap.get(e)+1);
}
else 
	hmap.put(e, 1);

}

for( Entry<Character, Integer> entry : hmap.entrySet())
{
	System.out.println(entry.getKey()+ "  " + entry.getValue());
}



	
		
		
	}

}
