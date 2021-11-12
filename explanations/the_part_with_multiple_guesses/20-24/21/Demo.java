public class Demo {
	public static void main (String[] args) {
		int p = 3; int q = 1; int sum = 0;
		while (p <= 10) {
			sum += p % q;
			p += 1;
			q += 1;
		}
		System.out.println("Sum is now " + sum);
	}
}