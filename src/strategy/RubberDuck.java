package strategy;

public class RubberDuck extends Duck{
    public RubberDuck()
    {
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
    }
    @Override
    public void display() {
       System.out.println("display Rubber Duck");
    }
}
