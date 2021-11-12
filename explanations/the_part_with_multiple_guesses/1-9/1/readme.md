# Question 1
## Question
Given the boolean expression:
```java
!(p && b) && (!p || b)
```
Which of the following conditions must be true for the expression to evaluate to true?

a) p is true  
b) p is false  
c) p and b have the same truth value  
d) p and b have different truth values   
e) None of these
## Answer

Since there are only two boolean values, you could test each case, because there are only four. 

#### `p` is true and `b` is true = **false**
`!(true && true) && (!true || true)`  
`!(true) && (false || true)`  
`false && true`  
`false`
#### `p` is false and `b` is true = **true**
`!(false && true) && (!false || true)`  
`!(false) && (true || true)`  
`true && true`  
`true`
#### `p` is true and `b` is false = **false**
`!(true && false) && (!true || false)`  
`!(false) && (false || false)`  
`true && false`  
`false`
#### `p` is false and `b` is false = **true**
`!(false && false) && (!false || false)`  
`!(false) && (true || false)`  
`true && true`  
`true`

When `p` is true, the expression is false. When `p` is false, the expression is true. 

### **The answer is b)**.
[Question 2](https://thunderredstar.me/Test-2-Review/explanations/the_part_with_multiple_guesses/1-9/2)

**[Demo!](https://cscircles.cemc.uwaterloo.ca/java_visualize/#code=public%20class%20Demo%20%7B%0A%09public%20static%20void%20main%20(String%5B%5D%20args)%20%7B%0A%09%09%2F*%0A%09%09%20*A%20Java%20demo%20of%20Question%201.%0A%09%09%20*%2F%0A%0A%09%09boolean%20p%3B%0A%09%09boolean%20b%3B%0A%0A%09%09p%20%3D%20true%3B%20%0A%09%09b%20%3D%20true%3B%0A%0A%09%09System.out.println(%22When%20p%20is%20true%20and%20b%20is%20true%2C%20the%20expression%20is%20%22%20%2B%20expression(p%2C%20b))%3B%0A%0A%09%09p%20%3D%20true%3B%20%0A%09%09b%20%3D%20false%3B%0A%0A%09%09System.out.println(%22When%20p%20is%20true%20and%20b%20is%20false%2C%20the%20expression%20is%20%22%20%2B%20expression(p%2C%20b))%3B%0A%0A%09%09p%20%3D%20false%3B%20%0A%09%09b%20%3D%20true%3B%0A%0A%09%09System.out.println(%22When%20p%20is%20false%20and%20b%20is%20true%2C%20the%20expression%20is%20%22%20%2B%20expression(p%2C%20b))%3B%0A%0A%09%09p%20%3D%20false%3B%20%0A%09%09b%20%3D%20false%3B%0A%0A%09%09System.out.println(%22When%20p%20is%20false%20and%20b%20is%20false%2C%20the%20expression%20is%20%22%20%2B%20expression(p%2C%20b))%3B%0A%09%7D%0A%0A%09public%20static%20boolean%20expression%20(boolean%20p%2C%20boolean%20b)%20%7B%0A%09%09return%20!(p%20%26%26%20b)%20%26%26%20(!p%20%7C%7C%20b)%3B%0A%09%7D%0A%7D)**