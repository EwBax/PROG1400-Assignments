package character;

import weapon.*;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.io.IOException;

public class Rogue extends Player {

    // Rogue class constants
    public static final int ROGUE_DEFENSE_MODIFIER = -10;
    public static final int ROGUE_AGILITY_MODIFIER = 15;
    public static final int ROGUE_ATTACK_MODIFIER = 15;
    // Class description
    public static final String DESCRIPTION = "Rogues strike from the shadows. They wear light " +
            "armor which gives them a boost to agility at the cost of defense. Their quickness " +
            "allows them to deal higher amounts of damage.";

    // Class image icon
    private static ImageIcon image;


    // Constructor
    public Rogue(String name, int[] stats, Weapon playerWeapon) {
        super(name, stats, playerWeapon);
    }


    // Rogue specific rollStats method
    public static int[] rollStats() {

        // rolling stats like normal
        int[] stats = Character.rollStats();

        // Then adding rogue modifiers
        stats[StatIndex.DEFENSE.ordinal()] += ROGUE_DEFENSE_MODIFIER;
        stats[StatIndex.AGILITY.ordinal()] += ROGUE_AGILITY_MODIFIER;
        stats[StatIndex.BASE_ATTACK.ordinal()] += ROGUE_ATTACK_MODIFIER;

        return stats;

    }


    // Method to generate and return image icon
    public static ImageIcon getImage() {
        if (image == null) {
            try {
                image =
                        new ImageIcon(ImageIO.read(Rogue.class.getResourceAsStream(ImagePath.ROGUE.toString())));
            } catch (IOException e) {
                System.out.println("Error loading Rogue image\n");
            }
        }
        return image;
    }

}
