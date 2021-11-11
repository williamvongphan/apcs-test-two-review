# Question 3
## Question
What will the following code output?
```java
for (int i = 12; i > 0; x -= 3) {
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
Yes.
1. `i = 9`, `output = "12"`
Is `9 > 0`?