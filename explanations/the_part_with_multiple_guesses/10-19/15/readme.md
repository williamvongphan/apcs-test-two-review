# Question 15
## Question
Which of the following returns a random integer in the range [10, 15)?

a) `Math.random() * 15`  
b) `(int)Math.random() + 15`  
c) `(int)Math.random() * 5 + 10`  
d) `(int)(Math.random() * 5) + 10`  
e) None of these  
## Answer
We can use a process of elimination here.
### a)
`Math.random()` returns a random number between 0 and 1.  
Therefore, `Math.random() * 15` would return a random number between 0 and 15. 
### b)
`(int)Math.random() + 15` merely truncates the decimal off a wrong answer, therefore it's wrong too.
### c)
