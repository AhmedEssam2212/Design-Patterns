package strategy;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    private String color;
    public Duck()
    {

    }
    public Duck(String color)
    {
        this.color=color;
    }
    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void swim()
    {
        System.out.println("swimming duck !");
    }
    public abstract void display();
    public void performQuack()
    {
        quackBehavior.quack();
    }
    public void performFly()
    {
      flyBehavior.fly();
    }

}
