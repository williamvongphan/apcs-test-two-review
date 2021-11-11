class recursion
{
	int func (int n)
	{
		int result;
		result = func(n - 1);
		return result;
	}
}

public class Demo {
	public static void main(String[] args)
	{
		recursion obj = new recursion();
		System.out.println(obj.func(12));
	}
}