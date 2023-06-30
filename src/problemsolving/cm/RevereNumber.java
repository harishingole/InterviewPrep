package problemsolving.cm;

public class RevereNumber {

	public static void main(String[] args) {
		int n = 123;
		int rev = 0;
		while(n != 0) {
			int rem = n % 10; // 3, 2, 1
			rev = rev * 10 + rem; // 0 * 10 + 3 // 3, 2, 1
			n = n / 10; // 12, 1
		}
		System.out.println(rev);
	}
}
