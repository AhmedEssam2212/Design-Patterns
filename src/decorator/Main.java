package decorator;

public class Main {
    public static void main(String[] args) {
        Bevarage bevarage = new Espresso();
        System.out.println(bevarage.getDescription()+" : "+bevarage.cost()+"$");
           Bevarage bevarage1 = new DarkRoast();
             bevarage1 = new Mocha(bevarage1);
             bevarage1 = new Mocha(bevarage1);
             bevarage1 = new Milk(bevarage1);
             // wrapping a lot of decorators

       // Bevarage bevarage2 = new Mocha(new Espresso()); // another way to make it wrapped
       // bevarage2 = new Mocha(new Espresso());
        System.out.println(bevarage1.getDescription()+" : "+(float)bevarage1.cost()+"$");
    }
}
