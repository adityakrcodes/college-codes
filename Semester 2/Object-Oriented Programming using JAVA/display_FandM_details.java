import java.awt.*;
import java.awt.event.*;

public class display_FandM_details extends WindowAdapter {

    display_FandM_details() {
        Frame frame = new Frame("Details");
        Label label = new Label();
        Label label1 = new Label();
        Label label2 = new Label();
        Label label3 = new Label();
        Button button = new Button("Mother");
        button.setBounds(200, 60, 60, 60);
        Button button1 = new Button("Father");
        button1.setBounds(300, 60, 60, 60);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                label.setBounds(100, 250, 100, 20);
                label1.setBounds(100, 270, 100, 20);
                label2.setBounds(100, 290, 110, 20);
                label3.setBounds(100, 310, 200, 20);
                label.setText("Name:RADHA");
                label1.setText("Age:45");
                label2.setText("Designation: CEO");
                label3.setText("Phone:9711770164");
            }
        });
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                label.setBounds(100, 250, 100, 20);
                label1.setBounds(100, 270, 100, 20);
                label2.setBounds(100, 290, 150, 20);
                label3.setBounds(100, 310, 200, 20);
                label.setText("Name:KRISHNA");
                label1.setText("Age: 50");
                label2.setText("Designation: Manager");
                label3.setText("Phone:9711770164");
            }
        });
        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent evt) {
                frame.dispose();
            }

        });
        frame.add(button);
        frame.add(button1);
        frame.add(label);
        frame.add(label1);
        frame.add(label2);
        frame.add(label3);
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setLayout(null);
    }

    public static void main(String[] args) {
        display_FandM_details d = new display_FandM_details();
    }
}