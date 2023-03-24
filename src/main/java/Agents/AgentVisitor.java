package Agents;

public class AgentVisitor {
    // Attributes
    private String name;
    private AgentOrder order;

    // Constructor
    public AgentVisitor(String name) {
        this.name = name;
        this.order = null;
    }

    // Methods
    public void createOrder(AgentOrder order) {
        // sends order to the order agent
    }

    public void receiveOrderStatus(String status) {
        // updates the visitor with the status of the order
    }
}
