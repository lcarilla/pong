import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
public class SinglePlayerManager{
    public SinglePlayerManager() {
        JFrame frame = new JFrame("Ball Game");
        frame.setBackground(Color.red);
        SinglePlayer ball = new SinglePlayer();
        frame.add(ball);
        frame.setSize(ball.WINDOW_WIDTH, ball.WINDOW_HEIGHT);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setUndecorated(true);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.addKeyListener(new KeyPressedListener());
    }
}