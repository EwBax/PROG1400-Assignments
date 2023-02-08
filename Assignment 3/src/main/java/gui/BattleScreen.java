package gui;

import character.*;

import javax.swing.*;
import java.awt.*;

public class BattleScreen extends JPanel {

    // Panel constants
    private static final float TITLE_SIZE = 69f;
    private static final float MEDIUM_SIZE = 30f;
    private static final float BATTLE_FONT = 20f;

    // Panel swing components
    private JLabel      titleLabel;
    private JLabel      playerLabel;
    private JLabel      monsterLabel;
    private JLabel      playerImageLabel;
    private JLabel      monsterImageLabel;
    private JTextArea   battleInfo;


    // Constructor
    public BattleScreen () {

        // Setting layout and background color
        this.setLayout(null);
        this.setBackground(Color.decode(MainFrame.BACKGROUND_COLOR));

        // Title label
        titleLabel = new JLabel("Battle to the Death!");
        titleLabel.setFont(MainFrame.OLD_ENGLISH.deriveFont(TITLE_SIZE));
        titleLabel.setBounds(104, 20, 542, 84);

        // Player label
        playerLabel = new JLabel();
        playerLabel.setFont(MainFrame.CALIBRI.deriveFont(MEDIUM_SIZE));
        playerLabel.setBounds(128, 138, 189, 37);

        // Monster label
        monsterLabel = new JLabel();
        monsterLabel.setFont(MainFrame.CALIBRI.deriveFont(MEDIUM_SIZE));
        monsterLabel.setBounds(434, 138, 234, 37);

        // Player Image Label
        playerImageLabel = new JLabel();
        playerImageLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        playerImageLabel.setBounds(170, 209, 105, 140);

        // Monster Image Label
        monsterImageLabel = new JLabel();
        monsterImageLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        monsterImageLabel.setBounds(499, 209, 105, 140);

        // battle info text area
        battleInfo = new JTextArea();
        battleInfo.setEnabled(false);
        battleInfo.setDisabledTextColor(Color.BLACK);
        battleInfo.setFont(MainFrame.CALIBRI.deriveFont(BATTLE_FONT));
        battleInfo.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.BLACK),
                BorderFactory.createEmptyBorder(10, 10, 10, 10)));
        battleInfo.setBounds(36, 388, 679, 289);

        this.add(titleLabel);
        this.add(playerLabel);
        this.add(monsterLabel);
        this.add(playerImageLabel);
        this.add(monsterImageLabel);
        this.add(battleInfo);

    }


    // Method to populate labels and text area with character information
    public void populateBattleScreen(CharacterType characterType) {

        // Getting player type
        playerLabel.setText("Player: " + MainFrame.playerCharacter.getClass().getSimpleName());

        // Getting player image
        switch (characterType) {

            case CLERIC -> playerImageLabel.setIcon(Cleric.getImage());

            case FIGHTER -> playerImageLabel.setIcon(Fighter.getImage());

            case ROGUE -> playerImageLabel.setIcon(Rogue.getImage());

        }

        // Getting monster type / name
        monsterLabel.setText("Monster: " + MainFrame.monsterCharacter.getName());
        monsterImageLabel.setIcon(MainFrame.monsterCharacter.getImage());

        // Battle info
        battleInfo.setText(MainFrame.playerCharacter.toString() + "\n\n" +
                MainFrame.monsterCharacter.toString());


    }

}
