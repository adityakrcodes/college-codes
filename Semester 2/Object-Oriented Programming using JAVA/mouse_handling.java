import java.awt.*;
import java.awt.event.*;

public class mouse_handling extends Frame implements MouseListener {
    Label label;

    mouse_handling() {
        addMouseListener(this);

        label = new Label();
        label.setBounds(20, 50, 100, 20);
        add(label);
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
    }

    public void mousePressed(MouseEvent me) {
        label.setText("Mouse Pressed");
    }

    public void mouseClicked(MouseEvent me) {
        label.setText("Mouse clicked");
    }

    public void mouseEntered(MouseEvent me) {
        label.setText("Mouse entered");
    }

    public void mouseExited(MouseEvent me) {
        label.setText("Mouse exited");
    }

    public void mouseReleased(MouseEvent me) {
        label.setText("Mouse released");
    }

    public void mouseMoved(MouseEvent me) {
        label.setText("Mouse moved");
    }

    public void mouseDragged(MouseEvent me) {
        label.setText("Mouse dragged");
    }

    public static void main(String[] args) {
        new mouse_handling();
    }
}