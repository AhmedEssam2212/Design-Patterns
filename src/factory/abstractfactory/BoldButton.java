package factory.abstractfactory;

public class BoldButton extends Button {

    @Override
    public String getDescription(AbstractOS abstractOS) {
        return "Bold Button"+" "+ abstractOS.toString();
    }
}
