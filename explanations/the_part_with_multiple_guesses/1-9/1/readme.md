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

### **The answer is a)**.