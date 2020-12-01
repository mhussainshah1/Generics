package wildcards;

import java.util.ArrayList;
import java.util.List;

public class LowerBound {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("tweet");
        List<Object> objects = new ArrayList<>(strings);
        addSound(strings);
        addSound(objects);
    }

//    private static void addSound(List<?> list) {
//        list.add("quack");//unbounded are immutable
//    }

//    private static void addSound(List<? extends Object> list) {
//        list.add("quack");//lower bounded are immutable
//    }

    //can not pass string
//    private static void addSound(List<Object> list) {
//        list.add("quack");
//    }

    private static void addSound(List<? super String> list) {
        list.add("quack");
    }
}
