# Question 9
## Question
What is the result of running this code?
(code was edited to make it runnable)
```java
class recursion
{
	int func (int n)
	{
		int result;
		result = func(n - 1);
		return result;
	}
}

class Output {
	public static void main(String[] args)
	{
		recursion obj = new recursion();
		System.out.println(obj.func(12));
	}
}
```
a) 0  
b) 1  
c) -1  
d) compile-time error  
e) runtime error
## Answer
Look at the `func` method in the `recursion` class. The function seems to take in `n`, but doesn't do anything with it. Therefore, the function keeps calling itself without any way to stop. This causes the lovely `java.lang.StackOverflowError` error.

This is a runtime error as the compiler lets the code compile.

### **The answer is e).**
[Question 8](https://thunderredstar.me/Test-2-Review/explanations/the_part_with_multiple_guesses/1-9/8)

[Question 10](https://thunderredstar.me/Test-2-Review/explanations/the_part_with_multiple_guesses/10-19/10)

**[Demo!](https://cscircles.cemc.uwaterloo.ca/java_visualize/#code=class%20recursion%0A%7B%0A%09int%20func%20(int%20n)%0A%09%7B%0A%09%09int%20result%3B%0A%09%09result%20%3D%20func(n%20-%201)%3B%0A%09%09return%20result%3B%0A%09%7D%0A%7D%0A%0Apublic%20class%20Demo%20%7B%0A%09public%20static%20void%20main(String%5B%5D%20args)%0A%09%7B%0A%09%09recursion%20obj%20%3D%20new%20recursion()%3B%0A%09%09System.out.println(obj.func(12))%3B%0A%09%7D%0A%7D)**
