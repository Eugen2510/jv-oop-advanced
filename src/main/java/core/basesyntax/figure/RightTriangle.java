package core.basesyntax.figure;

import core.basesyntax.supply.Color;
import core.basesyntax.supply.FigureType;

public class RightTriangle extends Figure {
    private final double legA;
    private final double legB;

    public RightTriangle(Color color, double legA, double legB) {
        super(color, FigureType.RIGHT_TRIANGLE);
        this.legA = legA;
        this.legB = legB;
    }

    @Override
    public double calculateArea() {
        return legA * legB / 2;
    }

    @Override
    public void draw() {
        System.out.println("Figure: "
                + getFigureType().name().toLowerCase() + ", "
                + "area: " + calculateArea() + " sq. units, "
                + "legA: " + legA + " units, "
                + "legB: " + legB + " units, "
                + "color: " + getColor().name().toLowerCase());
    }
}
