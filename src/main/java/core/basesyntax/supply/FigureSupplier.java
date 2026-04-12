package core.basesyntax.supply;

import core.basesyntax.figure.Figure;
import core.basesyntax.figure.Circle;
import core.basesyntax.figure.IsoscelesTrapezoid;
import core.basesyntax.figure.Rectangle;
import core.basesyntax.figure.RightTriangle;
import core.basesyntax.figure.Square;
import java.util.Random;

public class FigureSupplier {
    private static final int MIN_DIMENSION = 1;
    private static final int MAX_DIMENSION = 100;

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    private FigureType getRandomFigureType() {
        return FigureType.values()[random.nextInt(FigureType.values().length)];
    }

    private double genRandDimension() {
        return random.nextDouble(MIN_DIMENSION, MAX_DIMENSION);
    }

    public Figure getRandomFigure() {
        FigureType type = getRandomFigureType();
        Color color = colorSupplier.getRandomColor();
        return switch (type) {
            case CIRCLE -> new Circle(color, genRandDimension());
            case ISOSCELES_TRAPEZOID -> new IsoscelesTrapezoid(color, genRandDimension(),
                    genRandDimension(), genRandDimension());
            case RECTANGLE -> new Rectangle(color, genRandDimension(), genRandDimension());
            case RIGHT_TRIANGLE -> new RightTriangle(color, genRandDimension(),
                    genRandDimension());
            case SQUARE -> new Square(color, genRandDimension());
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10);
    }
}
