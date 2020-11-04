package decorator;

public class Main {
    public static void main(String[] args) {
        Bevarage bevarage = new Espresso();
        System.out.println(bevarage.getDescription()+" : "+bevarage.cost()+"$");
        /*   Bevarage bevarage1 = new DarkRoast();
             bevarage1 = new Mocha(bevarage1);
             // wrapper
      */
        Bevarage bevarage2 = new Mocha(new Espresso()); // another way to make wrapper
        System.out.println(bevarage2.getDescription()+" : "+bevarage2.cost()+"$");
    }
}
