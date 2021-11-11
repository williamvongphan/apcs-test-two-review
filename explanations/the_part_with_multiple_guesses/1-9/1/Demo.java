public class Demo {
	public static void main (String[] args) {
		/*
		 *A Java demo of Question 1.
		 */

		boolean p;
		boolean b;

		p = true; 
		b = true;

		System.out.println("When p is true and b is true, the expression is " + expression(p, b));

		p = true; 
		b = false;

		System.out.println("When p is true and b is false, the expression is " + expression(p, b));

		p = false; 
		b = true;

		System.out.println("When p is false and b is true, the expression is " + expression(p, b));

		p = false; 
		b = false;

		System.out.println("When p is false and b is false, the expression is " + expression(p, b));
	}

	public static boolean expression (boolean p, boolean b) {
		return !(p && b) && (!p || b);
	}
}