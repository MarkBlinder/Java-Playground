import java.awt.*;
import javax.swing.*;

public class Frame {
    public static void main(String[] args ) {
        JLabel header = new JLabel("Hello there!");
        JTextArea input = new JTextArea("Enter your name");
        JButton convert = new JButton("Convert");
        JTextArea output = new JTextArea();
        JLabel footer = new JLabel("Have a great day!");

        JFrame frame = new JFrame("Test Frame");
        frame.setLayout(new BorderLayout());
        frame.setSize(600, 600);

        frame.add(header, BorderLayout.PAGE_START);
        frame.add(input, BorderLayout.LINE_START);
        frame.add(convert, BorderLayout.CENTER);
        frame.add(output, BorderLayout.LINE_END);
        frame.add(footer, BorderLayout.SOUTH);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}