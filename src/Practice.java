
public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s="TATA1234";
		String s1= s.replaceAll("[^A-Za-z]", "");
		System.out.println(s1);
		int s2=Integer.parseInt( s.replaceAll("[A-Za-z]", ""));
		System.out.println(s2);
		
		
		
		
		int i=	(s2/1000)*10;
		
		System.out.println(i);
		
		String s3= Integer.toString(i);
		
		String s4= s1.concat(s3);
		System.out.println(s4);
	}

}
