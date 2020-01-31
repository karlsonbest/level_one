package lesson1;

public class CharsCounter {

    public static int getCharsCounter (String str, char ch) {
        String newOne = str.replaceAll(Character.toString(ch), "");
        int initLength = str.length();
        int finalLength = newOne.length();

        return initLength - finalLength;
    }
}
