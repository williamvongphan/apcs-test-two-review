# Question 6
## Question
Recursion is a method in which the solution of a problem depends on
a) Larger instances of different problems.  
b) Larger instances of the same problem.  
c) Smaller instances of the same problem.  
d) Smaller instances of different problems.   
e) None of the above.   
## Answer
The factorial, not necessarily in the programming form, is a good example of a recursive problem. Here is a code sample:
```java
public static int factorial (int number) {
	if (n < 1) {
		return 1;
	}
	else {
		return n * factorial(number - 1);
	}
}
```
One can see here the the factorial function takes a number, and calls *itself* on a *smaller* number (number - 1). 

### **The answer is c).**
[Question 5](https://thunderredstar.me/Test-2-Review/explanations/the_part_with_multiple_guesses/1-9/5)

[Question 7](https://thunderredstar.me/Test-2-Review/explanations/the_part_with_multiple_guesses/1-9/7)
