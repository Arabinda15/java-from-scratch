public class Operators {
    public static void main(String[] args) {
        //Arithmatic operators
        int a = 10;
        int b = 5; 
        System.out.println("a + b = " + (a + b)); // Addition
        System.out.println("a - b = " + (a - b)); // Subtraction
        System.out.println("a * b = " + (a * b)); // Multiplication
        System.out.println("a / b = " + (a / b)); // Division
        System.out.println("a % b = " + (a % b)); // Modulus
        //Relational operators
        System.out.println("a == b: " + (a == b)); // Equal to
        System.out.println("a != b: " + (a != b)); // Not equal to
        System.out.println("a > b: " + (a > b)); // Greater than
        System.out.println("a < b: " + (a < b)); // Less than
        System.out.println("a >= b: " + (a >= b)); // Greater than or equal to
        System.out.println("a <= b: " + (a <= b)); // Less than or equal to 
        //Logical operators
        boolean x = true;
        boolean y = false;
        System.out.println("x && y: " + (x && y)); // Logical AND
        System.out.println("x || y: " + (x || y)); // Logical OR
        System.out.println("!x: " + (!x)); // Logical NOT   
        //Assignment operators
        int c = 10; 
        c += 5; // c = c + 5
        System.out.println("c += 5: " + c);
        c -= 3; // c = c - 3
        System.out.println("c -= 3: " + c);
        c *= 2; // c = c * 2
        System.out.println("c *= 2: " + c);
        c /= 4; // c = c / 4
        System.out.println("c /= 4: " + c);
        //Unary operators
        int d = 5;
        System.out.println("d: " + d);
        d++; // d = d + 1
        System.out.println("d++: " + d);
        d--; // d = d - 1
        System.out.println("d--: " + d);
        // Ternary operator
        int e = (a > b) ? a : b; // If a is greater than b, assign a to e, otherwise assign b to e
        System.out.println("e (ternary operator): " + e);   
        // Bitwise operators
        int f = 5; // 0101 in binary
        System.out.println("f: " + f);
        System.out.println("f & 3: " + (f & 3)); // Bitwise AND (0101 & 0011 = 0001)
        System.out.println("f | 3: " + (f | 3)); // Bitwise OR (0101 | 0011 = 0111)
        System.out.println("f ^ 3: " + (f ^ 3)); // Bitwise XOR (0101 ^ 0011 = 0110)
        System.out.println("~f: " + (~f)); // Bitwise NOT (~0101 = 1010)
        

    }
    
}
