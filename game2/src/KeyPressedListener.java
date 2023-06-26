import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
class KeyPressedListener implements KeyListener {
    private static boolean wPressed;
    private static boolean sPressed;
    private static boolean upArrowPressed;
    private static boolean downArrowPressed;

    public static synchronized boolean isWPressed() {
        return wPressed;
    }

    public static synchronized boolean isSPressed() {
        return sPressed;
    }

    public static synchronized boolean isUpArrowPressed() {
        return upArrowPressed;
    }

    public static synchronized boolean isDownArrowPressed() {
        return downArrowPressed;
    }

    public synchronized void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W) {
            wPressed = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_S) {
            sPressed = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            upArrowPressed = true;
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            downArrowPressed = true;
        }
    }

    public synchronized void keyReleased(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_W) {
            wPressed = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_S) {
            sPressed = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            upArrowPressed = false;
        }
        if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            downArrowPressed = false;
        }
    }

    public void keyTyped(KeyEvent e) {
    }
}