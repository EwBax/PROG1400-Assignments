import java.util.ArrayList;

public class Main {

    // Constants
    static final int MIN_YEARS = 1;
    static final int MAX_STUDENT_YEAR = 4;
    static final int MAX_STAFF_YEARS_OF_SERVICE = 30;

    public static void main(String[] args) {

        // ArrayLists to hold Student and Staff
        ArrayList<Student> studentList = new ArrayList<>();
        ArrayList<Staff> staffList = new ArrayList<>();

        // Variable to hold which option user picks from GUI
        int option;

        do {
            // Calling method to get user to choose student, staff, or finished
            option = GUI.studentOrStaff();

            // Above method will return 0 for student, 1 for staff, 2 for finished, or -1 if user
            // X's out of window

            if(option == 0) {
                studentList.add(getStudentInfo());
            } else if(option == 1) {
                staffList.add(getStaffInfo());
            }

        } while(option != 2 && option != -1);

        // Calling method to generate report, and display it using GUI
        GUI.showMessage(generateReport(studentList, staffList), "Report");
    }

    // Method to generate report
    static String generateReport(ArrayList<Student> studentList, ArrayList<Staff> staffList) {

        // StringBuilder to create report string
        StringBuilder report = new StringBuilder();

        // Student Header
        report.append(String.format("Students: [Total: %d]\n", studentList.size()));

        // Looping through students and adding toString for each
        for(int i = 0; i < studentList.size(); i++) {
            report.append(String.format("%d. %s\n", (i+1), studentList.get(i)));
        }

        // Staff header
        report.append(String.format("Staff: [Total: %d]\n", staffList.size()));

        // Looping through staff and adding toString for each
        for(int i = 0; i < staffList.size(); i++) {
            report.append(String.format("%d. %s\n", (i+1), staffList.get(i)));
        }

        // Calling method to calculate outgoing, incoming, and net $$$, and appending to report
        report.append(calculatePayments(studentList, staffList));

        // Returning full report as String
        return report.toString();
    }

    static String calculatePayments(ArrayList<Student> studentList, ArrayList<Staff> staffList) {

        // Variables for calculations
        double incoming = 0;
        double outgoing = 0;
        double net;

        // Looping through students and adding student fees / invoicing
        for (Student student : studentList) {
            incoming += student.invoice();
        }

        // Looping through staff and adding staff salaries / invoicing
        for (Staff staff : staffList) {
            outgoing += staff.invoice();
        }

        net = incoming - outgoing;

        // Returning formatted invoice report
        return String.format("""
                
                
                Results:
                Outgoing: $%.2f
                Incoming: $%.2f
                Total: $%.2f
                """,
                outgoing,
                incoming,
                net
        );

    }


//==================================================================================================
//==============================STUDENT INPUT RELATED METHODS=======================================
//==================================================================================================

    static Student getStudentInfo() {

        // Variables to temporarily hold student properties
        String address;
        String name;
        int year;

        // Using GUI getStringInput method to initialize property variables
        name = GUI.getStringInput("Enter Student Name");
        address = GUI.getStringInput("Enter Student Address");

        // Using different method from above to both get input and validate
        year = getStudentYearInput();

        // Returning new Student object with properties from input
        return new Student(address, name, year);
    }


    // Method for getting student year and validating it
    static int getStudentYearInput() {

        String input;

        // infinite loop to get input until it is valid
        while(true) {

            input = GUI.getStringInput(String.format("Enter Student Year (%d-%d)",
                                                    MIN_YEARS,
                                                    MAX_STUDENT_YEAR)
            );

            // Checking if input is blank
            if(input.isBlank()) {

                GUI.showMessage("Please enter valid information.", "Invalid Input");

            } else if(isInt(input)) {

                // Only gets here if input is an int
                int year = Integer.parseInt(input);

                // Validating year is in proper range
                if(year >= MIN_YEARS && year <= MAX_STUDENT_YEAR) {

                    // Only reaches this point if year is in valid range
                    return year;

                } else {

                    // Error message if input is not in proper range
                    GUI.showMessage(String.format("Please enter a year from %d to %d.",
                                    MIN_YEARS,
                                    MAX_STUDENT_YEAR),
                                    "Invalid Input"
                    );

                }

            }

        }

    }


//==================================================================================================
//==============================STAFF INPUT RELATED METHODS=========================================
//==================================================================================================

    static Staff getStaffInfo() {
        // Variables to temporarily hold staff properties
        String address;
        String name;
        int yearsOfService;

        // Using GUI getStringInput method to initialize property variables
        name = GUI.getStringInput("Enter Staff Name");
        address = GUI.getStringInput("Enter Staff Address");

        // Using different method from above to both get input and validate
        yearsOfService = getStaffYearInput();

        // Returning new Student object with properties from input
        return new Staff(address, name, yearsOfService);
    }

    static int getStaffYearInput() {

        String input;

        // infinite loop to get input until it is valid
        while(true) {

            input = GUI.getStringInput("Enter Staff Years of Service");

            // Checking if input is blank
            if(input.isBlank()) {

                GUI.showMessage("Please enter valid information.", "Invalid Input");

            } else if(isInt(input)) {

                // Only gets here if input is an int
                int yearsOfService = Integer.parseInt(input);

                // Validating year is in proper range
                if(yearsOfService >= 1 && yearsOfService <= 30) {

                    return yearsOfService;

                } else {

                    // Error message if year is not in proper range
                    GUI.showMessage(String.format("Years of service must be between %s and %d.",
                                                    MIN_YEARS,
                                                    MAX_STAFF_YEARS_OF_SERVICE),
                        "Invalid Input"
                    );

                }

            }

        }

    }

//==================================================================================================
//==============================GENERAL INPUT VALIDATION METHODS====================================
//==================================================================================================

    // Method to check if a string is an integer, returns true or false
    static boolean isInt(String str) {

        try {
             Integer.parseInt(str);

             // Only reaches this point if str is an integer
             return true;

        } catch (Exception e) {

            // Error message and returns false because str is not an integer
            GUI.showMessage("Please enter a number (no decimals).", "Invalid Input");

            // Only reaches this point if str is NOT an integer
            return false;
        }

    }

}