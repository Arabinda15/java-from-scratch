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

## Variables

Variables are named memory locations used to store data values in a program. The value of a variable can change during program execution. Each variable must be declared with a specific data type, such as `int`, `double`, `char`, or `String`.

### Rules for Declaring a varible name

* Must not begin with a Digit.
* Name is case sensitive (ex: `Arabind` and `arabind` are different)
* Should not be a Keyword (Like void).
* White Space not allowed (ex:`int Ara bind` is invalid)
* Can contain `Alphabates`,`$ Character`,`_ Character` and `digits` if the    other conditions are met.
  
## Literals
A constant value which can be assigned to the `varible` is called as a Literal.

## Difference Between Data Types, Variables, and Literals

| Data Types | Variables | Literals |
|-------------|------------|-----------|
| Specify the type of data that can be stored. | Store data values and have a name. | Represent the actual constant values assigned. |
| Used while declaring variables. | Used to refer to data in a program. | Used while assigning values to variables. |
| Define the kind of data (`int`, `double`, `char`, `String`). | Can change their values during execution. | Fixed values such as `10`, `3.14`, `'A'`, `"Hello"`. |
| Examples: `int`, `float`, `char`, `boolean`, `String` | Examples: `age`, `price`, `grade`, `name` | Examples: `20`, `99.99`, `'A'`, `"Rahul"` |

### Example 1

```java
int age = 20;
```

- `int` → Data Type
- `age` → Variable
- `20` → Literal

### Example 2

```java
String name = "Rahul";
```

- `String` → Data Type
- `name` → Variable
- `"Rahul"` → Literal

### Conclusion

- **Data Type**: Specifies the kind of data a variable can store.
- **Variable**: A named memory location used to store and access data.
- **Literal**: The actual constant value stored in the variable.

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

### Reading data from the 'Keyboard'

In order to read data from the `keyboard`, java has a `Scanner class`. it has a lot
of methods to read or take data from the Keyboard.

## Syntax

```java
import java.util.Scanner;

Scanner sc = new Scanner(System.in);
```

## Example

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Age: " + age);

        sc.close();
    }
}
```

## Common Scanner Methods

| Method | Description |
|----------|-------------|
| `nextInt()` | Reads an integer value |
| `nextDouble()` | Reads a double value |
| `nextFloat()` | Reads a float value |
| `next()` | Reads a single word |
| `nextLine()` | Reads an entire line |
| `nextBoolean()` | Reads a boolean value |

## Key Points

- `Scanner` belongs to the `java.util` package.
- `System.in` represents the keyboard input stream.
- A `Scanner` object is required to read input from the user.
- Use different methods according to the type of data being read.
- It is good practice to close the scanner using `sc.close()` after use.

## Operator Precedence and Associativity

### Operator Precedence
Operator precedence determines the order in which operators are evaluated in an expression. Operators with higher precedence are evaluated before operators with lower precedence.

### Example
```java
int result = 10 + 5 * 2;
System.out.println(result); // Output: 20
```

**Explanation:**
- `*` has higher precedence than `+`.
- `5 * 2 = 10`
- `10 + 10 = 20`

Using parentheses changes the order of evaluation:

```java
int result = (10 + 5) * 2;
System.out.println(result); // Output: 30
```

## Associativity
Associativity determines the order in which operators of the same precedence are evaluated.

### Left-to-Right Associativity
Most arithmetic operators follow left-to-right associativity.

```java
int result = 20 - 10 - 5;
System.out.println(result); // Output: 5
```

**Explanation:**
- `(20 - 10) - 5`
- `10 - 5 = 5`

### Right-to-Left Associativity
Assignment operators follow right-to-left associativity.

```java
int a, b, c;
a = b = c = 10;

System.out.println(a); // 10
System.out.println(b); // 10
System.out.println(c); // 10
```

**Explanation:**
- `c = 10`
- `b = c`
- `a = b`

## Increment and Decrement Operators

### Increment Operator (`++`)
The increment operator increases the value of a variable by `1`.

### Syntax
```java
variable++;
++variable;
```

### Types of Increment Operators

#### 1. Pre-Increment (`++variable`)
The value is incremented before it is used in the expression.

```java
int a = 5;
int b = ++a;

System.out.println(a); // Output: 6
System.out.println(b); // Output: 6
```

#### 2. Post-Increment (`variable++`)
The value is used first and then incremented.

```java
int a = 5;
int b = a++;

System.out.println(a); // Output: 6
System.out.println(b); // Output: 5
```

## Decrement Operator (`--`)
The decrement operator decreases the value of a variable by `1`.

### Syntax
```java
variable--;
--variable;
```

### Types of Decrement Operators

#### 1. Pre-Decrement (`--variable`)
The value is decremented before it is used in the expression.

```java
int a = 5;
int b = --a;

System.out.println(a); // Output: 4
System.out.println(b); // Output: 4
```

#### 2. Post-Decrement (`variable--`)
The value is used first and then decremented.

```java
int a = 5;
int b = a--;

System.out.println(a); // Output: 4
System.out.println(b); // Output: 5
```

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

