package factory.abstractfactory;

public class Windows extends AbstractOS {
    Alert alert;
    Button button;
    @Override
    public Alert createAlert() {
        if(true)
        {
            alert = new VibrationAlert();

        }

        return alert;
    }

    @Override
    public Button createButton() {
        if(true)
        {
            button = new BoldButton();

        }

        return button;
    }
}
