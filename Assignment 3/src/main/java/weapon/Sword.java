package weapon;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.io.IOException;

public class Sword extends Weapon {

    // Sword static properties
    public static final int WEIGHT = 10;
    public static final int ATTACK_MOD = 5;
    // Constant String to use as description of weapon
    public static final String DESCRIPTION = "A sword is a well rounded weapon. It is not too " +
            "heavy and deals decent amounts of damage.";

    // Sword image
    private static ImageIcon image;


    // Constructor
    public Sword() {
        super(WEIGHT, ATTACK_MOD);
    }

    public static ImageIcon getImage() {
        if (image == null) {
            try {
                image =
                        new ImageIcon(ImageIO.read(Sword.class.getResourceAsStream(ImagePath.SWORD.toString())));
            } catch (IOException e) {
                System.out.println("Error loading Sword image\n");
            }
        }
        return image;
    }
}
