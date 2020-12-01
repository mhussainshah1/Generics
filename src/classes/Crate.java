package classes;

public class Crate<T> {
    private T contents;

    public T getContents() {
        return contents;
    }

    public void setContents(T contents) {
        this.contents = contents;
    }

    public <T> T tricky(T t){
        return t;
    }
}


/*
public class Crate {
    private Object contents;

    public Object getContents() {
        return contents;
    }

    public void setContents(Object contents) {
        this.contents = contents;
    }
}*/
