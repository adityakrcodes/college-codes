import java.awt.Graphics;
import java.awt.event.*;
import java.applet.*;

public class mouse_handling extends Applet implements MouseListener, MouseMotionListener, KeyListener {
    String msg = "";
    int X = 10, Y = 20; // output coordinates

    public void init() {
        addMouseListener(this);
        addMouseMotionListener(this);
        addKeyListener(this);
    }

    public void paint(Graphics g) {
        g.drawString(msg, X, Y);
    }

    public void mousePressed(MouseEvent me) {
        msg = "Mouse pressed";
        repaint();
    }

    public void mouseClicked(MouseEvent me) {
        msg = "Mouse clicked";
        repaint();
    }

    public void mouseEntered(MouseEvent me) {
        msg = "Mouse entered";
        repaint();
    }

    public void mouseExited(MouseEvent me) {
        msg = "Mouse exited";
        repaint();
    }

    public void mouseReleased(MouseEvent me) {
        msg = "Mouse released";
        repaint();
    }

    public void mouseMoved(MouseEvent me) {
        msg = "Mouse moved";
        repaint();
    }

    public void mouseDragged(MouseEvent me) {
        msg = "Mouse dragged";
        repaint();
    }

    public void keyTyped(KeyEvent ke) {
        // Handle key typed event
    }

    public void keyPressed(KeyEvent ke) {
        // Handle key pressed event
    }

    public void keyReleased(KeyEvent ke) {
        // Handle key released event
    }
}
