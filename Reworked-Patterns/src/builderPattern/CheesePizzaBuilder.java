package builderPattern;

public class CheesePizzaBuilder extends PizzaBuilder{
    Pizza pizza;

    public CheesePizzaBuilder() {
        this.pizza = new Pizza();
    }

    @Override
    public void buildPizzaBase() {
        System.out.println("Building Cheese Pizza base");
        pizza.setName("Cheese Pizza");
    }

    @Override
    public void buildPizzaTopping() {
        System.out.println("Add Cheese Pizza Topping");
        pizza.setName("Cheese Sauce");
    }

    @Override
    public Pizza getPizza() {
        System.out.println("Returning the Cheese Pizza");
        return this.pizza;

    }
}
