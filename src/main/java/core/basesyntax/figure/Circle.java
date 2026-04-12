package core.basesyntax.figure;

import core.basesyntax.supply.Color;
import core.basesyntax.supply.FigureType;

public class Circle extends Figure {
    private final double radius;

    public Circle(Color color, double radius) {
        super(color, FigureType.CIRCLE);
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void draw() {
        System.out.println("Figure: "
                + getFigureType().name().toLowerCase() + ", "
                + "area: " + calculateArea() + " sq. units, "
                + "radius: " + radius + " units, "
                + "color: " + getColor().name().toLowerCase());
    }
}
