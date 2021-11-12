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

### **The answer is a).** 
[Question 13](https://thunderredstar.me/Test-2-Review/explanations/the_part_with_multiple_guesses/10-19/13)

[Question 15](https://thunderredstar.me/Test-2-Review/explanations/the_part_with_multiple_guesses/10-19/15)

**[Demo!](https://cscircles.cemc.uwaterloo.ca/java_visualize/#code=public%20static%20Demo%20%7B%0A%09public%20static%20void%20main%20(String%5B%5D%20args)%20%7B%0A%09%09System.out.println(%22Answer%20choice%20a%20evaluates%20to%20%22%20%2B%20(double)(25%2F4))%0A%09%09System.out.println(%22Answer%20choice%20b%20evaluates%20to%20%22%20%2B%2025%2F(double)4.0)%0A%09%09System.out.println(%22Answer%20choice%20c%20evaluates%20to%20%22%20%2B%20(double)25%2F4)%0A%09%09System.out.println(%22Answer%20choice%20d%20evaluates%20to%20%22%20%2B%2025%2F4.0)%0A%09%09System.out.println(%22Answer%20choice%20e%20evaluates%20to%20%22%20%2B%2025.0%2F4)%0A%09%7D%20%0A%7D)**