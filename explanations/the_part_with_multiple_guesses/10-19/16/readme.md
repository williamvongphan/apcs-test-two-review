# Question 16
## Question
If valid, what will this code print?
```java
System.out.println("1" + new String("2") + "3");
```
a) 6  
b) 123  
c) 1 2 3  
d) Syntax error. Will not compile.
e) None of these.
## Answer
The code tries to print a string, namely, the concatenation of a string saying `"1"`, a string saying `"2"`, and a string saying `"3"`. This is valid Java code and will print `"123"`.

### **The answer is b).**
[Question 15](https://thunderredstar.me/Test-2-Review/explanations/the_part_with_multiple_guesses/10-19/15)

[Question 17](https://thunderredstar.me/Test-2-Review/explanations/the_part_with_multiple_guesses/10-19/17)

**[Demo!](https://cscircles.cemc.uwaterloo.ca/java_visualize/#code=public%20class%20Demo%20%7B%0A%09public%20static%20void%20main%20(String%5B%5D%20args)%20%7B%0A%09%09System.out.println(%221%22%20%2B%20new%20String(%222%22)%20%2B%20%223%22)%0A%09%7D%0A%7D)**