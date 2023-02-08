package weapon;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.IOException;

public class Dagger extends Weapon {

    // Dagger static properties
    public static final int         WEIGHT = 5;
    public static final int         ATTACK_MOD = 3;
    private static ImageIcon        image;

    // Constant String to use as description of weapon
    public static final String      DESCRIPTION = "A dagger is a quick weapon. It has a very low" +
            " weight but also deals lower amounts of damage than heavier weapons.";


    // Constructor
    public Dagger() {
        super(WEIGHT, ATTACK_MOD);
    }


    // Method to set and return image icon
    public static ImageIcon getImage() {
        if (image == null) {
            try {
                image =
                        new ImageIcon(ImageIO.read(Dagger.class.getResourceAsStream(ImagePath.DAGGER.toString())));
            } catch (IOException e) {
                System.out.println("Error loading Dagger image\n");
            }
        }
        return image;
    }

}
