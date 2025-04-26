import java.awt.*;
import java.net.URI;
import javax.swing.*;

public class addwebsite {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Open External Website");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        JButton button = new JButton("Open Website");
        button.addActionListener(e -> {
            try {
                Desktop desktop = Desktop.getDesktop();
                URI uri = new URI("https://www.example.com"); // Replace with your website URL
                desktop.browse(uri);
            } catch (Exception ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(frame, "Failed to open website: " + ex.getMessage());
            }
        });

        frame.setLayout(new FlowLayout());
        frame.add(button);
        frame.setVisible(true);
    }
}
