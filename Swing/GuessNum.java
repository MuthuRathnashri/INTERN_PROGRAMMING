package Lab3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class GuessNum {
    private JFrame frame;
    private JTextField guessField;
    private JButton guessButton;
    private JLabel messageLabel;
    private JLabel resultLabel;
    private int targetNumber;
    private boolean gameActive;
    
    public GuessNum(){
        frame = new JFrame("Guess the Number Game", null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,200);
        frame.setLayout(new FlowLayout());

        guessField = new JTextField(10);
        guessButton = new JButton("Submit Guess", null);
        messageLabel = new JLabel("I have a number between 1 to 1000 .Can you guess my number ?");
        resultLabel = new JLabel("");
        
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
        frame.add(messageLabel);
        frame.add(guessField);
        frame.add(guessButton);
        frame.add(resultLabel);

        initializeGuess();

        frame.setVisible(true);
    } 
    private void initializeGuess(){
        Random rand = new Random();
        targetNumber = rand.nextInt(1000)+1;

        gameActive = true;
        guessField.setEditable(true);
        guessButton.setText("Submit Guess");
        frame.getContentPane().setBackground(Color.white);
        messageLabel.setText("I have a number between 1 to 1000 .Can you guess my number ?");
        resultLabel.setText("");
    }

    private void processGuess(){
        try{
            int guess = Integer.parseInt(guessField.getText());
            String message;

            if(guess == targetNumber){
                message = "Correct! The number is " + targetNumber;
                gameActive = false;
                guessField.setEditable(false);
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
            messageLabel.setText(message);
            guessField.setText("");
        }
        catch(NumberFormatException ex){
            messageLabel.setText("Invalid input .Please enter a valid number");
        }
    }
    public static void main(String[] args){
        SwingUtilities.invokeLater(new Runnable() {
            public void run(){
                new GuessNum();
            }
        });
    }
}
