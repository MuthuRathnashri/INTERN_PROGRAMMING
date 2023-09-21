package Lab3;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class pushButonPanel extends JPanel {
    private JButton pushButton;
    private int count;
    private JLabel OutLabel;

    public pushButonPanel() {
        count = 0;
        pushButton = new JButton("Push Me");
        OutLabel = new JLabel("Count: " + count);
        add(pushButton);
        add(OutLabel);
        pushButton.addActionListener(new ButtonClick());

        setBackground(Color.CYAN);
        setPreferredSize(new Dimension(300, 200));
    }

    private class ButtonClick implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            count++;
            OutLabel.setText("Count: " + count);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Swing Button Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.add(new pushButonPanel());
            frame.pack();
            frame.setVisible(true);
        });
    }
}
