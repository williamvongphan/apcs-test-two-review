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
[Question 7](https://thunderredstar.me/Test-2-Review/explanations/the_part_with_multiple_guesses/1-9/7)

[Question 9](https://thunderredstar.me/Test-2-Review/explanations/the_part_with_multiple_guesses/1-9/9)

**[Demo!](https://cscircles.cemc.uwaterloo.ca/java_visualize/#code=%2F*%20Try%20compiling%20this%20code.%20*%2F%0A%0Apublic%20class%20Main%20%7B%0A%09public%20static%20void%20main(String%5B%5D%20args)%20%7B%0A%09%09int%20g%3B%0A%09%09g%20%3D%201024%3B%0A%09%09g%20%3D%20475%20%2F%202%3B%0A%09%09g%20%3D%205%20%2F%207%3B%0A%09%09g%20%3D%203.9%20%2F%201.3%3B%0A%09%7D%0A%7D)**