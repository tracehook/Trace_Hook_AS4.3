import java.util.ArrayList;
import java.util.List;

/**
 * The Employee class represents an employee with a history of jobs.
 * It provides methods to manage and display the employee's job history.
 */
public class Employee {
    private List<Job> jobHistory;

    /**
     * Constructs an Employee object with an empty job history.
     */
    public Employee() {
        jobHistory = new ArrayList<>();
    }

    /**
     * Adds a job to the employee's job history.
     *
     * @param job The Job object to be added to the job history.
     */
    public void addJob(Job job) {
        jobHistory.add(job);
    }

    /**
     * Displays the job history of the employee, including details for each job,
     * the job duration, and job satisfaction.
     */
    public void displayJobHistory() {
        for (Job job : jobHistory) {
            job.displayJobDetails();
            System.out.println("Job Duration: " + job.calculateJobDuration() + " days");
            System.out.println("Job Satisfaction: " + job.assessJobSatisfaction());
            System.out.println();
        }
    }
}
