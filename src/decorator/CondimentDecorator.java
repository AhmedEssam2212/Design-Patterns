package decorator;

public abstract class CondimentDecorator implements Bevarage{
    Bevarage bevarage;

   public abstract String getDescription();
}
