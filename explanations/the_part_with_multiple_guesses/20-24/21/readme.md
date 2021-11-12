# Question 21
## Question
After execution of this code segment, what is the value of `sum`?
```java
int p = 3; int q = 1; int sum = 0;
while (p <= 10) {
	sum += p % q;
	p += 1;
	q += 1;
}
```
a) 0  
b) 10  
c) 12  
d) 52  
e) None of these.
## Answer
I'll go through the loop here.

0. `p = 3`, `q = 1`, `sum = 0`  
Is `p <= 10`? 
Yes.
1. `p = 4`, `q = 2`, `sum = 0`  
Is `p <= 10`? 
Yes.
0. `p = 5`, `q = 3`, `sum = 0`  
Is `p <= 10`? 
Yes.
0. `p = 6`, `q = 4`, `sum = 2`  
Is `p <= 10`? 
Yes.
0. `p = 7`, `q = 5`, `sum = 4`  
Is `p <= 10`? 
Yes.
0. `p = 8`, `q = 6`, `sum = 6`  
Is `p <= 10`? 
Yes.
0. `p = 9`, `q = 7`, `sum = 8`  
Is `p <= 10`? 
Yes.
0. `p = 10`, `q = 8`, `sum = 10`  
Is `p <= 10`? 
Yes.
0. `p = 11`, `q = 9`, `sum = 12`  
Is `p <= 10`? 
No. Stop loop and report `sum`.

`sum` is 12 at the end of the loop.

### **The answer is c).**

[Question 20](https://thunderredstar.me/Test-2-Review/explanations/the_part_with_multiple_guesses/20-24/20)

[Question 22](https://thunderredstar.me/Test-2-Review/explanations/the_part_with_multiple_guesses/20-24/22)