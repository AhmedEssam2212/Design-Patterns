package decorator;

public class Decaf implements Bevarage {
    @Override
    public String getDescription() {
        return "Decaf ";
    }

    @Override
    public double cost() {
      return 2.98;
    }
}
