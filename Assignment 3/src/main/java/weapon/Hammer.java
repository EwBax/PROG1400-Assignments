package weapon;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import java.io.IOException;

public class Hammer extends Weapon {

    // Hammer static properties
    public static final int WEIGHT = 15;
    public static final int ATTACK_MOD = 8;
    // Constant String to use as description of weapon
    public static final String DESCRIPTION = "A hammer is a slow weapon. It has a high weight " +
            "but deals massive amounts of damage";

    // Hammer image
    private static ImageIcon image;


    // Constructor
    public Hammer() {
        super(WEIGHT, ATTACK_MOD);
    }


    // Method to set and return image icon
    public static ImageIcon getImage() {
        if (image == null) {
            try {
                image =
                        new ImageIcon(ImageIO.read(Hammer.class.getResourceAsStream(ImagePath.HAMMER.toString())));
            } catch (IOException e) {
                System.out.println("Error loading Hammer image\n");
            }
        }
        return image;
    }

}
