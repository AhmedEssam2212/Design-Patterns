package decorator;

public class Chocolate extends CondimentDecorator {
    public Chocolate(Bevarage bevarage)
    {
        this.bevarage = bevarage;
    }
    @Override
    public String getDescription() {
        return bevarage.getDescription()+", Chocolate";
    }

    @Override
    public double cost() {
        return bevarage.cost()+0.66;
    }
}
