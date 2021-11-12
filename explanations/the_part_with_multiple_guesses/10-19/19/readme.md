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
Is `x > 0`? Yes.
1. `x = 12`, `y = 3`  
Is `x > 0`? Yes.
2. `x = 1`, `y = 32`  
Is `x > 0`? Yes. 
3. `x = 0`, `y = 321`  
Is `x > 0`? No. Stop loop and report y value.

The final value of y is 321. 

### **The answer is d).**
[Question 18](https://thunderredstar.me/Test-2-Review/explanations/the_part_with_multiple_guesses/10-19/18)

[Question 20](https://thunderredstar.me/Test-2-Review/explanations/the_part_with_multiple_guesses/20-24/20)

**[Demo!](https://cscircles.cemc.uwaterloo.ca/java_visualize/#code=public%20class%20Demo%20%7B%0A%09public%20static%20void%20main%20(String%5B%5D%20args)%20%7B%0A%09%09int%20x%20%3D%20123%3B%20int%20y%20%3D%200%3B%0A%09%09while%20(x%20%3E%200)%20%7B%0A%09%09%09y%20*%3D%2010%3B%0A%09%09%09y%20%2B%3D%20x%20%25%2010%3B%0A%09%09%09x%20%2F%3D%2010%0A%09%09%7D%0A%09%09System.out.println(%22The%20final%20value%20of%20y%20is%20%22%20%2B%20y)%0A%09%7D%0A%7D)**