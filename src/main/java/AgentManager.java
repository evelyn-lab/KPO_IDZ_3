public class AgentManager {
    // Attributes
    private List<OrderAgent> orders;

    // Constructor
    public AgentManager() {
        this.orders = new ArrayList<OrderAgent>();
    }

    // Methods
    public void assignOrder(Order order) {
        // assigns the order to an order agent
    }

    public void receiveOrderStatus(String status) {
        // updates the managing agent with the status of the order
    }
}