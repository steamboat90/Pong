import javax.swing.*;
import java.awt.*;

public class Game extends Canvas implements Runnable{

    private static GraphicsConfiguration gc;

    public static void main(String[] args){
        JFrame window = new Window(720, 720, "Pong", gc);
    }

    @Override
    public void run() {

    }
}
