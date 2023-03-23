import java.util.ArrayList;
import java.util.List;

public class AgentOrder {
    // Attributes
    private List<AgentProduct> products;
    private List<AgentProduct> processes;

    // Constructor
    public AgentOrder() {
        this.products = new ArrayList<AgentProduct>();
        this.processes = new ArrayList<AgentProduct>();
    }

    // Methods
    public void receiveOrder(AgentOrder order) {
        // creates product agents for each product in the order
        // creates process agents for each process in the order
    }

    public void receiveProcessStatus(String status) {
        // updates the order status based on the status of the processes
    }
}

