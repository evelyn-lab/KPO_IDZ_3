package Equipments;

public class Equipment {
    private long id;
    private long type;
    private String name;
    private boolean active;

    public Equipment(long id, long type, String name, boolean active) {
        setId(id);
        setType(type);
        setName(name);
        setActive(active);
    }

    public void setId(long id) {
        if (id != 0) {
            this.id = id;
        } else {
            this.id = 0;
        }
    }

    public void setType(long type) {
        if (type != 0) {
            this.type = type;
        } else {
            this.type = 0;
        }
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        } else {
            this.name = "";
        }
    }

    public void setActive(boolean active) {
        if (!active) {
            this.active = false;
        } else {
            this.active = true;
        }
    }
}
