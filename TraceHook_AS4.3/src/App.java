public class App {
    public static void main(String[] args) {
        Employee employee = new Employee();

        FullTimeJob fullTimeJob = new FullTimeJob("Murray State", "CSC Professor", "2023-08-15", null, 40.0, 45);
        PartTimeJob partTimeJob = new PartTimeJob("The Bookstore", "Cashier", "2022-08-01", "2024-05-13", 15.0, 15);
        ContractJob contractJob = new ContractJob("Construction", "Laborer", "2023-08-01", "2024-08-01", 50.0, 1200);

        employee.addJob(fullTimeJob);
        employee.addJob(partTimeJob);
        employee.addJob(contractJob);

        employee.displayJobHistory();
    }
}
