package weapon;

public abstract class Weapon {

    // Weapon Properties
    private final int weight;
    private final int attackMod;


    // Constructor
    public Weapon(int weight, int attackMod) {
        this.weight = weight;
        this.attackMod = attackMod;
    }


    @Override
    public String toString() {

        return String.format("""
                        Weapon: %-14s                 Weight: %d      Attack Mod: %d""",
                this.getClass().getSimpleName(),
                this.weight,
                this.attackMod
        );

    }


}
