public class Product {
    private long id;
    private String name;
    private String company;
    private String unit;
    private double quantity;
    private double cost;
    private String delivered;
    private String valid_until;
    private boolean is_food;

    public Product(long id, String name, String company, String unit, double quantity,
                   double cost, String delivered, String valid_until, boolean is_food) {

        setId(id);
        setName(name);
        setCompany(company);
        setUnit(unit);
        setQuantity(quantity);
        setCost(cost);
        setDelivered(delivered);
        setValid_until(valid_until);
        setIs_food(is_food);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        if (id != 0) {
            this.id = id;
        } else {
            this.id = 0;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        } else {
            this.name = "";
        }
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        if (company != null) {
            this.company = company;
        } else {
            this.company = "";
        }
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        if (unit != null) {
            this.unit = unit;
        } else {
            this.unit = "";
        }
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        if (quantity != 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;
        }
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        if (cost != 0) {
            this.cost = cost;
        } else {
            this.cost = 0;
        }
    }

    public String getDelivered() {
        return delivered;
    }

    public void setDelivered(String delivered) {
        if (delivered != null) {
            this.delivered = delivered;
        } else {
            this.delivered = "";
        }
    }

    public String getValid_until() {
        return valid_until;
    }

    public void setValid_until(String valid_until) {
        if (valid_until != null) {
            this.valid_until = valid_until;
        } else {
            this.valid_until = "";
        }
    }

    public boolean isIs_food() {
        return is_food;
    }

    public void setIs_food(boolean is_food) {
        if (!is_food) {
            this.is_food = false;
        } else {
            this.is_food = true;
        }
    }
}
