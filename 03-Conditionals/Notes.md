# What is a Conditional Statement?

A **Conditional Statement** is used to make decisions in a program. It executes different blocks of code based on whether a condition is **true** or **false**.

**Syntax:**

```java
if (condition) {
    // Code executes if condition is true
}
```

---

# Types of Conditional Statements

1. `if`
2. `if-else`
3. `if-else-if` Ladder
4. Nested `if`
5. `switch`

---

# 1. if Statement

The `if` statement executes a block of code only when the specified condition is **true**.

### Syntax

```java
if (condition) {
    // Statements
}
```

---

# 2. if-else Statement

The `if-else` statement executes one block if the condition is **true**, otherwise it executes another block.

### Syntax

```java
if (condition) {
    // True block
} else {
    // False block
}
```

---

# 3. if-else-if Ladder

Used when multiple conditions need to be checked.

### Syntax

```java
if (condition1) {
    // Code
} else if (condition2) {
    // Code
} else if (condition3) {
    // Code
} else {
    // Default code
}
```

---

# 4. Nested if Statement

A **Nested if** means placing one `if` statement inside another `if` statement.

### Syntax

```java
if (condition1) {
    if (condition2) {
        // Code
    }
}
```

---

# 5. switch Statement

The `switch` statement selects one block of code from multiple options.

### Syntax

```java
switch (expression) {
    case value1:
        // Code
        break;

    case value2:
        // Code
        break;

    default:
        // Code
}
```

---

# break Statement

The `break` statement terminates the current `switch` case, preventing execution from continuing into the next case.

### Example

```java
switch (choice) {
    case 1:
        System.out.println("Option 1");
        break;

    case 2:
        System.out.println("Option 2");
        break;
}
```
---

# default Statement

The `default` block executes when none of the `case` values match the expression.

### Example

```java
switch (number) {
    case 1:
        System.out.println("One");
        break;

    default:
        System.out.println("Invalid Number");
}
```

---

# Comparison Operators Used in Conditions

| Operator | Meaning                  | Example  |
| -------- | ------------------------ | -------- |
| `==`     | Equal to                 | `a == b` |
| `!=`     | Not equal to             | `a != b` |
| `>`      | Greater than             | `a > b`  |
| `<`      | Less than                | `a < b`  |
| `>=`     | Greater than or equal to | `a >= b` |
| `<=`     | Less than or equal to    | `a <= b` |

---

# Logical Operators

| Operator | Meaning     | Example            |            |         |   |         |
| -------- | ----------- | ------------------ | ---------- | ------- | - | ------- |
| `&&`     | Logical AND | `a > 10 && b < 20` |            |         |   |         |
| `        |             | `                  | Logical OR | `a > 10 |   | b < 20` |
| `!`      | Logical NOT | `!(a > 10)`        |            |         |   |         |

---

# Key Points

* `if` checks a single condition.
* `if-else` chooses between two alternatives.
* `if-else-if` is used for multiple conditions.
* Nested `if` places one `if` inside another.
* `switch` is useful when comparing one expression against multiple constant values.
* Always use `break` in a `switch` case unless intentional fall-through is required.
* The `default` case is optional but recommended.

---

# Summary

Conditional statements help programs make decisions based on conditions.

* Use **if** for one condition.
* Use **if-else** for two possible outcomes.
* Use **if-else-if** for multiple conditions.
* Use **Nested if** for dependent conditions.
* Use **switch** when checking one variable against multiple constant values.
