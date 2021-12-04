package by.bsuir.webtech.task9.entity;

public class Ball {
    private final Color color;
    private final double weight;

    public Ball(Color color, double weight) {
        this.color = color;
        this.weight = weight;
    }

    public Color getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }
}
