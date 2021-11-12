public class Demo {
	public static int Disco (int x, int y) {
		int m = x; int i = 1;
		while (m % y != 0) {
			m = i * x;
			i += 1; 
		}
		return m;
	}

	public static void main (String[] args) {
		System.out.println("Here are some example calls of Disco.");
		System.out.println("Disco of 9 and 6 is " + Disco(9, 6));
		System.out.println("Disco of 12 and 8 is " + Disco(12, 8));
		System.out.println("Disco of 15 and 3 is " + Disco(15, 3));
	}
}