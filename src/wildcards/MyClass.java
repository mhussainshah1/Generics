package wildcards;

import java.util.ArrayList;
import java.util.List;

interface SuperInterface{}
interface Interface extends SuperInterface{}

public class MyClass implements Interface {

    public static void main(String[] args) {
        List<? extends  Interface>  test1 = new ArrayList<Interface>();
                                    test1 = new ArrayList<MyClass>();
                          //        test1 = new ArrayList<SuperInterface>();

        List<? super MyClass>  test2 = new ArrayList<MyClass>();
                               test2 = new ArrayList<Interface>();
                               test2 = new ArrayList<SuperInterface>();
    }
}
