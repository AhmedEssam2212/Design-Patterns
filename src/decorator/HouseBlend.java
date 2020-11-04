package decorator;

public class HouseBlend implements Bevarage{
    @Override
    public String getDescription() {
        return "HouseBlend";
    }

    @Override
    public double cost() {
          return 1.76;
    }
}
