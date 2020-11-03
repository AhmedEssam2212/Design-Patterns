package strategy;

public class Main {
    public static void main(String[] args) {
        Duck duck = new RubberDuck();
        duck.performQuack();
        duck.performFly();
        duck.display();

        duck.setQuackBehavior(new Quack());
        duck.setFlyBehavior(new FlyWithWings());
        duck.performQuack();
        duck.performFly();
        duck.swim();

    }
}
