package character;

import weapon.*;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.io.IOException;

public class Cleric extends Player {

    // Cleric class constants
    public static final int CLERIC_DEFENSE_MODIFIER = 15;
    public static final int CLERIC_AGILITY_MODIFIER = 15;
    public static final int CLERIC_ATTACK_MODIFIER = -10;

    // Class description
    public static final String DESCRIPTION = "Clerics excel in survival. They have high defense " +
            "and agility which allows them to avoid damage, but they in turn deal lower damage " +
            "than other classes.";

    // Class image icon
    private static ImageIcon image;


    // Constructor
    public Cleric(String name, int[] stats, Weapon playerWeapon) {
        super(name, stats, playerWeapon);
    }

    // Cleric specific rollStats method
    public static int[] rollStats() {

        // rolling stats like normal
        int[] stats = Character.rollStats();

        // Then adding Cleric modifiers
        stats[StatIndex.DEFENSE.ordinal()] += CLERIC_DEFENSE_MODIFIER;
        stats[StatIndex.AGILITY.ordinal()] += CLERIC_AGILITY_MODIFIER;
        stats[StatIndex.BASE_ATTACK.ordinal()] += CLERIC_ATTACK_MODIFIER;

        return stats;

    }


    // Method to generate and return image icon
    public static ImageIcon getImage() {

        if (image == null) {
            try {
                image =
                        new ImageIcon(ImageIO.read(Cleric.class.getResourceAsStream(ImagePath.CLERIC.toString())));
            } catch (IOException e) {
                System.out.println("Error loading Cleric image\n");
            }
        }

        return image;
    }

}
