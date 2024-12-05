abstract class Shape {
    private final Color color;
    
    abstract double getArea();
    abstract double getPerimeter();

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public String getColorDescription() {
        if (color == null) {
            return "Red: 0, Green: 0, Blue: 0, Alpha: 0";
        } else {
            return String.format("Red: %d, Green: %d, Blue: %d, Alpha: %d",
            getColor().red(), getColor().green(),
            getColor().blue(), getColor().alpha());
        }
    }
}