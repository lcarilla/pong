import javax.swing.*;

public class ScoreHandler {
    public ScoreHandler(int score){
        JFrame frame = new JFrame("Upload game results");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        JLabel instructionLabel = new JLabel("Username:");
        panel.add(instructionLabel);
        JTextField textField = new JTextField(10);
        panel.add(textField);
        JButton submitButton = new JButton("Submit");
        panel.add(submitButton);
        submitButton.addActionListener(e -> {
            String input = textField.getText();
            try {
                new DataSubmitManager(input, score);
            } catch (Exception exception){
                System.out.println("could not connect to server");
                exception.printStackTrace();
                frame.dispose();
            }
        });
        frame.getContentPane().add(panel);
        frame.setVisible(true);
    }
}
