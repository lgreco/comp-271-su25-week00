# COMP 271 SU25 WEEK 00

A simple discussion on realistic data structures.

Your assinment for the first week has two parts.

# Explain
Explain in your own words how the loops in lines 40-45 in class [Realistic.java](./Realistic.java) work. Specifically discuss the range of the first loop (ie, the values variable `i` takes), the range of the second loop, and also the index positions for the arrays inside both loops. In the first loop the assignment is
```java
temporary[i] = arr[i];
```
and in the second loop we have
```java
temporary[i-1] = arr[i];
```
Why?

# Code
Add a method with the following header
```java
public static void add(int value)
```
that increases the size of array `arr` by one and places the `value` in its last position.