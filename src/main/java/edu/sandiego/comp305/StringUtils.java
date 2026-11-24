package edu.sandiego.comp305;

public class StringUtils {

    private StringUtils() {
    }

    public static String reverseString(final String text){
        final String newText = new StringBuilder(text).reverse().toString();
        return newText;
    }
}
