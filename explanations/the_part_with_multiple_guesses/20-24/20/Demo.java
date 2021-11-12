/* When testing in the visualizer, don't forget the command line args! */

public class Demo {
	public static void main (String[] args) {
		a = parseInt(args[0]);
		b = parseInt(args[1]);
		c = parseInt(args[2]);
		if ((a == b) || !(c <= b)) meMaybe();
	}

	public static void meMaybe () {
		System.out.println("I was called! Yay!");
	}
}