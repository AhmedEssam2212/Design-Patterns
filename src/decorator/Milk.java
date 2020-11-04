package decorator;

public class Milk extends CondimentDecorator {
    public Milk(Bevarage bevarage)
    {
        this.bevarage = bevarage;
    }
    @Override
    public String getDescription() {
        return bevarage.getDescription()+", Milk";
    }

    @Override
    public double cost() {
        return bevarage.cost()+0.21;
    }
}
