# Question 4
## Question
After this loop has finished, what is the value of i?
```java
int i = 0;
while (i < 8) {
	System.out.print(i);
	i += 1;
}
```
a) 6  
b) 7  
c) 8  
d) 9  
e) 0  
## Answer
Again, it helps to visualize each step of the loop.

0. `i = 0`  
Is `i < 8`?
Yes, print i and continue loop.  
1. `i = 1`  
Is `i < 8`?
Yes, print i and continue loop.  
2. `i = 2`  
Is `i < 8`?
Yes, print i and continue loop.  
3. `i = 3`  
Is `i < 8`?
Yes, print i and continue loop.  
4. `i = 4`  
Is `i < 8`?
Yes, print i and continue loop.  
5. `i = 5`  
Is `i < 8`?
Yes, print i and continue loop.  
6. `i = 6`  
Is `i < 8`?
Yes, print i and continue loop.  
7. `i = 7`  
Is `i < 8`?
Yes, print i and continue loop.  
8. `i = 8`  
Is `i < 8`?
No, stop loop, code block has finished execution.

The final value of `i` is 8. 

### **The answer is c)**
[Question 3](https://thunderredstar.me/Test-2-Review/explanations/the_part_with_multiple_guesses/1-9/3)

[Question 5](https://thunderredstar.me/Test-2-Review/explanations/the_part_with_multiple_guesses/1-9/5)

**[Demo!](https://cscircles.cemc.uwaterloo.ca/java_visualize/#code=public%20class%20Demo%20%7B%0A%09public%20static%20void%20main%20(String%5B%5D%20args)%20%7B%0A%09%09int%20i%20%3D%200%3B%0A%09%09while%20(i%20%3C%208)%20%7B%0A%09%09%09System.out.print(i)%3B%0A%09%09%09i%20%2B%3D%201%3B%0A%09%09%7D%0A%09%09System.out.println(%22%5CnThe%20final%20value%20of%20i%20after%20the%20whole%20loop%20has%20executed%20is%20%22%20%2B%20i)%3B%0A%09%7D%0A%7D)**