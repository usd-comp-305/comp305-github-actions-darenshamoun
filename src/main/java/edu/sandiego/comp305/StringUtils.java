package edu.sandiego.comp305;

public final class StringUtils {

    private StringUtils() {
    }

    public static String reverseString(final String input) {
        if (input == null) {
            throw new IllegalArgumentException("input must not be null");
        }
        return new StringBuilder(input).reverse().toString();
    }

    public static void main(final String[] args) {
        final String sample = "hello world";
        System.out.println(reverseString(sample));
    }
}
