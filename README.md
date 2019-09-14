## Make Change Project

### First week homework for Skill Distillery

### Overview


This program simulates a cash transaction interface.

It takes input from the user (item price & amount tendered) and
  returns the change to be given in the form:
  
    Change Due: $x.xx
    ----------------------------
      'x' Twenty dollar bills
      'x' Ten dollar bills
      'x' Five dollar bills
      'x' One dollar bills
      'x' Quarters
      'x' Dimes
      'x' Nickels
      'x' Pennies
    ----------------------------
If the item price is more than amount tendered the user is prompted to
  enter more money.

If the item price is exactly the amount tendered no change is returned.

If the amount tendered is less than item price the user is prompted to enter more money.

### How to run

This program is executable as long as you have the JVM installed on your machine.

  1) Enter a valid int or double representing the cost of the item
  2) Enter a valid int or double representing the amount tendered

### Technologies/topics used

 1) Nested 'while' statement within an 'if' statement
 2) Variable casting & comparison
 4) Math (not java.lang.Math) with doubles & integers
 3) Use of static variables & methods

### Lessons

1) Working with doubles is tricky. One has to pay close attention to how the JVM
    compares doubles. It worked best in the program to cast a double into an int
    and then multiply by 100.
  
2) By using static variables, the methods were able to pull the class level variables
    into themselves to do the comparisons & math. Without the use of arrays or 
    hashMaps, passing multiple variables between the methods would have been messy.
