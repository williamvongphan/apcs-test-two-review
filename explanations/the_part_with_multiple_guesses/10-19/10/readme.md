# Question 10
## Question
After the code below is run, what will be the value of s?
```java
int s, w, t, h;
w = 1; t = -4; h = 4; s = -2;
if (t > h) {
	s = t;
}
else if (h > w) {
	s = h;
}
if (h > t) {
	s = s + 1;
}
else {
	s = 100;
}
```
a) 5  
b) 4  
c) 1  
d) -1  
e) None of these  
## Answer
This is a relatively simple question. We can work through it like this:

0. Is `t > h`?  
No, therefore we go to the else statement. 
1. Is `h > w`?
Yes, therefore `s` is now 4. 
2. Is `h > t`?
Yes, therefore `s = s + 1` and therefore `s = 5`. 

### **The answer is a).**
[Question 9](https://thunderredstar.me/Test-2-Review/explanations/the_part_with_multiple_guesses/1-9/9)

[Question 11](https://thunderredstar.me/Test-2-Review/explanations/the_part_with_multiple_guesses/10-19/11)

**[Demo!](https://cscircles.cemc.uwaterloo.ca/java_visualize/#code=public%20class%20Demo%20%7B%0A%09public%20static%20void%20main(String%5B%5D%20args)%20%7B%0A%09%09int%20s%2C%20w%2C%20t%2C%20h%3B%0A%09%09w%20%3D%201%3B%0A%09%09t%20%3D%20-4%3B%0A%09%09h%20%3D%204%3B%0A%09%09s%20%3D%20-2%3B%0A%09%09if%20(t%20%3E%20h)%20%7B%0A%09%09%09s%20%3D%20t%3B%0A%09%09%7D%20else%20if%20(h%20%3E%20w)%20%7B%0A%09%09%09s%20%3D%20h%3B%0A%09%09%7D%0A%09%09if%20(h%20%3E%20t)%20%7B%0A%09%09%09s%20%3D%20s%20%2B%201%3B%0A%09%09%7D%20else%20%7B%0A%09%09%09s%20%3D%20100%3B%0A%09%09%7D%0A%09%7D%0A%7D)**