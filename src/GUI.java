import javax.swing.*;
import java.awt.*;

public class GUI {
    private JPanel panel;
    private JFrame frame;


    public GUI() {
        frame = new JFrame();

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Coctails Choice");
        frame.pack();
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new GUI();

    }
}