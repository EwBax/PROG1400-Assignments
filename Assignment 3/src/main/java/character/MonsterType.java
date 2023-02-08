package character;

public enum MonsterType {
    BEHOLDER ("Beholder"),
    DRAGON ("Dragon"),
    VAMPIRE ("Vampire");

    private final String name;

    MonsterType(final String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
