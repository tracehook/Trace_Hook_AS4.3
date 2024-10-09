import java.time.LocalDate;
import java.time.Period;

/**
 * The abstract class Job represents a general job with basic attributes
 * and methods that can be inherited by specific job types.
 */
public abstract class Job {
    protected String companyName;
    protected String position;
    protected String startDate;
    protected String endDate;

    /**
     * Constructs a Job object with the specified details.
     *
     * @param companyName The name of the company.
     * @param position The job position.
     * @param startDate The start date of the job in "yyyy-MM-dd" format.
     * @param endDate The end date of the job in "yyyy-MM-dd" format, or null if currently employed.
     */
    public Job(String companyName, String position, String startDate, String endDate) {
        this.companyName = companyName;
        this.position = position;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    /**
     * Displays the job details including the company name, position,
     * start date, and end date.
     */
    public void displayJobDetails() {
        System.out.println("Company: " + companyName);
        System.out.println("Position: " + position);
        System.out.println("Start Date: " + startDate);
        System.out.println("End Date: " + (endDate != null ? endDate : "Present"));
    }

    /**
     * Calculates the duration of the job in days from the start date to the end date.
     *
     * @return The duration of the job in days.
     */
    public int calculateJobDuration() {
        LocalDate start = LocalDate.parse(startDate);
        LocalDate end = (endDate != null) ? LocalDate.parse(endDate) : LocalDate.now();
        int duration = Period.between(start, end).getDays();
        return duration;
    }

    /**
     * Abstract method to assess job satisfaction. This method must be implemented
     * by subclasses to provide specific satisfaction assessments.
     *
     * @return A string representing the job satisfaction level.
     */
    public abstract String assessJobSatisfaction();
}
