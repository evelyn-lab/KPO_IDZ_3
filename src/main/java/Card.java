import java.util.ArrayList;

public class Card {
    private long id;
    private String name;
    private String description;
    private double time;
    private long equipment;
    private ArrayList<Operation> operations;

    public Card(long id, String name, String description, double time,
                long equipment, ArrayList<Operation> operations) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.time = time;
        this.equipment = equipment;
        this.operations = operations;
    }
}
