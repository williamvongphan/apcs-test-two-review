# Question 22
## Question
Which is the best description of `disco`?
```java
int Disco (int x, int y) {
	int m = x; int i = 1;
	while (m % y != 0) {
		m = i * x;
		i += 1; 
	}
	return m;
}
```
a) Returns the greatest common factor of x and y  
b) A vegan alternative to Crisco  
c) Returns the least common multiple of x and y  
d) Returns the least common factor of x and y  
e) Returns y * x
## Answer
There isn't a better way to do this so here goes a process of elimination:

### a)
A is wrong because if we were returning factors, the values of `m` would be divided, not multiplied. Plus, why is the variable name `m` in the first place?

### b)
B is wrong because Crisco is already vegan and therefore cannot have a vegan alternative.

### c) 
There are no visible problems with this explanation.

### d)
D is wrong because the least common factor is 1 and this can be obtained in a much easier way. 

### e)
E is wrong because `y * x` is much easier to obtain than showed in the function.

### **The answer is c).**
[Question 21](https://thunderredstar.me/Test-2-Review/explanations/the_part_with_multiple_guesses/20-24/21)

[Question 23](https://thunderredstar.me/Test-2-Review/explanations/the_part_with_multiple_guesses/20-24/23)