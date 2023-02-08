package gui;

import character.*;

import javax.swing.*;
import java.awt.*;
import java.util.concurrent.ThreadLocalRandom;

public class MainFrame extends JFrame {

    // Background color constant for panels to use
    public static final String      BACKGROUND_COLOR = "#9DA2AC";
    public static final Font        OLD_ENGLISH = new Font("Old English Text MT", Font.PLAIN, 12);
    public static final Font        CALIBRI = new Font("Calibri", Font.PLAIN, 12);


    // Panels / Screens
    public static SplashScreen      splashScreen;
    public static CharacterScreen   characterScreen;
    public static BattleScreen      battleScreen;

    // Player and Monster Characters
    public static Player            playerCharacter;
    public static Monster           monsterCharacter;


    // Constructor
    public MainFrame() {

        this.setTitle("D&D Game");

        // Making program exit when frame is closed
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);

        // Setting the layout to absolute positioning
        this.setLayout(null);

        // Setting the size of the Frame
        this.setSize(750, 750);

        // Making frame centered on screen
        this.setLocationRelativeTo(null);

        // Creating splash Screen
        splashScreen = new SplashScreen();
        splashScreen.setBounds(0, 0, 750, 750);
        splashScreen.setVisible(true);

        // Creating character screen
        characterScreen = new CharacterScreen();
        characterScreen.setBounds(0, 0, 750, 750);
        characterScreen.setVisible(false);

        battleScreen = new BattleScreen();
        battleScreen.setBounds(0, 0, 750, 750);
        battleScreen.setVisible(false);


        this.add(splashScreen);
        this.add(characterScreen);
        this.add(battleScreen);

    }


    // Method to generate random monster
    public static void generateMonster() {

        // Generating a random number to represent monster type
        int random =
                ThreadLocalRandom.current().nextInt(MonsterType.values().length);

        // random will always be 0, 1, or 2, but default case covers 0 case just in case of
        // unforeseen values
        MonsterType monsterType = switch (random) {

            default -> MonsterType.BEHOLDER;

            case 1 -> MonsterType.DRAGON;

            case 2 -> MonsterType.VAMPIRE;

        };

        // Initializing monster
        monsterCharacter = new Monster(monsterType.toString(), monsterType);

    }

}
