# Question 11
## Question
After this code's run, what will be the value of m?
```java
double x = 5; double y = 2;
int m = (int)(x + y + x / y - x * y - x / (10 * y));
```
a) 0  
b) -1  
c) 1  
d) -0.5  
e) None of these  
## Answer
In Java, the compiler forces the program to obey the PEMDAS system and the operates on same operators from left to right. With this in mind, this is the calculation.  
`(int)(5.0 + 2.0 + 5.0 / 2.0 - 5.0 * 2.0 - 5.0 / (10 * 2.0))`  
`(int)(5.0 + 2.0 + 2.5 - 10.0 - 0.25)`    
`(int)(-0.75)`  
`0`  

### **The answer is a).**
[Question 10](https://thunderredstar.me/Test-2-Review/explanations/the_part_with_multiple_guesses/10-19/10)

[Question 12](https://thunderredstar.me/Test-2-Review/explanations/the_part_with_multiple_guesses/10-19/12)

**[Demo!](https://cscircles.cemc.uwaterloo.ca/java_visualize/#code=public%20class%20Demo%20%7B%0A%09public%20static%20void%20main(String%5B%5D%20args)%20%7B%0A%09%09double%20x%20%3D%205%3B%20double%20y%20%3D%202%3B%0A%09%09int%20m%20%3D%20(int)(x%20%2B%20y%20%2B%20x%20%2F%20y%20-%20x%20*%20y%20-%20x%20%2F%20(10%20*%20y))%3B%0A%09%7D%0A%7D)**