package decoratorPattern;

public class Manager extends Employee{

    public Manager() {
        description = "Manager";
    }

    @Override
    public double getSalary() {
        return 1;
    }
}
