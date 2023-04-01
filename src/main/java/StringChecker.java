public class StringChecker {
    public static void main(String[] args) {
        String base = "I like Java!!!";

        if (base.contains("Java") && base.startsWith("I like") && base.endsWith("!!!")) {
            System.out.println(base.toUpperCase());
        }

        System.out.println(base.replaceAll("a", "o").substring(7, 11));
    }
}
