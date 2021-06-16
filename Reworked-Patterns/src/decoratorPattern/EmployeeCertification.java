package decoratorPattern;

public class EmployeeCertification extends EmployeeQualification{

    Employee employee;

    public EmployeeCertification(Employee employee) {
        this.employee = employee;
    }

    @Override
    public String getDescription() {
        return "Employee Certification";
    }

    @Override
    public double getSalary() {
        return 39 + employee.getSalary();
    }
}
