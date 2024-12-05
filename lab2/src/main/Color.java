public record Color(int red, int green, int blue, int alpha) {
    public Color(int red, int green, int blue) {
        this(red, green, blue, 0);
    }
}
