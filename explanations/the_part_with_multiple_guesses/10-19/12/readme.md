# Question 12
## Question
Which could fill \_\_\_\_ without causing a compile-time error?
```java
____ x = 89;
```
a) I and II only  
b) I, II, and IV only  
c) I, II, III, and IV only  
d) I, II, III, IV, and V  
e) None of these
# Answer
As per what we learned in class, these are the sizes of each type:
* `int`: 32 bits
* `byte`: 8 bits
* `short`: 16 bits
* `long`: 64 bits
* `double`: 64 bits

Each bit means that the data type can hold two times as much data. Therefore, each data type holds 2^number of bits that it can hold. 

We start with `byte`. 

A byte can hold numbers with a range of 256 (2^8). This starts from -128 and ends at 127. 

Since `byte` can clearly hold this number, all other datatypes mentioned here can, so the answer is all of them. 

### **The answer is d).**
[Question 11](https://thunderredstar.me/Test-2-Review/explanations/the_part_with_multiple_guesses/10-19/11)

[Question 13](https://thunderredstar.me/Test-2-Review/explanations/the_part_with_multiple_guesses/10-19/13)

**[Demo!](https://cscircles.cemc.uwaterloo.ca/java_visualize/#code=%2F*%20Are%20there%20errors%20during%20compile%3F%20*%2F%0A%0Apublic%20class%20Demo%20%7B%0A%09public%20static%20void%20main(String%5B%5D%20args)%20%7B%0A%09%09int%20x%20%3D%2089%3B%0A%09%09byte%20x1%20%3D%2089%3B%0A%09%09short%20x2%20%3D%2089%3B%0A%09%09long%20x3%20%3D%2089%3B%0A%09%09double%20x4%20%3D%2089%3B%0A%09%7D%0A%7D)**