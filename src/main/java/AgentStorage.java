import java.util.HashMap;
import java.util.Map;

public class AgentStorage {
    // Attributes
    private Map<String, Double> stock;

    // Constructor
    public AgentStorage() {
        this.stock = new HashMap<String, Double>();
    }

    // Methods
    public boolean checkStock(String product, double amount) {
        // checks if there is enough stock of a certain product
        // returns true if there is enough stock, false otherwise
        return false;
    }

    public void reserveStock(String product, double amount) {
        // reserves a certain amount of a product from the stock
        // creates a product agent for the reserved amount
    }

    public void releaseStock(String product, double amount) {
        // releases a certain amount of a product back to the stock
        // destroys the corresponding product agent
    }
}