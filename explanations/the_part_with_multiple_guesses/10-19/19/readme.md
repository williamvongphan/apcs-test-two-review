# Question 19
## Question
What is the value of y after the following code is executed?
```java
int x = 123; int y = 0;
while (x > 0) {
	y *= 10;
	y += x % 10;
	x /= 10
}
```
a) 3  
b) 6  
c) 12  
d) 321  
e) None of these  
## Answer
As always, it's helpful to look at each iteration the loop takes on here. 

0. `x = 123`, `y = 0`  
Is `x > 0`?