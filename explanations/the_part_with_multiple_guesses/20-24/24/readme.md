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
