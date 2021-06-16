package decoratorPattern;

public class Main {
    public static void main(String[] args) {

        //Create an employee.
        Employee employee = new Manager();

        //Add a multiple filters to the employee. - Method 1
        employee = new WorkExperience(employee);
        employee = new EmployeeCertification(employee);

        //Printing the salary after the filter
        System.out.println("With a Single Filter = " + employee.getSalary());

        //Creating the second employee
        Employee employee1 = new Manager();

        //Adding multiple filters to the Manager. - Method 2
        employee1 = new EmployeeCertification(new WorkExperience(employee1));

        //Print the Salary after applying two filters.
        System.out.println("With two filters " + employee1.getSalary());

        //Create another employee
        Employee employee3 = new Consultant();

        //Applying a another filter to consultant
        employee3 = new EmployeeCertification(employee3);

        //Printing the Salary after applying the single filter.
        System.out.println("With a single Filter " + employee3.getSalary());

    }
}
