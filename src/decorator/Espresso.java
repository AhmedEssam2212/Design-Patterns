package decorator;

public class Espresso implements Bevarage {


    @Override
    public String getDescription() {
        return "Espresso";
    }

    @Override
    public double cost() {
         return 0.76;
    }
    public double discount() // if you need any extra functionality you should implement it into the interface
    {
        return -0.1;
    }
}
