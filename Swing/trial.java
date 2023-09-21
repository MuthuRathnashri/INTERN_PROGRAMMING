package Lab3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class trial {
    private JFrame frame;
    private JLabel messagLabel;
    private JLabel resultLabel;
    private JButton guessButton;
    private JTextField gueesField;
    private int targetNumber;
    private boolean gameActive;

    public trial(){
        frame = new JFrame("Guess The Number Game");
        frame.setSize(400,200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        messagLabel = new JLabel("I have a number .try to guess my number");
        resultLabel = new JLabel("");
        guessButton = new JButton("Submit Guess", null);
        gueesField = new JTextField(10);

        guessButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                if(gameActive){
                    processGuess();
                }
                else{
                    initializeGuess();
                }
            }
        }); 

        frame.add(messagLabel);
        frame.add(gueesField);
        frame.add(guessButton);
        frame.add(resultLabel);

        initializeGuess();
    }
    public void initializeGuess(){
        Random random = new Random();
        targetNumber = random.nextInt(1000)+1;

        gameActive = true;
        gueesField.setEditable(true);
        frame.getContentPane().setBackground(Color.white);
        messagLabel.setText("I have a number .try to guess my number");
        resultLabel.setText("");
        guessButton.setText("Submit Guess");
    }
    public void processGuess(){
        try{
            int guess = Integer.parseInt(gueesField.getText());
            String message;

            if(guess == targetNumber){
                message = "Correct! The number is " + targetNumber;
                gameActive = false;
                gueesField.setEditable(false);
                guessButton.setText("Play Again");
                resultLabel.setText("");
                frame.getContentPane().setBackground(Color.green);       
            }
            else if(guess<targetNumber){
                message = "Too low Try again";
                resultLabel.setText("Too low");
                frame.getContentPane().setBackground(Color.blue);       
            }
            else{
                message = "Too high Try again";
                resultLabel.setText("Too High");
                frame.getContentPane().setBackground(Color.red);       
            }
            messagLabel.setText(message);
            gueesField.setText("");
        }
        catch(NumberFormatException ex){
            messagLabel.setText("Invalid input .Please enter a valid number");
        }
    }
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                new trial();
            }
        });
    }
}
