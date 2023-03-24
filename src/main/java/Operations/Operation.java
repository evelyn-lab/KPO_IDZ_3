package Operations;

import Products.Product;

import java.util.ArrayList;

public class Operation {
    private long id;
    private String name;
    private long type;
    private double time;
    private int point;
    private ArrayList<Product> products;

    public Operation(long id, String name, long type, double time, int point, ArrayList<Product> products) {
        setId(id);
        setName(name);
        setType(type);
        setTime(time);
        setPoint(point);
        setProducts(products);
    }

    public void setId(long id) {
        if (id != 0) {
            this.id = id;
        } else {
            this.id = 0;
        }
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        } else {
            this.name = "";
        }
    }

    public void setType(long type) {
        if (type != 0) {
            this.type = type;
        } else {
            this.type = 0;
        }
    }

    public void setTime(double time) {
        if (time != 0) {
            this.time = time;
        } else {
            this.time = 0;
        }
    }

    public void setPoint(int point) {
        if (point != 0) {
            this.point = point;
        } else {
            this.point = 0;
        }
    }

    public void setProducts(ArrayList<Product> products) {
        if (products != null) {
            this.products = products;
        } else {
            this.products = null;
        }
    }
}
