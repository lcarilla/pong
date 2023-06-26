import javax.swing.*;
import java.awt.*;

public class StartScreen
{
    private TwoPlayerManager twoPlayerManager;
    private SinglePlayerManager singlePlayerManager;
    JFrame mainFrame = new JFrame("Pong game bruh");
    JPanel mainPanel = new JPanel();
    JLabel label = new JLabel("FUCKING PONG GAME HEHE");
    JButton button1 = new JButton("Play with a friend");
    JButton button2 = new JButton("I dont have friends");

    public StartScreen()
    {
        SoundManager soundManager = new SoundManager();
        soundManager.playBackgroundMusic();
        label.setFont(new Font("monospace", Font.PLAIN, 26));
        button1.setFont(new Font("monospace", Font.PLAIN, 26));
        button1.setForeground(Color.RED);
        button1.setBackground(Color.BLUE);
        button1.setBorder(null);
        label.setAlignmentX(Component.CENTER_ALIGNMENT);
        label.setMaximumSize(new Dimension(500,200));
        button1.setAlignmentX(Component.CENTER_ALIGNMENT);
        button1.setMaximumSize(new Dimension(500,200));
        button1.setMargin(new Insets(100,100,100,100));
        button2.setAlignmentX(Component.CENTER_ALIGNMENT);
        button2.setMaximumSize(new Dimension(500,200));
        button1.addActionListener(e -> {
            twoPlayerManager = new TwoPlayerManager(new TwoPlayer());
           twoPlayerManager.startTwoPlayerGame();
        });
        button2.addActionListener(e -> {
            singlePlayerManager = new SinglePlayerManager(new SinglePlayer());
            singlePlayerManager.startSinglePlayerGame();
        });
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.add(label);
        mainPanel.add(button1);
        mainPanel.add(button2);
        mainFrame.add(mainPanel);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        mainFrame.setUndecorated(true);
        mainFrame.setVisible(true);
    }

    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(StartScreen::new);
    }
}