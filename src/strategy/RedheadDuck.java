package strategy;

public class RedheadDuck extends Duck{

    public RedheadDuck()
    {
        quackBehavior = new Squeak();
        flyBehavior = new FlyWithWings();
    }
    @Override
    public void display() {
       System.out.println("display Redhead Duck");
    }
}
