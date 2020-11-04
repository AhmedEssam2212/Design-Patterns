package decorator;

public class Mocha extends CondimentDecorator {
    public Mocha(Bevarage bevarage)
    {
        this.bevarage = bevarage;
    }
    @Override
    public String getDescription() {
        return bevarage.getDescription()+",Mocha";
    }

    @Override
    public double cost() {
        return 0.432 + bevarage.cost();
    }

}
