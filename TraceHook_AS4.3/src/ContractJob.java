/**
 * The ContractJob class represents a contractual job, extending the Job class.
 * It includes specific attributes and methods related to contract employment.
 */
public class ContractJob extends Job {
    private final double hourlyRate;
    private final int hoursWorked;

    /**
     * Constructs a ContractJob object with the specified details.
     *
     * @param companyName The name of the company.
     * @param position The job position.
     * @param startDate The start date of the job in "yyyy-MM-dd" format.
     * @param endDate The end date of the job in "yyyy-MM-dd" format, or null if currently employed.
     * @param hourlyRate The hourly rate for the contract job.
     * @param hoursWorked The total number of hours worked on the contract.
     */
    public ContractJob(String companyName, String position, String startDate, String endDate, double hourlyRate, int hoursWorked) {
        super(companyName, position, startDate, endDate);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    /**
     * Assesses job satisfaction based on the total hours worked on the contract.
     *
     * @return A string indicating the level of job satisfaction.
     */
    @Override
    public String assessJobSatisfaction() {
        return hoursWorked > 1000 ? "High" : "Low";
    }

    /**
     * Calculates the total payment for the contract job based on the hourly rate and hours worked.
     *
     * @return The total payment as a double value.
     */
    public double calculatePayment() {
        return hourlyRate * hoursWorked;
    }

    /**
     * Evaluates the level of job security based on the duration of the contract.
     *
     * @return A string indicating the level of job security.
     */
    public String jobSecurity() {
        if (calculateJobDuration() > 90) {
            return "Good";
        } else {
            return "Bad";
        }
    }
}
