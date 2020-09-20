import javax.swing.*;
import java.awt.*;

public class GUI {
    private JPanel panel;
    private JFrame frame;
    private JTextField text;
    private JButton button;
    private JTable table1, table2;
    private Object[][] array = new String[][] {{"Дайкири", "Ром" , "ml.", "40"},
                                                {"-", "Лимонный сок", "ml."  , "20"},
                                                {"-", "Сахарный сироп", "ml.", "10"}};
    private Object[] collumsHeader = new String[] {"Название", "Состовляющие", "Ед.измерения", "Количество"};
    public GUI() {
        frame = new JFrame();
        panel = new JPanel();
        button = new JButton("Search");
        text = new JTextField("Поиск", 20);
        table1 = new JTable(array, collumsHeader);


        panel.setBorder(BorderFactory.createEmptyBorder(100, 100, 50, 100));
        panel.setLayout(new BorderLayout());
        panel.add(button, BorderLayout.WEST);
        panel.add(text);
        panel.add(table1, BorderLayout.EAST);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Cocktails Choice");
        frame.pack();
        frame.setVisible(true);

    }

    public static void main(String[] args) {
        new GUI();

    }
}