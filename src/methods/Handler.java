package methods;

import classes.Crate;
class Robot{}
public class Handler {
    //static methods
    public static <T> void prepare(T t){
        System.out.println("Preparing " + t);
    }

    public static <T>Crate<T> ship(T t){
        System.out.println("Shipping " + t);
        return new Crate<T>();
    }

    public static String createName(){
        Crate<Robot> crate = new Crate<>();
        return crate.tricky("bot");
    }

    public static void main(String[] args) {
        ship("package");
        ship(args);

        //or
        Handler.<String>ship("package");
        Handler.<String[]>ship(args);

        System.out.println(createName());

    }

    //instance methods
//    public T noGood(T t){return t;}
    public <T> T instanceMethod( T t){return t;}

}

class More<T>{

    //static Methods
    public static <T> T staticMethod(T t){return t;}

    //instance methods
    public T instanceMethod(T t){return t;}
}
