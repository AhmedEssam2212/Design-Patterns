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

        return alert;
    }

    @Override
    public Button createButton() {
        if(true)
        {
            button = new FlatButton();

        }
        return button;
    }
}
