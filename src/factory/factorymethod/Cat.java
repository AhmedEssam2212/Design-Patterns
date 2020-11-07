package factory.factorymethod;

public class Cat implements Animal {
    @Override
    public String getDescription() {
        return "cat description";
    }

    @Override
    public int heightOfJump() {
        return 11;
    }
}
