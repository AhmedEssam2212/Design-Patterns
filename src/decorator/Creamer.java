package decorator;

public class Creamer  extends CondimentDecorator{
    public Creamer(Bevarage bevarage)
    {
        this.bevarage =bevarage;
    }
    @Override
    public String getDescription() {
        return bevarage.getDescription()+", Creamer";
    }

    @Override
    public double cost() {
        return bevarage.cost()+0.59;
    }
}
