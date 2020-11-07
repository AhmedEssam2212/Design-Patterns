package factory.factorymethod;

public class tiger implements Animal {
    @Override
    public String getDescription() {
        return "tiger description";
    }

    @Override
    public int heightOfJump() {
        return 26;
    }
}
