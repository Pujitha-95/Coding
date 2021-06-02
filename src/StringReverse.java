public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Pujitha Gundapaneni";
		String rev = " ";

		int length = s.length();
		for (int i = length - 1; i > 0; i--) {
			rev = rev + s.charAt(i);
		}

		System.out.println(rev);

		int count = 0;

		for (int i = 0; i < length; i++) {

			if (s.charAt(i) != ' ') {
				count++;
			}
		}
		System.out.println(count);

	}
}
