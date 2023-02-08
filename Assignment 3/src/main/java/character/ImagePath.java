package character;

// Paths for the character images (player and monster)
public enum ImagePath {
    CLERIC ("/images/cleric.png"),
    FIGHTER ("/images/fighter.png"),
    ROGUE ("/images/rogue.png"),
    BEHOLDER ("/images/beholder.png"),
    DRAGON ("/images/dragon.png"),
    VAMPIRE ("/images/vampire.jpeg");

    private final String path;

    ImagePath(final String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return this.path;
    }
}
