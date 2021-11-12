# Question 18
## Question
Which could fill \_\_\_\_ without causing a compile-time error?
```java
____ x = 160;
```
a) I and II only  
b) I, III, IV, and V only  
c) I, II, and IV only  
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

`byte` cannot hold this number as 160 > 127. Therefore, we move onto the next-smallest datatype. 

A short can hold numbers with a range of 65536 (2^16). This starts from -32768 and ends at 32767. 

Since 160 < 32767, the `short` datatype can hold 160. All datatypes, above that, can hold 160.

### **The answer is b).**
[Question 17](https://thunderredstar.me/Test-2-Review/explanations/the_part_with_multiple_guesses/10-19/17)

[Question 19](https://thunderredstar.me/Test-2-Review/explanations/the_part_with_multiple_guesses/10-19/19)