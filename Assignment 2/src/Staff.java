public class Staff extends Person {

    // Constants
    private static final double BASE_SALARY = 50000;
    private static final double SALARY_INCREASE_PER_YEAR = 500;

    // Properties
    private int yearsOfService;
    private double salary;

    // Constructor
    public Staff(String address, String name, int yearsOfService) {
        super.setAddress(address);
        super.setName(name);
        this.yearsOfService = yearsOfService;

        // Calculating salary based on years of service
        this.salary = BASE_SALARY + (yearsOfService * SALARY_INCREASE_PER_YEAR);
    }


    @Override
    public String toString() {
        // Using String.format for readability and formatting double to 2 decimal points
        return String.format("Name = %s, Address = %s, Years = %d, Salary = $%.2f",
                super.getName(),
                super.getAddress(),
                this.yearsOfService,
                this.salary
        );
    }

    // Method for invoicing, used in generating report
    public double invoice() {
        // Staff get paid bi-weekly, 52 weeks in year, so outgoing / 26
        return this.salary / 26;
    }

    // Getters and Setters -------------------------------------------------------------------------
    public int getYearsOfService() {
        return yearsOfService;
    }

    public void setYearsOfService(int yearsOfService) {
        this.yearsOfService = yearsOfService;
    }

    public double getSalary() {
        return salary;
    }
}
