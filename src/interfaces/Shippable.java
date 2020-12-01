package interfaces;

public interface Shippable<T> {
    void ship(T t);
}

class Robot {}

//1
class ShippableRobotCrate implements Shippable<Robot> {
    @Override
    public void ship(Robot robot) {
    }
}

//2
class ShippableAbstractCrate<U> implements Shippable<U> {
    @Override
    public void ship(U u) {
    }
}

//3
class ShippableCrate implements Shippable{
    @Override
    public void ship(Object o) {
    }
}