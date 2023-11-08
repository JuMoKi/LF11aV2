
import java.util.ArrayList;

/**
 * Represents a pizza with size and toppings
 */
public class Pizza {
    private String size;
    private ArrayList<String> toppings;

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public ArrayList<String> getToppings() {
        return toppings;
    }

    public void setToppings(ArrayList<String> toppings) {
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return this.size + " pizza with " + this.getToppings();
    }
}