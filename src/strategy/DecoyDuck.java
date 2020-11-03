package strategy;

public class DecoyDuck extends Duck {
    public DecoyDuck()
    {
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }
    @Override
    public void display() {
          System.out.println("display Decoy Duck");
    }
}
