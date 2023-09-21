package Lab3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TemperatureConverterApp {
    private JFrame frame;
    private JTextField temperatureTextField;
    private JComboBox<String> fromScaleComboBox;
    private JComboBox<String> toScaleComboBox;
    private JButton convertButton;
    private JLabel resultLabel;

    public TemperatureConverterApp() {
        // Create the JFrame
        frame = new JFrame("Temperature Converter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 160);
        frame.setLayout(new FlowLayout());

        // Create and configure the components
        temperatureTextField = new JTextField(8);
        fromScaleComboBox = new JComboBox<>(new String[]{"Fahrenheit", "Celsius", "Kelvin"});
        toScaleComboBox = new JComboBox<>(new String[]{"Fahrenheit", "Celsius", "Kelvin"});
        convertButton = new JButton("Convert");
        resultLabel = new JLabel("Converted Temperature:");

        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                convertAndDisplay();
            }
        });

        // Add components to the frame
        frame.add(temperatureTextField);
        frame.add(fromScaleComboBox);
        frame.add(new JLabel("to"));
        frame.add(toScaleComboBox);
        frame.add(convertButton);
        frame.add(resultLabel);

        // Set padding for components
        Insets insets = new Insets(5, 5, 5, 5);
        for (Component component : frame.getContentPane().getComponents()) {
            ((JComponent) component).setBorder(BorderFactory.createEmptyBorder(insets.top, insets.left, insets.bottom, insets.right));
        }

        // Display the frame
        frame.setVisible(true);
    }

    private void convertAndDisplay() {
        try {
            double inputTemperature = Double.parseDouble(temperatureTextField.getText());
            String fromScale = (String) fromScaleComboBox.getSelectedItem();
            String toScale = (String) toScaleComboBox.getSelectedItem();
            double convertedTemperature = convert(inputTemperature, fromScale, toScale);

            resultLabel.setText("Converted Temperature: " + String.format("%.2f", convertedTemperature) + " " + toScale);
        } catch (NumberFormatException ex) {
            resultLabel.setText("Invalid input. Please enter a valid number.");
        }
    }

    private double convert(double temperature, String fromScale, String toScale) {
        if (fromScale.equals("Fahrenheit")) {
            if (toScale.equals("Celsius")) {
                return (temperature - 32) * 5.0 / 9.0;
            } else if (toScale.equals("Kelvin")) {
                return ((temperature - 32) * 5.0 / 9.0) + 273.15;
            }
        } else if (fromScale.equals("Celsius")) {
            if (toScale.equals("Fahrenheit")) {
                return (temperature * 9.0 / 5.0) + 32;
            } else if (toScale.equals("Kelvin")) {
                return temperature + 273.15;
            }
        } else if (fromScale.equals("Kelvin")) {
            if (toScale.equals("Fahrenheit")) {
                return ((temperature - 273.15) * 9.0 / 5.0) + 32;
            } else if (toScale.equals("Celsius")) {
                return temperature - 273.15;
            }
        }
        // Default: return the input temperature if no conversion is needed
        return temperature;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new TemperatureConverterApp();
            }
        });
    }
}