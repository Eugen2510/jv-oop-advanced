package core.basesyntax.figure;

import core.basesyntax.supply.Color;
import core.basesyntax.supply.FigureType;

public class IsoscelesTrapezoid extends Figure {
    private final double upperBase;
    private final double lowerBase;
    private final double height;

    public IsoscelesTrapezoid(Color color, double upperBase, double lowerBase, double height) {
        super(color, FigureType.ISOSCELES_TRAPEZOID);
        this.upperBase = upperBase;
        this.lowerBase = lowerBase;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return (upperBase + lowerBase) / 2 * height;
    }

    @Override
    public void draw() {
        System.out.println("Figure: "
                + getFigureType().name().toLowerCase() + ", "
                + "area: " + calculateArea() + " sq. units, "
                + "upperBase: " + upperBase + " units, "
                + "lowerBase: " + lowerBase + " units, "
                + "height: " + height + " units, "
                + "color: " + getColor().name().toLowerCase());
    }
}
