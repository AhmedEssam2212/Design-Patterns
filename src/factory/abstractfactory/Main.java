package factory.abstractfactory;

public class Main {
    public static void main(String[] args) {
        AbstractOS abstractOS = new Windos();
       Alert alert = abstractOS.createAlert();
       System.out.println(alert.getDescription(abstractOS));
       Button button = abstractOS.createButton();
        System.out.println(button.getDescription(abstractOS));
    }
}
