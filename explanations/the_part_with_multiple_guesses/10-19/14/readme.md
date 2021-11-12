# Question 14
## Question
After this code is evaluate, the value of ans will be 6.0:
```java
double ans = 25/4;
```
Which code will not set `ans` to 6.25?  
a) `double ans = (double)(25/4)`  
b) `double ans = 25/(double)4.0`  
c) `double ans = (double)25/4`  
d) `double ans = 25/4.0`  
e) `double ans = 25.0/4`
## Answer
The answer is the one that uses a different datatype than `double` because it will either return an error, or within the function, change the value from the true value. 

In a), the value in parentheses evaluate to 6. Typecasting it to double simply changes the data type, not the value. Therefore, the end value is 6.0.

### **The answer is a).** [Question 13](https://thunderredstar.me/Test-2-Review/explanations/the_part_with_multiple_guesses/10-19/13)[Question 15](https://thunderredstar.me/Test-2-Review/explanations/the_part_with_multiple_guesses/10-19/15)