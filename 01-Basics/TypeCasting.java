public class TypeCasting {
    public static void main(String[] args) {

        // Implicit Casting
        int a = 10;
        double b = a;
        System.out.println("Implicit Casting:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        // Explicit Casting
        double c = 20.75;
        int d = (int) c;
        System.out.println("\nExplicit Casting:");
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}