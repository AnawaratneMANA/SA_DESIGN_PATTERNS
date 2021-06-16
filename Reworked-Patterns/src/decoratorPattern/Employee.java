package decoratorPattern;

public abstract class Employee {
    public String description;

    public Employee() {
        this.description = "General Employee";
    }

    abstract public double getSalary();
}
