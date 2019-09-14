## Make Change Project

### First week homework for Skill Distillery

### Overview


This program simulates a cash transaction interface.

It takes input from the user (item price & amount tendered) and
  returns the change to be given in the form:

      'x' Twenty dollar bills
      'x' Ten dollar bills
      'x' Five dollar bills
      'x' One dollar bills
      'x' Quarters
      'x' Dimes
      'x' Nickels
      'x' Pennies

If the item price is more than amount tendered the user is prompted to
  enter more money.

If the item price is exactly the amount tendered no change is returned.

### How to run

This program is executable as long as you have the JVM installed on your machine.  

### Technologies/topics used

 1) Nested 'while' statement within an 'if' statement.
 2) Variable Casting & comparison.

### Lessons

Working with doubles is tricky. One has to pay close attention to how the JVM
  compares doubles. It worked best in the program to cast a double into an int
  and then multiply by 100.
