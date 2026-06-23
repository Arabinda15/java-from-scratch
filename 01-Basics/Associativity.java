public class Associativity {
    public static void main(String [] args) {

        // Operator Precedence
        int num1 = 10 + 5 * 2;
        System.out.println("10 + 5 * 2 = " + num1);

        // Using parentheses to change precedence
        int num2= (10 + 5) * 2;
        System.out.println("(10 + 5) * 2 = " + num2);

        // Associativity (Left to Right)
        int num3 = 20 - 10 - 5;
        System.out.println("20 - 10 - 5 = " + num3);
        int num4 = 6 * 5 - 34 / 2;
        System.out.println("6 * 5 - 34 / 2 = " + num4);

        // Associativity (Right to Left)
        int a, b, c;
        a = b = c = 10;
        System.out.println("a = " + a + ", b = " + b + ", c = " + c);
    }
}
