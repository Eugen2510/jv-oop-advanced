package core.basesyntax.figure;

import core.basesyntax.supply.Color;
import core.basesyntax.supply.FigureType;

public abstract class Figure {
    private final Color color;
    private final FigureType figureType;

    public Figure(Color color, FigureType figureType) {
        this.color = color;
        this.figureType = figureType;
    }

    public Color getColor() {
        return color;
    }

    public FigureType getFigureType() {
        return figureType;
    }

    public abstract double calculateArea();

    public abstract void draw();
}
