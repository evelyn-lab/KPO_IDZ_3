public class Dish {
    private long id;
    private long card;
    private double price;
    private boolean active;

    public Dish(long id, long card, double price, boolean active) {
        this.id = id;
        this.card = card;
        this.price = price;
        this.active = active;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getCard() {
        return card;
    }

    public void setCard(long card) {
        this.card = card;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
