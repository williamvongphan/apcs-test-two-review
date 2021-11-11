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