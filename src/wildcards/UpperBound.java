package wildcards;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UpperBound {
    public static void main(String[] args) {
//        List<Number> list1 = new ArrayList<Integer>();
        List<? extends Number> list1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));
        /*//Type Erasure
        List list1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5));*/
        System.out.println(total(list1));
    }

    private static long total(List<? extends Number> list) {
        long count = 0;
        for(Number number : list){
            count += number.longValue();
        }
        return count;
    }

   /* Type Erasure
   private static long total(List list) {
        long count = 0;
        for(Object object : list){
            Number number = (Number) object;
            count += number.longValue();
        }
        return count;
    }*/
}
