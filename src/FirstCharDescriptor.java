public class FirstCharDescriptor {

    public static String repFirstChar(String str) {
        if (str == null || str.isEmpty()) {
            return "The string is empty";
        }
        char ch = str.charAt(0);
        if (Character.isUpperCase(ch)) {
            return "upper";
        } else if (Character.isLowerCase(ch)) {
            return "lower";
        } else if (Character.isDigit(ch)) {
            return "digit";
        } else {
            return "other";
        }
    }

    public static void main(String[] args) {
        String test = "Hello";
        System.out.println("First character of \"" + test + "\" is: " + repFirstChar(test));

        test = "world";
        System.out.println("First character of \"" + test + "\" is: " + repFirstChar(test));

        test = "12345";
        System.out.println("First character of \"" + test + "\" is: " + repFirstChar(test));

        test = "#hashtag";
        System.out.println("First character of \"" + test + "\" is: " + repFirstChar(test));
    }
}
