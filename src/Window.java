import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    private int width;
    private int height;
    private String title;

    public Window(int width, int height, String title, GraphicsConfiguration gc){
        super(gc);
        this.setPreferredSize(new Dimension(this.width, this.height));
        this.setTitle(this.title);
        this.pack();
        this.setVisible(true);
    }
}
