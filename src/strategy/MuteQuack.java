package strategy;

public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
       System.out.println("mute quack qack qack qack ");
    }
}
