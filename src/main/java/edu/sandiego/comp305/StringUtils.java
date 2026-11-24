package edu.sandiego.comp305;

public class StringUtils {

    private StringUtils() {
    }

    public static String reverseString(String text){
        String newText = new StringBuilder(text).reverse().toString();
        return newText;
    }
}
