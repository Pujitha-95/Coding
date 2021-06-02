
public class DuplicatecharactersinaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "Poojitha";
		
		int len= s.length();
		
		 for (int i = 0; i < len; i++) 
	        {
	            // character at i'th index of s
	            char c = s.charAt(i);
	              
	            // if c is present in str, it returns
	            // the index of c, else it returns -1
	            if (s.indexOf(c) < 0)
	            {
	                // adding c to str if -1 is returned
	                s += c;
	             
	            }
	        	
	        }
		   System.out.println(s);
	
	}

}
