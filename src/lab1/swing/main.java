package lab1;

import java.awt.Container;
import java.awt.GridLayout;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MainApp extends JFrame {

    private JButton gretter = new JButton("Генерировать больше");
    private JButton less = new JButton("Генерировать меньше");
    private JLabel labelGretter= new JLabel();
    private JLabel labelLess = new JLabel();
    private JLabel voidness = new JLabel();
    private JTextField field = new JTextField();

    private Random r = new Random();



    public static void main(String[] args) {
        MainApp app = new MainApp();
        app.setVisible(true);
    }

    public MainApp() {
        super("python the best");

        this.setBounds(400, 400, 400, 100);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        gretter.addActionListener(ev -> {
            try {
                int number = Integer.parseInt(field.getText());

                labelGretter.setText(String.valueOf(Math.abs(r.nextInt()) + number));
            }
            catch(NumberFormatException e) {
                labelGretter.setText("number isn't correct");
            }
        });
        less.addActionListener(ev -> {
            try {
                int number = Integer.parseInt(field.getText());

                labelLess.setText(String.valueOf(r.nextInt(number)));
            }
            catch(NumberFormatException e) {
                labelLess.setText("number isn't correct");
            }
        });
        Container container = this.getContentPane();
        container.setLayout(new GridLayout(3, 2));
        container.add(field);
        container.add(voidness);
        container.add(less);
        container.add(labelLess);
        container.add(gretter);
        container.add(labelGretter);
    }

}