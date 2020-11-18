package factory.abstractfactory;

public class VibrationAlert extends Alert {
    @Override
    public String getDescription(AbstractOS abstractOS) {
          return "Vibration Alert"+" "+abstractOS.toString();
    }
}
