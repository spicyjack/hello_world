import javax.swing.*;
import java.awt.*;

public class HelloSwingApplet extends JApplet {

    public void init() {
        JButton button = new JButton("Hello world!");
        getContentPane().add(button);
    }
}
