/**
 * The FullTimeJob class represents a full-time job, extending the Job class.
 * It includes specific attributes and methods related to full-time employment.
 */
public class FullTimeJob extends Job {
    private final double hourlyWage;
    private final int hoursPerWeek;

    /**
     * Constructs a FullTimeJob object with the specified details.
     *
     * @param companyName The name of the company.
     * @param position The job position.
     * @param startDate The start date of the job in "yyyy-MM-dd" format.
     * @param endDate The end date of the job in "yyyy-MM-dd" format, or null if currently employed.
     * @param hourlyWage The hourly wage for the full-time job.
     * @param hoursPerWeek The number of hours worked per week.
     */
    public FullTimeJob(String companyName, String position, String startDate, String endDate, double hourlyWage, int hoursPerWeek) {
        super(companyName, position, startDate, endDate);
        this.hourlyWage = hourlyWage;
        this.hoursPerWeek = hoursPerWeek;
    }

    /**
     * Assesses job satisfaction based on the number of hours worked per week and the hourly wage.
     *
     * @return A string indicating the level of job satisfaction.
     */
    @Override
    public String assessJobSatisfaction() {
        if (hoursPerWeek <= 40 && hourlyWage >= 20) {
            return "Satisfied";
        } else if (hoursPerWeek <= 60 && hourlyWage >= 20) {
            return "Moderately satisfied";
        } else {
            return "Unsatisfied";
        }
    }

    /**
     * Calculates the monthly salary based on the hourly wage and hours worked per week.
     *
     * @return The calculated salary as a double value.
     */
    public double calculateSalary() {
        return hourlyWage * hoursPerWeek * 4; // Assuming 4 weeks in a month
    }

    /**
     * Evaluates the work-life balance based on the number of hours worked per week.
     *
     * @return A string indicating the level of work-life balance.
     */
    public String evaluateWorkLifeBalance() {
        if (hoursPerWeek <= 40) {
            return "Perfect";
        } else if (hoursPerWeek < 60) {
            return "Decent Balance";
        } else {
            return "Worn Out";
        }
    }
}
