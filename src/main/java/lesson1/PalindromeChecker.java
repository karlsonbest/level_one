package lesson1;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class PalindromeChecker {

    public static boolean getPalindromeCheck(String str) {

        List<Character> chars = new ArrayList<>();
        for (char ch : str.toCharArray()) {
            chars.add(ch);
        }

        List<Character> reverse = new ArrayList<>(chars);
        Collections.reverse(reverse);

        boolean isEqual = chars.equals(reverse);

        return isEqual;
    }

}
