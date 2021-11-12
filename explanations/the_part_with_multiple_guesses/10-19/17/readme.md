# Question 17
## Question
Assuming class Coin is implemented as we did in class, what output will this generate?
```java
Coin drop = new Coin();
Coin dead = new Coin();
Coin fred = new Coin();
System.out.println(drop == dead);
System.out.println(drop == fred);
System.out.println(drop.equals(dead));
System.out.println(drop.equals(fred)); 
```
a) true, true, false, false  
b) false, false, false, false  
c) true, true, true, true  
d) false, false, true, true  
e) None of these  
## Answer
Comparing two instances of a class we defined ourselves directly will never return true as they are in different memory locations and therefore are not equal. 

However, if we define an `equals()` method, and define the coin's default constructor, the function should return true when comparing two coins with null parameters. 

### **The answer is d).**