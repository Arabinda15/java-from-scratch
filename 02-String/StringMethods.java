public class StringMethods {
    public static void main(String[] args) {

        String str = "Hello Java";

        // length()
        System.out.println("Length: " + str.length());

        // charAt()
        System.out.println("Character at index 1: " + str.charAt(1));

        // toUpperCase()
        System.out.println("Uppercase: " + str.toUpperCase());

        // toLowerCase()
        System.out.println("Lowercase: " + str.toLowerCase());

        // equals()
        System.out.println("Equals: " + str.equals("Hello Java"));

        // equalsIgnoreCase()
        System.out.println("Equals Ignore Case: "
                + str.equalsIgnoreCase("hello java"));

        // concat()
        System.out.println("Concat: " + str.concat(" Programming"));

        // contains()
        System.out.println("Contains Java: " + str.contains("Java"));

        // startsWith()
        System.out.println("Starts With Hello: "
                + str.startsWith("Hello"));

        // endsWith()
        System.out.println("Ends With Java: "
                + str.endsWith("Java"));

        // indexOf()
        System.out.println("Index of J: " + str.indexOf('J'));

        // replace()
        System.out.println("Replace Java with World: "
                + str.replace("Java", "World"));

        // substring()
        System.out.println("Substring: " + str.substring(0, 5));

        // trim()
        String text = "   Java Programming   ";
        System.out.println("Trim: " + text.trim());

        // isEmpty()
        String empty = "";
        System.out.println("Is Empty: " + empty.isEmpty());
    }
}


