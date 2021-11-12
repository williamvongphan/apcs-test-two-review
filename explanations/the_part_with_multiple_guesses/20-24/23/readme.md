# Question 23
## Question
Given this method definition, 
```java
public static void twist (String[] w) {
	String temp = w[0].substring(0, 1);
	w[0] = w[1].substring(0, 1) + w[0].substring(1);
	w[1] = temp + w[1].substring(1);
}
```
What is the output of the following code segment?
```java
String[] words = {"HOW", "NEAT"};
twist(words);
System.out.println(words[0] + " " + words[1]);
```
a) `NOW NOW`  
b) `NOW HOW`  
c) `NOW HEAT`  
d) `HOW NEAT`  
e) `HOW HOW`  
## Answer
`temp` stores the first letter of the first string.
`w[0]` then stores the first letter of the second string followed by the rest of the first string.
`w[1]` holds `temp` followed by the rest of the second string.

Following this protocol, we end up with `NOW HEAT`.

### **The answer is c).**

[Question 22](https://thunderredstar.me/Test-2-Review/explanations/the_part_with_multiple_guesses/20-24/22)

[Question 24](https://thunderredstar.me/Test-2-Review/explanations/the_part_with_multiple_guesses/20-24/24)

**[Demo!](https://cscircles.cemc.uwaterloo.ca/java_visualize/#code=public%20class%20Demo%20%7B%0A%09public%20static%20void%20twist%20(String%5B%5D%20w)%20%7B%0A%09%09String%20temp%20%3D%20w%5B0%5D.substring(0%2C%201)%3B%0A%09%09w%5B0%5D%20%3D%20w%5B1%5D.substring(0%2C%201)%20%2B%20w%5B0%5D.substring(1)%3B%0A%09%09w%5B1%5D%20%3D%20temp%20%2B%20w%5B1%5D.substring(1)%3B%0A%09%7D%0A%09public%20static%20void%20main%20(String%5B%5D%20args)%20%7B%0A%09%09String%5B%5D%20words%20%3D%20%7B%22HOW%22%2C%20%22NEAT%22%7D%3B%0A%09%09twist(words)%3B%0A%09%09System.out.println(words%5B0%5D%20%2B%20%22%20%22%20%2B%20words%5B1%5D)%3B%0A%09%7D%0A%7D)**