package factory.abstractfactory;

public class FlatButton extends Button{
    @Override
    public String getDescription(AbstractOS abstractOS) {
        return "Flat Button"+" "+ abstractOS.toString();
    }
}
