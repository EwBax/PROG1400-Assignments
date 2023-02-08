package gui;

import character.*;
import character.Character;
import weapon.*;

import javax.swing.*;
import javax.swing.border.CompoundBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CharacterScreen extends JPanel {

    // Font sizes
    private static final float  TITLE_FONT =     54f;
    private static final float  MEDIUM_FONT =    26f;
    private static final float  SMALL_FONT =     19f;
    private static final float  TEXT_AREA_FONT = 14f;

    // Data for character creation
    private CharacterType       typeSelection = CharacterType.DEFAULT;
    private CharacterType       statsType = CharacterType.DEFAULT;
    private WeaponType          weaponSelection;
    private int[]               stats;
    private Weapon              playerWeapon;

    // Screen components
    private JLabel              titleLabel;
    private JLabel              nameLabel;
    private JLabel              typeLabel;
    private JLabel              typeImageLabel;
    private JLabel              statsLabel;
    private JLabel              hitPointsLabel;
    private JLabel              defenseLabel;
    private JLabel              agilityLabel;
    private JLabel              baseAttackLabel;
    private JLabel              weaponLabel;
    private JLabel              weaponImageLabel;
    private JLabel              weaponStatsLabel;
    private JLabel              attackModLabel;
    private JLabel              weightLabel;
    private JTextField          nameText;
    private JTextField          hitPointsText;
    private JTextField          defenseText;
    private JTextField          agilityText;
    private JTextField          baseAttackText;
    private JTextField          attackModText;
    private JTextField          weightText;
    private JTextArea           typeDescription;
    private JTextArea           weaponDescription;


    // Constructor
    public CharacterScreen() {

        // Setting layout and background color
        this.setLayout(null);
        this.setBackground(Color.decode(MainFrame.BACKGROUND_COLOR));

        // title label
        titleLabel = new JLabel("Character Generator");
        titleLabel.setFont(MainFrame.OLD_ENGLISH.deriveFont(TITLE_FONT));
        titleLabel.setBounds(154, 6, 442, 66);

        // name label
        nameLabel = new JLabel("Enter Name");
        nameLabel.setFont(MainFrame.OLD_ENGLISH.deriveFont(MEDIUM_FONT));
        nameLabel.setBounds(53, 94, 134, 32);

        // Name text Field
        nameText = new JTextField();
        nameText.setBounds(212, 100, 212, 26);

        // type label
        typeLabel = new JLabel("Character Type");
        typeLabel.setFont(MainFrame.OLD_ENGLISH.deriveFont(MEDIUM_FONT));
        typeLabel.setBounds(53, 151, 162, 32);

        // type image label
        typeImageLabel = new JLabel("Select a Type");
        typeImageLabel.setHorizontalAlignment(SwingConstants.CENTER);
        typeImageLabel.setBounds(255, 181, 105, 140);
        typeImageLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        // type description
        typeDescription = new JTextArea();
        typeDescription.setEnabled(false);
        typeDescription.setLineWrap(true);
        typeDescription.setWrapStyleWord(true);
        typeDescription.setBounds(53, 340, 371, 71);
        typeDescription.setBorder(new CompoundBorder(BorderFactory.createLineBorder(Color.BLACK),
                BorderFactory.createEmptyBorder(10, 10, 10, 10)));
        typeDescription.setFont(MainFrame.CALIBRI.deriveFont(TEXT_AREA_FONT));
        typeDescription.setDisabledTextColor(Color.BLACK);

        // stats label
        statsLabel = new JLabel("Character Stats");
        statsLabel.setFont(MainFrame.OLD_ENGLISH.deriveFont(MEDIUM_FONT));
        statsLabel.setBounds(505, 151, 167, 32);

        // hit points label
        hitPointsLabel = new JLabel("Hit Points");
        hitPointsLabel.setFont(MainFrame.CALIBRI.deriveFont(SMALL_FONT));
        hitPointsLabel.setBounds(505, 198, 74, 23);

        // hit points text
        hitPointsText = new JTextField();
        hitPointsText.setEnabled(false);
        hitPointsText.setDisabledTextColor(Color.BLACK);
        hitPointsText.setBounds(633, 192, 39, 26);

        // defense label
        defenseLabel = new JLabel("Defense");
        defenseLabel.setFont(MainFrame.CALIBRI.deriveFont(SMALL_FONT));
        defenseLabel.setBounds(505, 229, 74, 23);

        // defense text
        defenseText = new JTextField();
        defenseText.setEnabled(false);
        defenseText.setDisabledTextColor(Color.BLACK);
        defenseText.setBounds(633, 223, 39, 26);

        // agility label
        agilityLabel = new JLabel("Agility");
        agilityLabel.setFont(MainFrame.CALIBRI.deriveFont(SMALL_FONT));
        agilityLabel.setBounds(505, 260, 74, 23);

        // agility text
        agilityText = new JTextField();
        agilityText.setEnabled(false);
        agilityText.setDisabledTextColor(Color.BLACK);
        agilityText.setBounds(633, 254, 39, 26);

        // base attack label
        baseAttackLabel = new JLabel("Base Attack");
        baseAttackLabel.setFont(MainFrame.CALIBRI.deriveFont(SMALL_FONT));
        baseAttackLabel.setBounds(505, 291, 90, 23);

        // base attack text
        baseAttackText = new JTextField();
        baseAttackText.setEnabled(false);
        baseAttackText.setDisabledTextColor(Color.BLACK);
        baseAttackText.setBounds(633, 285, 39, 26);

        // Weapon label
        weaponLabel = new JLabel("Select Your Weapon");
        weaponLabel.setFont(MainFrame.OLD_ENGLISH.deriveFont(MEDIUM_FONT));
        weaponLabel.setBounds(53, 431, 220, 32);

        // weapon image label
        weaponImageLabel = new JLabel("Select a Weapon");
        weaponImageLabel.setHorizontalAlignment(SwingConstants.CENTER);
        weaponImageLabel.setBounds(255, 475, 105, 140);
        weaponImageLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        // weapon description
        weaponDescription = new JTextArea();
        weaponDescription.setEnabled(false);
        weaponDescription.setLineWrap(true);
        weaponDescription.setWrapStyleWord(true);
        weaponDescription.setBounds(53, 623, 371, 51);
        weaponDescription.setBorder(new CompoundBorder(BorderFactory.createLineBorder(Color.BLACK),
                BorderFactory.createEmptyBorder(10, 10, 10, 10)));
        weaponDescription.setFont(MainFrame.CALIBRI.deriveFont(TEXT_AREA_FONT));
        weaponDescription.setDisabledTextColor(Color.BLACK);

        // Weapon stats label
        weaponStatsLabel = new JLabel("Weapon Stats");
        weaponStatsLabel.setFont(MainFrame.OLD_ENGLISH.deriveFont(MEDIUM_FONT));
        weaponStatsLabel.setBounds(505, 431, 160, 32);

        // attack mod label
        attackModLabel = new JLabel("Attack Modifier");
        attackModLabel.setFont(MainFrame.CALIBRI.deriveFont(SMALL_FONT));
        attackModLabel.setBounds(505, 496, 119, 23);

        // attack mod text
        attackModText = new JTextField();
        attackModText.setEnabled(false);
        attackModText.setDisabledTextColor(Color.BLACK);
        attackModText.setBounds(633, 490, 39, 26);

        // attack mod label
        weightLabel = new JLabel("Weight");
        weightLabel.setFont(MainFrame.CALIBRI.deriveFont(SMALL_FONT));
        weightLabel.setBounds(505, 527, 55, 23);

        // weight text
        weightText = new JTextField();
        weightText.setEnabled(false);
        weightText.setDisabledTextColor(Color.BLACK);
        weightText.setBounds(633, 521, 39, 26);


        this.add(titleLabel);
        this.add(nameLabel);
        this.add(nameText);
        this.add(typeLabel);
        this.add(typeImageLabel);
        this.add(typeDescription);
        this.add(statsLabel);
        this.add(hitPointsLabel);
        this.add(hitPointsText);
        this.add(defenseLabel);
        this.add(defenseText);
        this.add(agilityLabel);
        this.add(agilityText);
        this.add(baseAttackLabel);
        this.add(baseAttackText);
        this.add(weaponLabel);
        this.add(weaponImageLabel);
        this.add(weaponDescription);
        this.add(weaponStatsLabel);
        this.add(attackModLabel);
        this.add(attackModText);
        this.add(weightLabel);
        this.add(weightText);
        addTypeButtonGroup();
        addRerollButton();
        addWeaponButtons();
        addStartBattleButton();
    }


    // Method to create character type button group
    private void addTypeButtonGroup() {

        ButtonGroup typeGroup = new ButtonGroup();

        // Cleric button
        JRadioButton clericButton = new JRadioButton("Cleric");
        clericButton.setBounds(53, 190, 100, 50);
        clericButton.setBackground(Color.decode(MainFrame.BACKGROUND_COLOR));
        clericButton.setFont(MainFrame.CALIBRI.deriveFont(SMALL_FONT));
        typeGroup.add(clericButton);

        // Fighter button
        JRadioButton fighterButton = new JRadioButton("Fighter");
        fighterButton.setBounds(53, 237, 100, 50);
        fighterButton.setBackground(Color.decode(MainFrame.BACKGROUND_COLOR));
        fighterButton.setFont(MainFrame.CALIBRI.deriveFont(SMALL_FONT));
        typeGroup.add(fighterButton);

        // Rogue Button
        JRadioButton rogueButton = new JRadioButton("Rogue");
        rogueButton.setBounds(53, 284, 100, 50);
        rogueButton.setBackground(Color.decode(MainFrame.BACKGROUND_COLOR));
        rogueButton.setFont(MainFrame.CALIBRI.deriveFont(SMALL_FONT));
        typeGroup.add(rogueButton);


        // Adding action listeners
        clericButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                typeSelection = CharacterType.CLERIC;
                typeImageLabel.setIcon(Cleric.getImage());
                typeImageLabel.setText("");
                typeDescription.setText(Cleric.DESCRIPTION);
            }
        });

        fighterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                typeSelection = CharacterType.FIGHTER;
                typeImageLabel.setIcon(Fighter.getImage());
                typeImageLabel.setText("");
                typeDescription.setText(Fighter.DESCRIPTION);
            }
        });

        rogueButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                typeSelection = CharacterType.ROGUE;
                typeImageLabel.setIcon(Rogue.getImage());
                typeImageLabel.setText("");
                typeDescription.setText(Rogue.DESCRIPTION);
            }
        });

        this.add(clericButton);
        this.add(fighterButton);
        this.add(rogueButton);
    }

    // Method to create weapon buttons
    private void addWeaponButtons() {

        ButtonGroup weaponGroup = new ButtonGroup();

        // Cleric button
        JRadioButton daggerButton = new JRadioButton("Dagger");
        daggerButton.setBounds(53, 470, 100, 50);
        daggerButton.setBackground(Color.decode(MainFrame.BACKGROUND_COLOR));
        daggerButton.setFont(MainFrame.CALIBRI.deriveFont(SMALL_FONT));
        weaponGroup.add(daggerButton);

        // Fighter button
        JRadioButton hammerButton = new JRadioButton("Hammer");
        hammerButton.setBounds(53, 517, 100, 50);
        hammerButton.setBackground(Color.decode(MainFrame.BACKGROUND_COLOR));
        hammerButton.setFont(MainFrame.CALIBRI.deriveFont(SMALL_FONT));
        weaponGroup.add(hammerButton);

        // Rogue Button
        JRadioButton swordButton = new JRadioButton("Sword");
        swordButton.setBounds(53, 564, 100, 50);
        swordButton.setBackground(Color.decode(MainFrame.BACKGROUND_COLOR));
        swordButton.setFont(MainFrame.CALIBRI.deriveFont(SMALL_FONT));
        weaponGroup.add(swordButton);


        // Adding action listeners
        daggerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                weaponSelection = WeaponType.DAGGER;

                weaponImageLabel.setIcon(Dagger.getImage());
                weaponImageLabel.setText("");

                weaponDescription.setText(Dagger.DESCRIPTION);

                attackModText.setText(String.valueOf(Dagger.ATTACK_MOD));
                weightText.setText(String.valueOf(Dagger.WEIGHT));

                playerWeapon = new Dagger();

            }
        });

        hammerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                weaponSelection = WeaponType.HAMMER;

                weaponImageLabel.setIcon(Hammer.getImage());
                weaponImageLabel.setText("");

                weaponDescription.setText(Hammer.DESCRIPTION);

                attackModText.setText(String.valueOf(Hammer.ATTACK_MOD));
                weightText.setText(String.valueOf(Hammer.WEIGHT));

                playerWeapon = new Hammer();

            }
        });

        swordButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                weaponSelection = WeaponType.SWORD;

                weaponImageLabel.setIcon(Sword.getImage());
                weaponImageLabel.setText("");

                weaponDescription.setText(Sword.DESCRIPTION);

                attackModText.setText(String.valueOf(Sword.ATTACK_MOD));
                weightText.setText(String.valueOf(Sword.WEIGHT));

                playerWeapon = new Sword();

            }
        });

        this.add(daggerButton);
        this.add(hammerButton);
        this.add(swordButton);
    }


    // Method for adding reroll button with action listener
    private void addRerollButton() {

        JButton rerollButton = new JButton("Re-roll");
        rerollButton.setFocusable(false);
        rerollButton.setFont(MainFrame.OLD_ENGLISH.deriveFont(SMALL_FONT));
        rerollButton.setBounds(531, 331, 115, 25);

        this.add(rerollButton);

        // Rolls stats and populates text fields
        rerollButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                stats = new int[Character.NUM_STATS];

                // Making sure user has selected a character type
                if (typeSelection == CharacterType.DEFAULT) {
                    // Error message if they have not
                    JOptionPane.showMessageDialog(MainFrame.characterScreen, "You must select a " +
                            "character type before rolling stats.", "Must Select Character Type",
                            JOptionPane.ERROR_MESSAGE);
                } else {

                    // Generating proper stats depending on which class they selected
                    switch (typeSelection) {

                        case CLERIC -> {
                            stats = Cleric.rollStats();
                            statsType = CharacterType.CLERIC;
                        }

                        case FIGHTER -> {
                            stats = Fighter.rollStats();
                            statsType = CharacterType.FIGHTER;
                        }

                        case ROGUE -> {
                            stats = Rogue.rollStats();
                            statsType = CharacterType.ROGUE;
                        }

                    }

                    // Populating text fields with stats
                    hitPointsText.setText(String.valueOf(stats[StatIndex.HIT_POINTS.ordinal()]));
                    defenseText.setText(String.valueOf(stats[StatIndex.DEFENSE.ordinal()]));
                    agilityText.setText(String.valueOf(stats[StatIndex.AGILITY.ordinal()]));
                    baseAttackText.setText(String.valueOf(stats[StatIndex.BASE_ATTACK.ordinal()]));
                }
            }
        });


    }


    // Method to add the start battle button
    private void addStartBattleButton() {

        JButton startBattleButton = new JButton("Start Battle");
        startBattleButton.setFont(MainFrame.OLD_ENGLISH.deriveFont(SMALL_FONT));
        startBattleButton.setFocusable(false);
        startBattleButton.setBounds(519, 635, 139, 25);

        this.add(startBattleButton);

        startBattleButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (validateSelections()) {

                    // Creating player character with info from GUI
                    switch (typeSelection) {

                        case CLERIC -> MainFrame.playerCharacter = new Cleric(nameText.getText(),
                                stats, playerWeapon);

                        case FIGHTER -> MainFrame.playerCharacter = new Fighter(nameText.getText(),
                                stats, playerWeapon);

                        case ROGUE -> MainFrame.playerCharacter = new Rogue(nameText.getText(),
                                stats, playerWeapon);

                    }

                    // Generating the monster
                    MainFrame.generateMonster();

                    // Changing panel on main frame
                    MainFrame.characterScreen.setVisible(false);
                    MainFrame.battleScreen.setVisible(true);
                    MainFrame.battleScreen.populateBattleScreen(typeSelection);
                }

            }
        });

    }


    // Method to validate that all selections are made and stats are for currently selected type
    private boolean validateSelections() {

        // Checking if name was entered
        if (nameText.getText().isBlank()) {

            JOptionPane.showMessageDialog(MainFrame.characterScreen, "You must enter a " +
                    "name for your character", "Must Enter name", JOptionPane.ERROR_MESSAGE);

            return false;

        // Checking if character type was selected
        } else if (typeSelection == CharacterType.DEFAULT) {

            JOptionPane.showMessageDialog(MainFrame.characterScreen, "You must choose a " +
                            "character type", "Must Choose Character Type",
                    JOptionPane.ERROR_MESSAGE);

            return false;

        // Checking if stats have been rolled
        } else if (statsType == CharacterType.DEFAULT) {

            JOptionPane.showMessageDialog(MainFrame.characterScreen, "You must roll your stats.",
                    "Must Roll Stats", JOptionPane.ERROR_MESSAGE);

            return false;

        // Checking if stats were rolled for the currently selected class
        } else if (typeSelection != statsType) {

            JOptionPane.showMessageDialog(MainFrame.characterScreen, "You must re-roll stats for " +
                            "the" +
                    " currently selected character type.", "Must Re-roll Stats",
                    JOptionPane.ERROR_MESSAGE);

            return false;

        // Checking if weapon was selected
        } else if (weaponSelection == null) {

            JOptionPane.showMessageDialog(MainFrame.characterScreen, "You must select a weapon.",
                    "Must Select Weapon", JOptionPane.ERROR_MESSAGE);

            return false;

        // Only reaches this point if all fields valid / selected
        } else {

            return true;

        }

    }


}
