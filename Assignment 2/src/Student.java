public class Student extends Person {

    // Constants
    private static final double BASE_FEE = 2900;
    private static final double FEE_INCREASE_PER_YEAR = 100;

    // Properties
    private int year;
    private double fees;

    // Constructor
    public Student(String address, String name, int year) {
        super.setAddress(address);
        super.setName(name);
        this.year = year;

        // Calculating fees based on what year they are
        this.fees = BASE_FEE + (year * FEE_INCREASE_PER_YEAR);
    }


    @Override
    public String toString() {
        // Using String.format for readability and formatting double to 2 decimal points
        return String.format("Name = %s, Address = %s, Year = %d, Fee = $%.2f",
                super.getName(),
                super.getAddress(),
                this.year,
                this.fees
        );
    }

    // Method for invoicing, used when genearting report
    public double invoice() {
        // Students pay fees in two installments, so fees / 2 per invoice
        return this.fees / 2;
    }


    // Getters and Setters -------------------------------------------------------------------------

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getFees() {
        return fees;
    }
}
