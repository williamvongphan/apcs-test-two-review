/***
 * class Coin by Clyde "Thluffy" Sinclair SKELETON
 ***/
import java.util.*;

class Coin {
	// attributes aka instance vars
	/***
	 * Coin() -- default constuctor precond: postcond:
	 ***/
	String type = new String();
	String face = new String();
	int heads = 0;
	int tails = 0;
	double value = 0;
	double bias = 0.5;

	public Coin() {
		face = "heads";
		heads += 1;
		type = "null";
	}

	/***
	 * Coin(String) -- overloaded constructor precond: input is one of "penny",
	 * "nickel", "dime", "quarter", "half dollar", "dollar" postcond:
	 ***/
	public Coin(String s) {
		type = s;
		face = "heads";
		heads += 1;
	}

	/***
	 * Coin(String,String) -- precond: postcond:
	 ***/
	public Coin(String s, String nowFace) {
		type = s;
		face = nowFace;
		if (nowFace == "heads") {
			heads += 1;
		}
		if (nowFace == "tails") {
			tails += 1;
		}

		value = assignValue(s);
	}

	// Accessors...
	// ----------------------------
	public String getUpFace() {
		return face;
	}

	public int getFlipCtr() {
		return heads + tails - 1;
	}

	public double getValue() {
		return value;
	}

	public int getHeadsCtr() {
		return heads;
	}

	public int getTailsCtr() {
		return tails;
	}
	// ----------------------------

	/***
	 * assignValue() -- set a Coin's monetary value based on its name precond: input
	 * String is a valid coin name ("penny", "nickel", etc.) postcond: instvar value
	 * gets appropriate value Returns value assigned.
	 ***/
	private double assignValue(String s) {
		type = s;
		if (s == "penny") {
			value = 0.01;
		}
		if (s == "nickel") {
			value = 0.05;
		}
		if (s == "dime") {
			value = 0.10;
		}
		if (s == "quarter") {
			value = 0.25;
		}
		if (s == "half dollar") {
			value = 0.50;
		}
		if (s == "dollar") {
			value = 1.00;
		}
		return value;
	}

	/***
	 * reset() -- initialize a Coin precond: s is "heads" or "tails", 0.0 <= d <=
	 * 1.0 postcond: Coin's attribs reset to starting vals
	 ***/
	public void reset(String s, double d) {
		bias = d;
		face = s;
	}

	/***
	 * String flip() -- simulates a Coin flip precond: bias is a double on interval
	 * [0.0,1.0] (1.0 indicates always heads, 0.0 always tails) postcond: upFace
	 * updated to reflect result of flip. flipCtr incremented by 1. Either headsCtr
	 * or tailsCtr incremented by 1, as approp. Returns "heads" or "tails"
	 ***/
	public String flip() {
		// this required a search on the intertrash
		Random random = new Random();
		double rnd = random.nextDouble();
		int res = (rnd > bias) ? 1 : 0;

		if (res == 1) {
			tails += 1;
			face = "tails";
		} else {
			heads += 1;
			face = "heads";
		}
		return face;
	}

	/***
	 * boolean equals(Coin) -- checks to see if 2 coins have same face up precond:
	 * other is not null postcond: Returns true if both coins showing heads or both
	 * showing tails. False otherwise.
	 ***/
	public boolean equals(Coin other) {
		return (other.face == face);
	}

	/***
	 * String toString() -- overrides toString() provided by Java precond: n/a
	 * postcond: Return String comprised of name and current face
	 ***/
	public String toString() {
		String res = "\n============= \nName: ";
		res += type + "\n";
		res += "Face: ";
		res += face + "\n";
		res += "=============";
		return res;
	}

}// end class

public class Demo {
	public static void main(String[] args) {
		Coin drop = new Coin();
		Coin dead = new Coin();
		Coin fred = new Coin();
		System.out.println(drop == dead);
		System.out.println(drop == fred);
		System.out.println(drop.equals(dead));
		System.out.println(drop.equals(fred)); 
	}
}