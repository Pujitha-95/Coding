
public class SeperatingNumbersFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s= "hello3478world";
		
		
		String s1 = s.replaceAll("[^A-Za-z]", "");
		String s2 = s.replaceAll("[A-Za-z]", "");
		System.out.println(s1);
		System.out.println(s2);
	int k= Integer.parseInt(s2);
		String s3= s1.concat(s2);
		
	System.out.println(s3);
		
	System.out.println(k);
	}

}
