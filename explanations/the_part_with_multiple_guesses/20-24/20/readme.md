# Question 20
## Question
Consider the boolean expression, with integers a, b, c:
```java
((a == b) || !(c <= b)) || meMaybe();
```
Which would result in `meMaybe()` being called?
a) b < c
b) a == b
c) a < b < c
d) a > b > c
e) None of these
## Answer
Java evaluates the boolean expression such that it terminates calculation when it can ascertain that a value is guaranteed. 

`meMaybe()` would be called if `((a == b) || !(c <= b))` is false. 

Therefore, both `(a == b)` and `!(c <= b)` would be false. 

`c <= b` would be true, and `a != b` would also be true. 

d) is the only answer choice that fits here. 

### **The answer is d).**
[Question 19](https://thunderredstar.me/Test-2-Review/explanations/the_part_with_multiple_guesses/10-19/19)
[Question 21](https://thunderredstar.me/Test-2-Review/explanations/the_part_with_multiple_guesses/20-24/21)

**[Demo!](https://cscircles.cemc.uwaterloo.ca/java_visualize/#code=%2F*%20When%20testing%20in%20the%20visualizer%2C%20don't%20forget%20the%20command%20line%20args!%20*%2F%0A%0Apublic%20class%20Demo%20%7B%0A%09public%20static%20void%20main%20(String%5B%5D%20args)%20%7B%0A%09%09a%20%3D%20parseInt(args%5B0%5D)%3B%0A%09%09b%20%3D%20parseInt(args%5B1%5D)%3B%0A%09%09c%20%3D%20parseInt(args%5B2%5D)%3B%0A%09%09((a%20%3D%3D%20b)%20%7C%7C%20!(c%20%3C%3D%20b))%20%7C%7C%20meMaybe()%3B%0A%09%7D%0A%0A%09public%20static%20void%20meMaybe%20()%20%7B%0A%09%09System.out.println(%22I%20was%20called!%20Yay!%22)%3B%0A%09%7D%0A%7D)**