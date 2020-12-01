package classes;

public class SizeLimitedCrate <T,U> {
    private T contents;
    private U sizeLimit;
    private T[] array;
//    private static T constant;

    public SizeLimitedCrate() {
      /*  contents = new T();
        array = new T[4];

        if(T instanceof U){
            System.out.println("Not Allowed");
        }*/
    }

    public SizeLimitedCrate(T contents, U sizeLimit) {
        this.contents = contents;
        this.sizeLimit = sizeLimit;
    }
}
