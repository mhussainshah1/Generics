package wildcards;

import java.util.ArrayList;
import java.util.List;

public class WithoutUnbounded {

    public static void main(String[] args) {
        List<String> keywords = new ArrayList<>();
        keywords.add("java OCP 11");
//        printList(keywords);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(Integer.valueOf(42));
//        List<Object> objects = numbers;
//        objects.add(" forty two");
        System.out.println(numbers.get(0));
    }

    private static void printList(List<Object> keywords) {
        for(Object x : keywords){
            System.out.println(x);
        }
    }
}
