package wildcards;

import java.util.ArrayList;
import java.util.List;

class A{}
class B extends A{}
class C extends B{}

public class Summary {
    public static void main(String[] args) {
        List<A> list = new ArrayList<A>();
        list = new ArrayList<>();

        List<?> list1 = new ArrayList<A>();
////        List<?> list6 = new ArrayList<? extends A>();
//        list1.add(new A());

        List<? extends A> list2 = new ArrayList<A>();//B , C
//        List<? extends B> list5 = new ArrayList<A>();//B, C
//        list2.add(new A());

        List<? super A> list3 = new ArrayList<A>();//A, Object
        List<? super B> list6 = new ArrayList<A>(); //B, A, Object
        list3.add(new A());

        Summary s = new Summary();
        System.out.println(s.first(new ArrayList<String>()));
        System.out.println(s.first(new ArrayList<Integer>()));

        s.second(new ArrayList<A>());
        s.second(new ArrayList<Object>());
    }

    <T> T first(List<? extends T> list){
        return list.get(0);
    }

    void second(List<? super B> list){

    }

/*  <T> <? extends T> third(List<? extends T> list){
        return list.get(0);
    }*/

/*  <B extends A> B fourth(List<B> list){
        return new B();
    }*/

/*  X void fifth(List<X extends B> list){

    }*/
}
