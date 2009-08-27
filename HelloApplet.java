import java.applet.Applet;
import java.awt.Label;

public class HelloLabelApplet extends Applet {

    public void init() {
        Button button = new Button("Hello world!");
        add(button);

    }
}
