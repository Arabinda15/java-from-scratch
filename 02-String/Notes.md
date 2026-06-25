# String in Java

## Definition

A **String** is a sequence of characters used to store text data. In Java, strings are objects of the `String` class.

## Syntax

```java
String name = "Arabinda";
```

### Components

* `String` → Data Type (Class)
* `name` → Variable Name
* `"Arabinda"` → String Literal

## String Methods

## Introduction

Java provides many built-in methods in the `String` class to perform operations on strings such as finding length, comparing strings, changing case, extracting characters, and more.

### 1. length()

Returns the number of characters in a string.

```java
String str = "Java";
System.out.println(str.length());
```

**Output**

```
4
```

---

### 2. charAt()

Returns the character at the specified index.

```java
String str = "Java";
System.out.println(str.charAt(1));
```

**Output**

```
a
```

---

### 3. toUpperCase()

Converts all characters to uppercase.

```java
String str = "java";
System.out.println(str.toUpperCase());
```

**Output**

```
JAVA
```

---

### 4. toLowerCase()

Converts all characters to lowercase.

```java
String str = "JAVA";
System.out.println(str.toLowerCase());
```

**Output**

```
java
```

---

### 5. equals()

Compares two strings for equality.

```java
String str1 = "Java";
String str2 = "Java";

System.out.println(str1.equals(str2));
```

**Output**

```
true
```

---

### 6. equalsIgnoreCase()

Compares two strings ignoring case differences.

```java
String str1 = "JAVA";
String str2 = "java";

System.out.println(str1.equalsIgnoreCase(str2));
```

**Output**

```
true
```

---

### 7. concat()

Joins two strings.

```java
String first = "Hello";
String second = " World";

System.out.println(first.concat(second));
```

**Output**

```
Hello World
```

---

### 8. contains()

Checks whether a string contains a specific sequence of characters.

```java
String str = "Hello Java";

System.out.println(str.contains("Java"));
```

**Output**

```
true
```

---

### 9. startsWith()

Checks if a string starts with specified characters.

```java
String str = "Java Programming";

System.out.println(str.startsWith("Java"));
```

**Output**

```
true
```

---

### 10. endsWith()

Checks if a string ends with specified characters.

```java
String str = "Java Programming";

System.out.println(str.endsWith("ing"));
```

**Output**

```
true
```

---

### 11. indexOf()

Returns the index of the first occurrence of a character or substring.

```java
String str = "Java";

System.out.println(str.indexOf('v'));
```

**Output**

```
2
```

---

### 12. replace()

Replaces characters or words in a string.

```java
String str = "Java";

System.out.println(str.replace('J', 'K'));
```

**Output**

```
Kava
```

---

### 13. substring()

Extracts a part of a string.

```java
String str = "Programming";

System.out.println(str.substring(0, 4));
```

**Output**

```
Prog
```

---

### 14. trim()

Removes leading and trailing spaces.

```java
String str = "  Java  ";

System.out.println(str.trim());
```

**Output**

```
Java
```

---

### 15. isEmpty()

Checks whether a string is empty.

```java
String str = "";

System.out.println(str.isEmpty());
```

**Output**

```
true
```

---

## Summary Table

| Method             | Purpose                    |
| ------------------ | -------------------------- |
| length()           | Returns string length      |
| charAt()           | Returns character at index |
| toUpperCase()      | Converts to uppercase      |
| toLowerCase()      | Converts to lowercase      |
| equals()           | Compares strings           |
| equalsIgnoreCase() | Compares ignoring case     |
| concat()           | Joins strings              |
| contains()         | Checks substring           |
| startsWith()       | Checks starting characters |
| endsWith()         | Checks ending characters   |
| indexOf()          | Finds position             |
| replace()          | Replaces characters        |
| substring()        | Extracts part of string    |
| trim()             | Removes extra spaces       |
| isEmpty()          | Checks if string is empty  |

## Conclusion

String methods help perform various text operations efficiently. They are commonly used for searching, comparing, modifying, and analyzing text data in Java programs.
