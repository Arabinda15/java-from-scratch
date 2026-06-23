public class IncrementDecrement {
    public static void main(String[] args) {

        // Pre-Increment
        int a = 5;
        int b = ++a;
        System.out.println("Pre-Increment:");
        System.out.println("a = " + a); // 6
        System.out.println("b = " + b); // 6

        // Post-Increment
        int c = 5;
        int d = c++;
        System.out.println("\nPost-Increment:");
        System.out.println("c = " + c); // 6
        System.out.println("d = " + d); // 5

        // Pre-Decrement
        int e = 5;
        int f = --e;
        System.out.println("\nPre-Decrement:");
        System.out.println("e = " + e); // 4
        System.out.println("f = " + f); // 4

        // Post-Decrement
        int g = 5;
        int h = g--;
        System.out.println("\nPost-Decrement:");
        System.out.println("g = " + g); // 4
        System.out.println("h = " + h); // 5
    }
}