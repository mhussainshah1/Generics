package wildcards;

import java.util.ArrayList;
import java.util.List;

class GrandParent{}
class Parent extends GrandParent{}
class Child extends Parent{}

public class Main {
    public static void main(String[] args) {
        //Generic - Exact Match
        List<GrandParent> obj = new ArrayList<GrandParent>();
                          obj = new ArrayList<>();

//        List<GrandParent> obj = new ArrayList<Parent>();

        //Wildcards
        //Unbounded - immutable
        List<?> obj1 = new ArrayList<Parent>();
                obj1 = new ArrayList<Object>();
                obj1 = new ArrayList<GrandParent>();
                obj1 = new ArrayList<Child>();

              /*  obj1.add(new Object());
                obj1.add(new Parent());
                obj1.add(new Child());*/

        //Upper Bounded - immutable
        List<? extends GrandParent> obj2 = new ArrayList<Parent>();
                                    obj2 = new ArrayList<GrandParent>();
                                    obj2 = new ArrayList<Child>();

                                   /* obj2.add(new GrandParent());
                                    obj2.add(new Parent());
                                    obj2.add(new Child());*/

        //Lower Bounded
        List<? super Parent> obj3 = new ArrayList<GrandParent>();
//                             obj3 = new ArrayList<Parent>();
//                             obj3 = new ArrayList<Object>();
//                             obj3.add(new Object());
//                             obj3.add(new GrandParent());
                               obj3.add(new Parent());
                               obj3.add(new Child());

    }
}
