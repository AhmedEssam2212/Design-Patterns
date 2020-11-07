package factory.factorymethod;

public class Dog implements Animal{
    @Override
    public String getDescription() {
        return "dog description";
    }

    @Override
    public int heightOfJump() {
        return 17;
    }
}
