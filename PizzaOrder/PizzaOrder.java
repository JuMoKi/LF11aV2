import java.util.ArrayList;

/**
 * Repräsentiert eine Bestellung mit Gesamtkosten und Liste der Pizzen
 */
public class PizzaOrder {
    private double totalOrderCost;
    private final ArrayList<Pizza> pizzas;

    public PizzaOrder(ArrayList<Pizza> pizzas) {
        this.pizzas = pizzas;
    }

    public void calculateTotalOrderCost() {
        final double LARGE_COST = 9.99;
        final double MEDIUM_COST = 7.99;
        final double SMALL_COST = 5.99;
        final double COST_PER_TOPPING = 0.5;

        for (Pizza pizza : pizzas) {
            switch (pizza.getSize()) {
                case "Large":
                    // TODO: füge der 'totalOrderCost' den Preis für eine große Pizza hinzu
                    totalOrderCost += LARGE_COST;
                    break;
                    case "Medium":
                    // TODO: füge der 'totalOrderCost' den Preis für eine mittlere Pizza hinzu
                    totalOrderCost += MEDIUM_COST;
                    break;
                    case "Small":
                    // TODO: füge der 'totalOrderCost' den Preis für eine kleine Pizza hinzu
                    totalOrderCost += SMALL_COST;
                    break;
                default:
                    totalOrderCost += 0.0;
            }
            // TODO: berechne die Gesamtzahl der Toppings
            int totalToppings = pizza.getToppings().size();
            // TODO berechne die 'totalOrderCost'
            // Formel: Gesamtzahl der Toppings * Kosten pro Topping
            totalOrderCost += totalToppings * COST_PER_TOPPING;
        }
    }

    public double getTotalOrderCost() {
        return totalOrderCost;
    }

    public void printOrderSummary() {
        for (Pizza pizza : pizzas) {
            System.out.println("Ordered a " + pizza);
        }
        System.out.println("TOTAL ORDER AMOUNT: " + getTotalOrderCost());
    }
}