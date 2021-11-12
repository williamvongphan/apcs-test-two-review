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