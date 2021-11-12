# Question 24
## Question
What is the value of n after the following code is executed?
```java
int n = 253;
for (int i = 0; i < 50; i++) n = (n + 3) / 2;
```
a) 1
b) 2
c) 3
d) 65
e) None of these.
## Answer
We can go through the loop. 

0. `n = 253`, `i = 0`  
Is `i < 50`?
Yes, iterate.
1. `n = 128`, `i = 1`  
Is `i < 50`?
Yes, iterate.
2. `n = 65`, `i = 2`  
Is `i < 50`?
Yes, iterate.
3. `n = 34`, `i = 3`  
Is `i < 50`?
Yes, iterate.
4. `n = 18`, `i = 4`  
Is `i < 50`?
Yes, iterate.
5. `n = 10`, `i = 5`  
Is `i < 50`?
Yes, iterate.
6. `n = 6`, `i = 6`  
Is `i < 50`?
Yes, iterate.
7. `n = 4`, `i = 7`  
Is `i < 50`?
Yes, iterate.
8. `n = 3`, `i = 8`  
Is `i < 50`?
Yes, iterate.
9. `n = 3`, `i = 9`  
Is `i < 50`?
Yes, iterate.
10. `n = 3`, `i = 10`  
Is `i < 50`?
Yes, iterate.
...

As we can see, around 8/50 iterations, n stabilizes at 3. Since n is not moving, it is safe to assume that the final value of n is 3. 

### **The answer is c).**

[Question 23](https://thunderredstar.me/Test-2-Review/explanations/the_part_with_multiple_guesses/20-24/23)


**[Demo!](https://cscircles.cemc.uwaterloo.ca/java_visualize/#code=public%20class%20Demo%20%7B%0A%09public%20static%20void%20main%20(String%5B%5D%20args)%20%7B%0A%09%09int%20n%20%3D%20253%3B%0A%09%09for%20(int%20i%20%3D%200%3B%20i%20%3C%2050%3B%20i%2B%2B)%20n%20%3D%20(n%20%2B%203)%20%2F%202%3B%0A%09%09System.out.println(%22n%20is%20now%20%22%20%2B%20n)%3B%0A%09%7D%0A%7D)**