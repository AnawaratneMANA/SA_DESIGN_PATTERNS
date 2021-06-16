package builderPattern;

public class ChickenPizzaBuilder extends PizzaBuilder{
    Pizza pizza;

    public ChickenPizzaBuilder() {
        this.pizza = new Pizza();
    }

    @Override
    public void buildPizzaBase() {
        System.out.println("Building Chicken Pizza base");
        pizza.setName("Chicken Pizza");
    }

    @Override
    public void buildPizzaTopping() {
        System.out.println("Add Chicken Pizza Topping");
        pizza.setName("Chicken Sauce");
    }

    @Override
    public Pizza getPizza() {
        System.out.println("Returning the Chicken Pizza");
        return this.pizza;

    }
}
