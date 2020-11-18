package factory.abstractfactory;

public class SoundAlert extends Alert {
    @Override
    public String getDescription(AbstractOS abstractOS) {
        return "Sound Alert"+" "+ abstractOS.toString();
    }
}
