package wildcards;

import java.util.ArrayList;
import java.util.List;

public class WithUnBounded {
    public static void main(String[] args) {
        List<String> keywords = new ArrayList<>();
        keywords.add("java OCP 11");
        printList(keywords);

        List<?> x1 = new ArrayList<>();//List<Object>
        var x2 = new ArrayList<>();//ArrayList<Object>
    }

    private static void printList(List<?> keywords) {
        for(Object x : keywords){
            System.out.println(x);
        }
    }
}
