package Agents;

import java.util.ArrayList;
import java.util.List;

public class AgentManager {
    // Attributes
    private List<AgentOrder> orders;

    // Constructor
    public AgentManager() {
        this.orders = new ArrayList<AgentOrder>();
    }

    // Methods
    public void assignOrder(Order order) {
        // assigns the order to an order agent
    }

    public void receiveOrderStatus(String status) {
        // updates the managing agent with the status of the order
    }
}