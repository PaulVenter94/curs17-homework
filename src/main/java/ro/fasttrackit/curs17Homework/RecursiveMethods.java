package ro.fasttrackit.curs17Homework;

public class RecursiveMethods {
    public int sum(int n) {
        if (n < 0) throw new IllegalArgumentException("It can only be positive!");
        if (n <= 1) {
            return n;
        } else {
            return sum(n - 1) + n;
        }
    }

    public int evenSum(int n) {
        if (n < 0) throw new IllegalArgumentException("It can only be positive!");
        if (n <= 1) {
            return 0;
        } else {
            return n % 2 == 0 ? evenSum(n - 1) + n : evenSum(n - 1);
        }
    }

    public boolean revPalindrome(String word) {
        if (word == null) throw new IllegalArgumentException("Can't be null");
        String noSpace = cutWhiteSpaces(word);
        return reverse(noSpace).equalsIgnoreCase(noSpace);
    }

    private String cutWhiteSpaces(String word) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < word.length(); i++) {
            if (!(Character.isWhitespace(word.charAt(i)))) {
                stringBuilder.append(word.charAt(i));
            }
        }
        return stringBuilder.toString();
    }

    private String reverse(String word) {
        if (word.length() <= 1) {
            return word;
        } else {
            String cutLast = word.substring(0, word.length() - 1);
            return word.charAt(word.length() - 1) + reverse(cutLast);
        }
    }

    public boolean isPalindrome(String word) {
        if (word == null) throw new IllegalArgumentException("Can't be null");
        String noSpace = cutWhiteSpaces(word);
        if (noSpace.length() <= 1) {
            return true;
        } else {
            var subArray = noSpace.substring(1, noSpace.length() - 1);
            return noSpace.charAt(0) == noSpace.charAt(word.length() - 1) && isPalindrome(subArray);
        }
    }

    // digitSum(n
    public int digitSum(int n) {
        if (n < 0) throw new IllegalArgumentException("It can only be positive!");
        if (n < 10) {
            return n;
        } else {
            return n % 10 + digitSum(n / 10);
        }
    }
}
