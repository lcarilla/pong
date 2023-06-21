import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class SinglePlayer extends JPanel implements ActionListener {
    private int x = 0;
    private int y = 0;
    private int velX = 2;
    private int velY = 2;
    private double speed = 1;
    private int bounceCount = 0;
    public final int WINDOW_WIDTH = 1200;
    public final int WINDOW_HEIGHT = 700;
    private int player1X = 20;
    private int player1Y = WINDOW_HEIGHT / 2;
    private final int playerWidth = 14;
    private final int playerHeight = 200;
    private final int SCORE_X_OFFSET = 10;
    private final int SCORE_Y_OFFSET = 20;
    private final double SPEED_INCREASE_FACTOR = 0.005;
    private final int SPEED_INCREASE_INTERVAL = 300;
    private double speedIncreaseCountdown = SPEED_INCREASE_INTERVAL;

    public SinglePlayer() {
        Timer timer = new Timer(10, this);
        timer.start();
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.RED);
        g.fillOval(x, y, 30, 30);
        g.setColor(Color.BLUE);
        g.fillRect(player1X, player1Y, playerWidth, playerHeight);
 
        
        g.setColor(Color.BLACK);
        g.drawString("Bounce Count: " + bounceCount, SCORE_X_OFFSET, SCORE_Y_OFFSET);
    }

    public void actionPerformed(ActionEvent e) {
        x += velX * speed;
        y += velY * speed;

        // Collision with left wall
        if (x < 0) {
            velX = -velX;
            bounceCount++;
        }

        // Collision with right wall
        if (x > getWidth() - 30) {
            velX = -velX;
            bounceCount++;
        }

        // Collision with top wall
        if (y < 0) {
            velY = -velY;
        }

        // Collision with bottom wall
        if (y > getHeight() - 30) {
            velY = -velY;
        }

        // Collision with player 1's wall
        if (x <= player1X + playerWidth && y >= player1Y && y <= player1Y + playerHeight) {
            velX = -velX;
            x++;
            bounceCount++;
        }

        // Collision with player 2's wall
  

        // Move player 1 up with 'w' key
        if (player1Y > 0 && (KeyPressedListener.isWPressed())) {
            player1Y -= 5;
        }

        // Move player 1 down with 's' key
        if (player1Y < getHeight() - playerHeight && (KeyPressedListener.isSPressed())) {
            player1Y += 5;
        }
        // Move player 2 up with up arrow key
 

        // Move player 2 down with down arrow key

        // Increase speed over time
        speedIncreaseCountdown = speedIncreaseCountdown - 100;
        if (speedIncreaseCountdown <= 0) {
            speed += SPEED_INCREASE_FACTOR;
            speedIncreaseCountdown = SPEED_INCREASE_INTERVAL;
        }

        // Game over if ball hits left or right border
        if (x < 0) {
            JFrame topFrame = (JFrame) getTopLevelAncestor();
            topFrame.dispose();
        }

        repaint();
    }

}

