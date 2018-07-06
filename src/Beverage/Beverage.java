package Beverage;

public abstract class Beverage {
    private String description;

    public void setDescription(String d) {
        this.description = d;
    }

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
