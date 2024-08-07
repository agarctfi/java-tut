import javax.swing.JOptionPane;

public class JOptionPaneExample {
    public static void main(String[] args) {
        // Show an information message dialog
        JOptionPane.showMessageDialog(null, "This is an information message.", "Information", JOptionPane.INFORMATION_MESSAGE);

        // Show a warning message dialog
        JOptionPane.showMessageDialog(null, "This is a warning message.", "Warning", JOptionPane.WARNING_MESSAGE);

        // Show an error message dialog
        JOptionPane.showMessageDialog(null, "This is an error message.", "Error", JOptionPane.ERROR_MESSAGE);

        // Show a question message dialog
        JOptionPane.showMessageDialog(null, "Is this a question?", "Question", JOptionPane.QUESTION_MESSAGE);

        // Show a plain message dialog
        JOptionPane.showMessageDialog(null, "This is a plain message.", "Plain", JOptionPane.PLAIN_MESSAGE);

        // Show an input dialog and get the user's input
        String name = JOptionPane.showInputDialog(null, "What is your name?", "Input Dialog", JOptionPane.QUESTION_MESSAGE);

        // Show a confirm dialog and get the user's choice
        int choice = JOptionPane.showConfirmDialog(null, "Do you like programming?", "Confirm Dialog", JOptionPane.YES_NO_OPTION);

        // Process the input and choice
        String message = "Hello, " + name + "! ";
        if (choice == JOptionPane.YES_OPTION) {
            message += "I'm glad you like programming!";
        } else {
            message += "That's okay, maybe you'll grow to like it.";
        }

        // Show the final message
        JOptionPane.showMessageDialog(null, message, "Message", JOptionPane.INFORMATION_MESSAGE);
    }
}
