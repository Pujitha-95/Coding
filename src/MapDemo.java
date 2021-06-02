import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;



public class MapDemo {

	public static  void main(String[] args) {
		// TODO Auto-generated method stub

		//in map duplicate keys are not allowed but duplicate values are allowed
		Map<Integer,String> m = new HashMap<Integer,String>();
		m.put(101, "Puji");
		m.put(102, "cherry");
		m.put(103, "cherry");
		
		m.put(104, "Navya");
		m.put(104, "Satya");
		
		m.put(null, "Satya");
		System.out.println(m.get(101));
		System.out.println(m);
		
		Map m1= new HashMap();
		m1.putAll(m);
		System.out.println(m.containsKey(102));
		System.out.println(m.containsValue("Navya"));

		
		System.out.println(m.keySet());
		
			System.out.println(m.values());
			
				System.out.println(m.entrySet());
				
				
				for(Object i: m.keySet())
				{
					System.out.println(i);
				}
				
				for(Object i: m.values())
				{
					System.out.println(i);
				}
				
				for(Object i: m.keySet())
				{
					System.out.println(i+ " :  "+ m.get(i));
				}
				
				
				for(Map.Entry entry : m.entrySet())
				{
					System.out.println(entry.getKey()+ "  "+entry.getValue());
				}
				
				
		java.util.Set s	=	m.entrySet();
	java.util.Iterator it = s.iterator();
	
	while(it.hasNext())
	{
		
		Map.Entry entry	= (Entry) it.next();
		
		System.out.println(entry.getKey()+ "  "+entry.getValue());
	}
				
	}
	
				
				
	}


