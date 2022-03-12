package peaksoft.models;

public class Car {

    private int id;
    private String name;
    private String color;
    private String model;

    public Car() {
    }

    public Car(int id, String name, String color, String model) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
