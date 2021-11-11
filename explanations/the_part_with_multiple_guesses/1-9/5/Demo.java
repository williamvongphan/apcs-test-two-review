/* Try compiling this file. */

public class GrokStatic {
	public static int classField;
	public /* non-static */ int instanceField;

	public static void classMethod(int x) {
		classField = 13;
		instanceField = 17;
		classMethod(19);
		instanceMethod(23);
	}
	public /* non-static */ void instanceMethod(int y) {
		classField = 29;
		instanceField = 31;
		classMethod(37);
		instanceMethod(41);
	}
}