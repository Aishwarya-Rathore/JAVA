public class StringBuil {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Aishwarya");
        sb.append(" Rathore");
        System.out.println(sb.toString()); // Output: Hello World

        sb.insert(9, ",");
        System.out.println(sb.toString()); // Output: Hello, World

        sb.replace(0, 9, "Riya");
        System.out.println(sb.toString()); // Output: Hello, Java

        sb.delete(0, 6);
        System.out.println(sb.toString()); // Output: Hello Java

        sb.reverse();
        System.out.println(sb.toString()); // Output: avaJ olleH

        System.out.println(sb.charAt(5)); // Output: J

    }
}