# Question 5
## Question
In the code below, comment out assignments and method invocatiosn that the compiler identifies as violations of the rules for referring to class members (aka "static" members).
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
	public /* non-static */ void instanceMethod(int y) {
		classField = 29;
		instanceField = 31;
		classMethod(37);
		instanceMethod(41);
	}
}
```
You commented out...
a) exactly 1 line in each method   
b) exactly 2 lines in each method  
c) exactly 1 line in one method, and 2 or more lines in the other method  
d) all of the lines in one method that contain "class"  
e) None of these  
## Answer
The question asks you to only comment out violations of the rules for **class members**. The below code block displays the two lines that the compiler identifies as errors, and why. 

```java
public class GrokStatic {
	public static int classField;
	public /* non-static */ int instanceField;

	public static void classMethod(int x) {
		classField = 13;
		// instanceField = 17;
		// referring to an instanceField from a static method. but which instance? therefore compiler throws error.
		classMethod(19);
		// instanceMethod(23);
		// referring to an instanceMethod from a static method. but which instance? therefore compiler throws error.
	}
	public /* non-static */ void instanceMethod(int y) {
		classField = 29;
		instanceField = 31;
		classMethod(37);
		instanceMethod(41);
	}
}
```

There are no errors in one method, and two errors in another method. 

### **The answer is e).**
[Question 4](https://thunderredstar.me/Test-2-Review/explanations/the_part_with_multiple_guesses/1-9/4)

[Question 6](https://thunderredstar.me/Test-2-Review/explanations/the_part_with_multiple_guesses/1-9/6)