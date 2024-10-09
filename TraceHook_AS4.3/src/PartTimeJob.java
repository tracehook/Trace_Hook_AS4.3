/**
 * The PartTimeJob class represents a part-time job, extending the Job class.
 * It includes specific attributes and methods related to part-time employment.
 */
public class PartTimeJob extends Job {
    private final double hourlyWage;
    private final int hoursPerWeek;

    /**
     * Constructs a PartTimeJob object with the specified details.
     *
     * @param companyName The name of the company.
     * @param position The job position.
     * @param startDate The start date of the job in "yyyy-MM-dd" format.
     * @param endDate The end date of the job in "yyyy-MM-dd" format, or null if currently employed.
     * @param hourlyWage The hourly wage for the part-time job.
     * @param hoursPerWeek The number of hours worked per week.
     */
    public PartTimeJob(String companyName, String position, String startDate, String endDate, double hourlyWage, int hoursPerWeek) {
        super(companyName, position, startDate, endDate);
        this.hourlyWage = hourlyWage;
        this.hoursPerWeek = hoursPerWeek;
    }

    /**
     * Assesses job satisfaction based on the hourly wage and hours worked per week.
     *
     * @return A string indicating the level of job satisfaction.
     */
    @Override
    public String assessJobSatisfaction() {
        if (hoursPerWeek == 20 && hourlyWage >= 13) {
            return "Satisfied";
        } else if (hoursPerWeek <= 20 && hourlyWage <= 13) {
            return "Moderately satisfied";
        } else {
            return "Bad Business";
        }
    }

    /**
     * Calculates the weekly earnings based on the hourly wage and hours worked per week.
     *
     * @return The total weekly earnings as a double value.
     */
    public double calculateWeeklyEarnings() {
        return hourlyWage * hoursPerWeek;
    }

    /**
     * Evaluates the work-life balance based on the number of hours worked per week.
     *
     * @return A string indicating the level of work-life balance.
     */
    public String evaluateWorkLifeBalance() {
        if (hoursPerWeek == 20) {
            return "Perfect";
        } else if (hoursPerWeek < 20 && hoursPerWeek >= 10) {
            return "Decent Balance";
        } else {
            return "Worn Out";
        }
    }
}
