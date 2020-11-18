package factory.abstractfactory;

public class Linux extends AbstractOS {
    Alert alert;
    Button button;
    @Override
    public Alert createAlert() {
        if(true)
        {
            alert = new SoundAlert();

        }
        else
        {
            alert = new VibrationAlert();
        }
        return alert;
    }

    @Override
    public Button createButton() {
        if(false)
        {
            button = new BoldButton();

        }
        else
        {
            button = new FlatButton();
        }
        return button;
    }
}
