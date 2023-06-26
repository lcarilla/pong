import javax.swing.*;
import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
public class SinglePlayerManager{
    private final SinglePlayer singlePlayer;
    public SinglePlayerManager(SinglePlayer singlePlayer) {
        this.singlePlayer = singlePlayer;
    }
    public void startSinglePlayerGame(){
        JFrame frame = new JFrame("Ball Game");
        frame.add(singlePlayer);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setUndecorated(true);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.addKeyListener(new KeyPressedListener());
    }
}