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

**[Demo!](https://cscircles.cemc.uwaterloo.ca/java_visualize/#code=public%20class%20Demo%20%7B%0A%09public%20static%20int%20Disco%20(int%20x%2C%20int%20y)%20%7B%0A%09%09int%20m%20%3D%20x%3B%20int%20i%20%3D%201%3B%0A%09%09while%20(m%20%25%20y%20!%3D%200)%20%7B%0A%09%09%09m%20%3D%20i%20*%20x%3B%0A%09%09%09i%20%2B%3D%201%3B%20%0A%09%09%7D%0A%09%09return%20m%3B%0A%09%7D%0A%0A%09public%20static%20void%20main%20(String%5B%5D%20args)%20%7B%0A%09%09System.out.println(%22Here%20are%20some%20example%20calls%20of%20Disco.%22)%3B%0A%09%09System.out.println(%22Disco%20of%209%20and%206%20is%20%22%20%2B%20Disco(9%2C%206))%3B%0A%09%09System.out.println(%22Disco%20of%2012%20and%208%20is%20%22%20%2B%20Disco(12%2C%208))%3B%0A%09%09System.out.println(%22Disco%20of%2015%20and%203%20is%20%22%20%2B%20Disco(15%2C%203))%3B%0A%09%7D%0A%7D)**