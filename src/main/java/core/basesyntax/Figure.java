package core.basesyntax;

public abstract class Figure implements Drawable {
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
}
