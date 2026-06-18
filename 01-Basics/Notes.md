# Java Basics

## What is Java?

Java is a high-level, object-oriented, platform-independent programming language developed by Sun Microsystems (now owned by Oracle). It follows the principle of "Write Once, Run Anywhere" (WORA), allowing Java programs to run on any system that has a Java Virtual Machine (JVM). Java is widely used for developing desktop applications, web applications, mobile applications, enterprise software, and embedded systems.

## Features of Java

* Platform Independent
* Object-Oriented
* Secure
* Robust
* Multithreaded
* Portable

## Structure of a Java Program

### Class

A class is a blueprint or template for creating objects. It defines the properties (variables) and behaviors (methods) that objects of the class will have. In Java, every program is organized into classes.

### Example:
``` java 
public class Student {
    String name;      // Property
    int age;          // Property

    void display() {  // Method
        System.out.println("Student details");
    }
}
```
### main() Method

The `main()` method is the entry point of a Java program. Program execution starts from this method. It is declared as `public static void main(String[] args)` and is called automatically by the Java Virtual Machine (JVM) when the program runs.

### Statements

Instructions executed by the program. Each statement ends with a semicolon (;).

### Comments

Comments are used to improve code readability.

* Single-line comment: `//`
* Multi-line comment: `/* */`

## Variables

Variables are named memory locations used to store data values in a program. The value of a variable can change during program execution. Each variable must be declared with a specific data type, such as `int`, `double`, `char`, or `String`.

### Rules for Declaring a varible name

* Must not begin with a Digit.
* Name is case sensitive (ex: `Arabind` and `arabind` are different)
* Should not be a Keyword (Like void).
* White Space not allowed (ex:`int Ara bind` is invalid)
* Can contain `Alphabates`,`$ Character`,`_ Character` and `digits` if the    other conditions are met.
  

## Data Types

Data types specify the type of data that a variable can store. Java provides two categories of data types: primitive and non-primitive.

### Primitive Data Types

* `byte` : Stores integer values from -128 to 127.
* `short` : Stores integer values in a smaller range than `int`.
* `int` : Stores whole numbers.
* `long` : Stores large whole numbers.
* `float` : Stores decimal numbers with single precision.
* `double` : Stores decimal numbers with double precision.
* `char` : Stores a single character.
* `boolean` : Stores `true` or `false`.

### Non-Primitive Data Types

* `String`
* `Arrays`
* `Classes`
* `Interfaces`
* `Objects`

## Operators

Operators are special symbols used to perform operations on variables and values. They are used to manipulate data and evaluate expressions in a Java program.

### Types of Operators

* **Arithmetic Operators** (`+`, `-`, `*`, `/`, `%`) – Perform mathematical operations.
* **Relational Operators** (`==`, `!=`, `>`, `<`, `>=`, `<=`) – Compare two values.
* **Logical Operators** (`&&`, `||`, `!`) – Combine or negate conditions.
* **Assignment Operators** (`=`, `+=`, `-=`, `*=`, `/=`, `%=`) – Assign values to variables.
* **Unary Operators** (`++`, `--`, `+`, `-`, `!`) – Operate on a single operand.
* **Bitwise Operators** (`&`, `|`, `^`, `~`, `<<`, `>>`) – Perform operations on individual bits.
* **Ternary Operator** (`?:`) – A shorthand form of the `if-else` statement.

## Type Casting

Type casting is the process of converting a value from one data type to another. In Java, type casting is of two types:

### 1. Widening Casting (Implicit)

Converts a smaller data type into a larger data type automatically.

**Example:**

```java
int num = 10;
double value = num;   // int to double

System.out.println(value); // 10.0
```

### 2. Narrowing Casting (Explicit)

Converts a larger data type into a smaller data type manually using the cast operator.

**Example:**

```java
double value = 10.75;
int num = (int) value;   // double to int

System.out.println(num); // 10
```

Type casting is useful when performing operations involving different data types.


## Input and Output

The `Scanner` class is used to take input from the user.
`System.out.println()` is used to display output.

