package templatePattern;

public class Coffie extends Beverage{
    @Override
    void brew() {
        System.out.println("Add Sugar and Milk");
    }

    @Override
    void addCondiments() {
        System.out.println("Stripping Coffee Through Filter");
    }
}
