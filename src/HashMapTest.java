import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	HashMap<String,Integer> hmap= new HashMap<String,Integer>();
	
	hmap.put("Pujitha",1);
	hmap.put("charitha",2);
	hmap.put("Navya",3);
	hmap.put("Satya",4);
	hmap.put("Devi",5);
	
	
	System.out.println(hmap.entrySet());
	
	
	for(Entry<String, Integer> s: hmap.entrySet())
		
	System.out.println(s);
	}
	

}
