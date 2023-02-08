package character;

import weapon.*;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.io.IOException;

public class Fighter extends Player {

    // Fighter Class Constants
    public static final int FIGHTER_HP_MODIFIER = 30;
    public static final int FIGHTER_DEFENSE_MODIFIER = 15;
    public static final int FIGHTER_AGILITY_MODIFIER = -10;
    // Class description
    public static final String DESCRIPTION = "Fighters like to to be in the front lines of the " +
            "battle. They have high hit points and defense, but low agility.";

    // Class image icon
    private static ImageIcon image;


    // Constructor
    public Fighter(String name, int[] stats, Weapon playerWeapon) {
        super(name, stats, playerWeapon);
    }


    // Fighter specific rollStats method
    public static int[] rollStats() {

        // rolling stats like normal
        int[] stats = Character.rollStats();

        // Then adding Fighter modifiers
        stats[StatIndex.HIT_POINTS.ordinal()] += FIGHTER_HP_MODIFIER;
        stats[StatIndex.DEFENSE.ordinal()] += FIGHTER_DEFENSE_MODIFIER;
        stats[StatIndex.AGILITY.ordinal()] += FIGHTER_AGILITY_MODIFIER;

        return stats;

    }


    // Method to generate and return image icon
    public static ImageIcon getImage() {
        if (image == null) {
            try {
                image =
                        new ImageIcon(ImageIO.read(Fighter.class.getResourceAsStream(ImagePath.FIGHTER.toString())));
            } catch (IOException e) {
                System.out.println("Error loading Fighter image\n");
            }
        }
        return image;
    }

}
