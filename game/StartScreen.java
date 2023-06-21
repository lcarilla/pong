import javax.swing.*; 
import java.awt.event.ActionListener; 
import java.awt.*; 
import java.awt.event.ActionEvent;

public class StartScreen
{
    JFrame mainFrame = new JFrame("Pong game bruh");
    JPanel mainPanel = new JPanel();
    JLabel label1 = new JLabel("FUCKING PONG GAME HEHE");
    JButton button1 = new JButton("Play with a friend");
    JButton button2 = new JButton("I dont have friends");

    public StartScreen()
    {
        label1.setAlignmentX(Component.CENTER_ALIGNMENT);
        label1.setMaximumSize(new Dimension(500,200));
        button1.setAlignmentX(Component.CENTER_ALIGNMENT);
        button1.setMaximumSize(new Dimension(500,200));
        button1.setMargin(new Insets(100,100,100,100));
        button2.setAlignmentX(Component.CENTER_ALIGNMENT);
        button2.setMaximumSize(new Dimension(500,200));
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new TwoPlayerManager();
            }
        });  
            button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new SinglePlayerManager();
            }
        });
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.add(label1);
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