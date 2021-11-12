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