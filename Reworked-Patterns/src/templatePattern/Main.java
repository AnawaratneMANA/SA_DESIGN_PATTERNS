package templatePattern;

public class Main {
    public static void main(String[] args) {
        //Create the beverage.
        Beverage tea = new Tea();
        //Execute the template.
        tea.prepareRecepie();

        System.out.println();

        //Create the beverage.
        Beverage coffee = new Coffie();
        //Execute the template.
        coffee.prepareRecepie();
    }
}
