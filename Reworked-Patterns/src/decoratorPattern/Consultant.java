package decoratorPattern;

public class Consultant extends Employee{

    public Consultant() {
        description = "Consultant";
    }

    @Override
    public double getSalary() {
        return 3;
    }
}
