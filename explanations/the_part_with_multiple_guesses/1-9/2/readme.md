# Question 2
## Question
Which of the following does NOT display 9.95?  
a) `System.out.println(9 + 0.95);`  
b) `System.out.println(995/100.0);`  
c) `System.out.println(9. + 95/100);`  
d) `System.out.println(9 + 95.0/100);`  
e) `System.out.println(9 + "." + 95);`  
## Answer
#### Answer Choice A
Answer Choice A prints `9 + 0.95`, a float plus an int, which returns **9.95**.

#### Answer Choice B
Answer Choice B prints `995/100.0`, an int divided by a float, which returns a **9.95**.

#### Answer Choice C
Answer Choice C prints `9. + 95/100`, a float plus an int divided by an int. The integer division returns 0, because division of an integer by an integer rounds down to an integer. Therefore the sum is 9.0 + 0, which is **9.0**.

#### Answer Choice D
Answer Choice D prints `9 + 95.0/100`, an int plus a float divided by an int. The division returns a float, so the float plus the int returns **9.95**.

#### Answer Choice E
Answer Choice E prints `9 + "." + 95`, an int concatenated with a string concatenated with an int. This forces all the ints into string form, so it's the same as printing `"9" + "." + "95"`, or **9.95**.

### **The answer is c)**.
[Question 1](https://thunderredstar.me/Test-2-Review/explanations/the_part_with_multiple_guesses/1-9/1)

[Question 3](https://thunderredstar.me/Test-2-Review/explanations/the_part_with_multiple_guesses/1-9/3)

**[Demo!](https://cscircles.cemc.uwaterloo.ca/java_visualize/#code=public%20class%20Demo%20%7B%0A%09public%20static%20void%20main%20(String%5B%5D%20args)%20%7B%0A%09%09System.out.print(%22Choice%20a)%20prints%20%22)%3B%0A%09%09System.out.println(9%20%2B%200.95)%3B%0A%0A%09%09System.out.print(%22Choice%20b)%20prints%20%22)%3B%0A%09%09System.out.println(995%2F100.0)%3B%0A%0A%09%09System.out.print(%22Choice%20c)%20prints%20%22)%3B%0A%09%09System.out.println(9.%20%2B%2095%2F100)%3B%0A%0A%09%09System.out.print(%22Choice%20d)%20prints%20%22)%3B%0A%09%09System.out.println(9%20%2B%2095.0%2F100)%3B%0A%0A%09%09System.out.print(%22Choice%20e)%20prints%20%22)%3B%0A%09%09System.out.println(9%20%2B%20%22.%22%20%2B%2095)%3B%0A%09%7D%0A%7D)**