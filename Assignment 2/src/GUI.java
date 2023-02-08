import javax.swing.*;

public final class GUI {

    // Method for getting input for student, staff, or finished
    public static int studentOrStaff() {

        // Returning the int corresponding to the index of the option they chose,
        //0 = Student, 1 = Staff, 2 = Finished

        return JOptionPane.showOptionDialog(null,
                "Select Student or Staff",
                "Accounting App",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                new String[]{"Student", "Staff", "Finished"},
                null
        );

    }

    // Method for getting input from a text field, with custom prompt
    public static String getStringInput(String prompt) {

        String input;

        do {

            // Getting user input
            input = JOptionPane.showInputDialog(null,
                    prompt,
                    "Input",
                    JOptionPane.QUESTION_MESSAGE
            );

            // Checking if user entered anything
            if (input == null || input.isBlank()) {
                showMessage("Please enter valid information.", "Error");
            }


        } while(input == null || input.isBlank());

        // Only reaches this point if user entered a valid String
        // Trimming leading and trailing white space
        return input.trim();
    }

    // Method for displaying validation error message, with custom error message
    public static void showMessage(String message, String title) {

        JOptionPane.showMessageDialog(null,
                message,
                title,
                JOptionPane.INFORMATION_MESSAGE
        );

    }

}
