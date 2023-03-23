import java.util.ArrayList;

public class Operation {
    private long type;
    private double time;
    private int point;
    private ArrayList<Product> products;

    public Operation(long type, double time, int point, ArrayList<Product> products) {
        this.type = type;
        this.time = time;
        this.point = point;
        this.products = products;
    }
}
