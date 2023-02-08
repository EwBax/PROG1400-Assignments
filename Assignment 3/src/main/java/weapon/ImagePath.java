package weapon;

// Paths for the weapon images
public enum ImagePath {
    DAGGER ("/images/dagger.png"),
    HAMMER ("/images/hammer.png"),
    SWORD ("/images/sword.png");

    private final String path;

    ImagePath(final String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return this.path;
    }
}
