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