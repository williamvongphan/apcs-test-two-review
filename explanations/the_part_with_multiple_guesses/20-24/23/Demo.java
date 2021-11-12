public class Demo {
	public static void twist (String[] w) {
		String temp = w[0].substring(0, 1);
		w[0] = w[1].substring(0, 1) + w[0].substring(1);
		w[1] = temp + w[1].substring(1);
	}
	public static void main (String[] args) {
		String[] words = {"HOW", "NEAT"};
		twist(words);
		System.out.println(words[0] + " " + words[1]);
	}
}