
public class SingleDigitSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
int n =7678;
		int sum=0;
		while(n>0||sum>9)
		{
		  if(n==0)
		{
		n=sum;
		sum=0;
		}
		sum = sum+n%10;
		n=n/10;


		

}
		
System.out.println(sum);

	}
}
