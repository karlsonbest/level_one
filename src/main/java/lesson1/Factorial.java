package lesson1;

import java.util.ArrayList;
import java.util.List;

public class Factorial {

    public static List<Integer> getFactorialList(int first, int last) {
        List<Integer> factorialList = new ArrayList();
        //Код пишем тут.

        if ( first > last ) {
            for(int i=first; i>=last; i--){
                factorialList.add(i);
            }
        } else {
            for (int i = first; i <= last; i++) {
                factorialList.add(i);
            }
        }

        return factorialList;
    }
}
