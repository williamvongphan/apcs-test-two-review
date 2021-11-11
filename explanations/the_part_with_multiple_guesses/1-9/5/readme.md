# Question 5
## Question
In the code below, comment out assignments and method invocatiosn that the compiler identifies as violations of the rules for referring to class members (aka "static" members)
```java
public class GrokStatic {
	public static int classField;
	public /* non-static */ int instanceField;

	public static void classMethod(int x) {
		classField = 13;
		instanceField = 17;
		classMethod(19);
		instanceMethod(23);
	}
	public /* non-static */ void instanceMethod(int y)
	}
}
```
* a)
* b)
* c)
* d)
* e)
## Answer
