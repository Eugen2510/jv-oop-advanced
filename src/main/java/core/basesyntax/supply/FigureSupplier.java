package core.basesyntax.supply;

import core.basesyntax.figure.*;

import java.util.Random;

public class FigureSupplier {
    private final static int MIN_DIMENSION = 1;
    private final static int MAX_DIMENSION = 100;

    private final Random random = new Random();
    private final ColorSupplier colorSupplier = new ColorSupplier();

    private FigureType getRandomFigureType() {
        return FigureType.values()[random.nextInt(MIN_DIMENSION,FigureType.values().length)];
    }

    private double generateRandomDimension() {
        return random.nextDouble(MAX_DIMENSION);
    }

    public Figure getRandomFigure() {
        FigureType type = getRandomFigureType();
        Color color = colorSupplier.getRandomColor();
        return switch (type) {
            case CIRCLE -> new Circle(color, generateRandomDimension());
            case ISOSCELES_TRAPEZOID -> new IsoscelesTrapezoid(color, generateRandomDimension(),
                    generateRandomDimension(), generateRandomDimension());
            case RECTANGLE -> new Rectangle(color, generateRandomDimension(), generateRandomDimension());
            case RIGHT_TRIANGLE -> new RightTriangle(color, generateRandomDimension(),
                    generateRandomDimension());
            case SQUARE -> new Square(color, generateRandomDimension());
        };
    }

    public Figure getDefaultFigure() {
        return new Circle(Color.WHITE, 10);
    }
}
