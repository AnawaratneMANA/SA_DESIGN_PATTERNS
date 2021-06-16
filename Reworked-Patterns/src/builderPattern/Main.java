package builderPattern;

public class Main {
    public static void main(String[] args) {
        Waiter waiterOne = new Waiter(new CheesePizzaBuilder()).serve();
        System.out.println();
        Waiter waiterTwo = new Waiter(new ChickenPizzaBuilder()).serve();
    }
}
