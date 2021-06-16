package decoratorPattern;

public class WorkExperience extends EmployeeQualification{

    Employee employee;

    public WorkExperience(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String getDescription() {
        return "Employee Work Experience";
    }

    @Override
    public double getSalary() {
        return 20 + employee.getSalary();
    }
}