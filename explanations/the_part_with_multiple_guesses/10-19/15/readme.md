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
`(int)Math.random() * 5 + 10` gets the integer part of a random number from 0 to 1, multiplies it by 5, and then adds 10. 
The problem here is that `(int)Math.random()` ALWAYS returns 0, so the "random" number will always be 10. 
### d)
`(int)(Math.random() * 5) + 10` takes a random number from 0 to 1, multiplies it by 5 (0 to 5, excluding 5), and gets the integer part, then adds 10. This is the correct algorithm.

### **The correct answer is d).**