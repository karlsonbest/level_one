package lesson1;

public class EvensRangePrinter {

    public static void printEvensRange(int first, int last) {
        if (first <= last) {
            for(int i=first; i>=last; i--){
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }
    }

}
