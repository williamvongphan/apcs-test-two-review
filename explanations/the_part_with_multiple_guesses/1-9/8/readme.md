# Question 8
## Question
If g has been declared as an int, which of the following attempts to initialize g will yield an error?
a) `g = 1024;`
b) `g = 475 / 2;`
c) `g = 5 / 7;`
d) `g = 3.9 / 1.3;`
e) None of these
## Answer
Answer choice d) contains two floats, which, when divided, will return a float. This will return an error, since the compiler wants to avoid lossy conversion and will only do so when explicit typecasting occurs.

The rest of the answer choices return ints and therefore are valid. 

### **The answer is d).**