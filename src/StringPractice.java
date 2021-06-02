import java.io.Console;

public class StringPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="hello bvhjdvh RWR4424 world";
		//rev
		int length= s.length();
		String rev= "";
		
		for(int i=length-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		
		System.out.println(rev);
		//count the characters
	
	int count=0;

		for(int i=0;i<=length-1;i++)
		{
			if(s.charAt(i) != ' ')
			{
				
				count++;
		}
		}
		System.out.println(count);
		
		
		//converting to array
		
		char ch[]=s.toCharArray();
		int length1= ch.length;
		
		
for(int i=0; i<length1;i++)
{
	System.out.println(ch[i]);
	
}
//removing unwanted number/special characters


	
}
}

