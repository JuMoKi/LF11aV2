import java.util.Scanner;
import java.util.ArrayList;

/**
 * Ein Bestellsystem mit Tastatur-Eingabe und Konsolen-Ausgabe
 */
public class OrderSystem {
    public static void printWelcomeMessage() {
        System.out.println("------------------------------------");
        System.out.println("Welcome to the Pizza Order Program!");
        System.out.println("------------------------------------");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        printWelcomeMessage();
        ArrayList<Pizza> pizzas = new ArrayList<>();

        System.out.println("Enter the total pizzas you would like to order: ");
        int totalPizzas = scanner.nextInt();

        // Reading input regarding pizza size and pizza toppings
        for (int i = 0; i < totalPizzas; ++i) {
            Pizza pizza = new Pizza();
            ArrayList<String> toppings = new ArrayList<>();
            String pizzaSize;

            System.out.println("Enter the size of the pizza Large, Medium, Small: ");
            pizzaSize = scanner.next();
            // TODO: setze die Pizza-Größe
            pizza.setSize(pizzaSize);

            int totalToppings;
            System.out.println("Enter the total amount of toppings on the pizza: ");
            totalToppings = scanner.nextInt();

            for (int j = 0; j < totalToppings; ++j) {
                System.out.println("Enter the topping: ");
                String topping = scanner.next();
                // TODO füge das 'topping' zu den 'toppings' hinzu
                toppings.add(topping);
            }
            // TODO: setze die Pizza-Toppings
                pizza.setToppings(toppings);

            // TODO füge die Pizza zu den 'pizzas' hinzu
                pizzas.add(pizza);
            
        }
        // Creating PizzaOrder object and relevant information with regards to (da highest of da) order
        PizzaOrder order = new PizzaOrder(pizzas);
        // TODO: berechne die 'TotalOrderCost'
        order.calculateTotalOrderCost();

        // TODO: gib die 'OrderSummary' aus
         order.printOrderSummary();
        // Cleanup
        scanner.close();
    }
}