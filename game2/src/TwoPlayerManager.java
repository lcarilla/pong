import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
public class TwoPlayerManager{
    private final TwoPlayer twoPlayer;
    public TwoPlayerManager(TwoPlayer twoPlayer) {
        this.twoPlayer = twoPlayer;
    }
    public void startTwoPlayerGame(){
        JFrame frame = new JFrame("Ball Game");
        frame.add(twoPlayer);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setUndecorated(true);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.addKeyListener(new KeyPressedListener());
    }
}