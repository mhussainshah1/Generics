import java.util.ArrayList;
import java.util.List;

public class WithGenerics {
    static void printNames(List<String> list){
        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);
            System.out.println(name);
        }
    }
    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add(new String("Webby"));
        printNames(names);
    }
}
