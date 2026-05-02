public class StringBasics {
    public static void main(String[] args) {
        String name = "Java Programming";
        System.out.println(name);
        System.out.println(name.length());
        System.out.println(name.charAt(5));
        System.out.println(name.indexOf('P'));
        System.out.println(name.substring(5, 16));
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.replace("Programming", "Language"));
        System.out.println(name.trim());
        System.out.println(name.startsWith("Java"));
        System.out.println(name.endsWith("Programming"));   
        
    }
}