package decorator;

public class DarkRoast implements Bevarage{
    @Override
    public String getDescription() {
        return "DarkRoast ";
    }

    @Override
    public double cost() {
       return 0.7;
    }
}
