# Question 3
## Question
What will the following code output?
```java
for (int i = 12; i > 0; i -= 3) {
	System.out.println(i);
}
```
a) `129630`  
b) `12963`  
c) `121110987654321`  
d) `1211109876543210`  
e) `12108642`
## Answer
It's helpful to look at each step of the loop. Here's what I did:

0. `i = 12`, `output = ""`  
Is `12 > 0`?
Yes. Print i and run decrement `i` by 3.
1. `i = 9`, `output = "12"`  
Is `9 > 0`?
Yes. Print i and run decrement `i` by 3.
2. `i = 6`, `output = "129"`  
Is `6 > 0`?
Yes. Print i and run decrement `i` by 3.
3. `i = 3`, `output = "1296"`  
Is `3 > 0`?
Yes. Print i and run decrement `i` by 3.
4. `i = 0`, `output = "12963"`  
Is `0 > 0`?
No. Loop stops and code is done executing.

The output is `"12963"`.

### **The answer is b).**
