package chapter5;

public class StrOps {

    public static void main(String[] args) {
        String str1 = "When it comes to Web Programming, Java is #!";
        String str2 = new String(str1);
        String str3 = "Java strings are powerful.";

        int result, idx;
        char ch;

        System.out.println("Lenght of str1: " + str1.length());

        //for-each
        for (int i = 0; i < str1.length(); i++) {
            ch = str1.charAt(i);
            System.out.print(ch);
        }
        System.out.println();

        // equals
        if (str1.equals(str2)) {
            System.out.println("str1 equals str2");
        } else {
            System.out.println("str1 does not equal str2");
        }

        // equals
        if (str1.equals(str3)) {
            System.out.println("str1 equals str3");
        } else {
            System.out.println("str1 does not equal str3");
        }

        // compareTo
        result = str1.compareTo(str3);
        if (result == 0) {
            System.out.println("str1 and str3 are equal");
        } else if (result < 0) {
            System.out.println("str1 is less than str3");
        } else {
            System.out.println("str1 is greater than str3");
        }

        str2 = "One Two Three One";
        idx = str2.indexOf("One");
        System.out.println("Index of first occurrence of One: " + idx);

        idx = str1.lastIndexOf("One");
        System.out.println("Index of last occurrence of One: " + idx);
    }
}
