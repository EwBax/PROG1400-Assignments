package character;

import javax.swing.ImageIcon;

public class Monster extends Character {

    // Monster properties
    private MonsterType monsterType;
    private ImageIcon   image;


    //Constructor
    public Monster(String name, MonsterType monsterType) {
        // Monster does not have any specific stats, and does not need info from the GUI, so we
        // just call the static Character method to generate stats
        super(name, Character.rollStats());
        this.monsterType = monsterType;
        this.setImage();
    }


    // Method to set proper image based on monster type
    private void setImage() {

        // Getting proper image
        switch (this.monsterType) {

            // Beholder is also the default image
            case BEHOLDER:
            default:

                try {
                    this.image =
                            new ImageIcon(this.getClass().getResource(ImagePath.BEHOLDER.toString()));
                } catch (NullPointerException e) {
                    System.out.println("Error loading Beholder image\n");
                }

                break;

            case DRAGON:

                try {
                    this.image = new ImageIcon(this.getClass().getResource(ImagePath.DRAGON.toString()));
                } catch (NullPointerException e) {
                    System.out.println("Error loading dragon image");
                }

                break;

            case VAMPIRE:

                try {
                    this.image =
                            new ImageIcon(this.getClass().getResource(ImagePath.VAMPIRE.toString()));
                } catch (NullPointerException e) {
                    System.out.println("Error loading vampire image");
                }

                break;

        }

    }


    // Monster specific toString method
    @Override
    public String toString() {

        return String.format("""
                        Monster: %s
                        --------------------
                        HP: %d      	   Defense: %d     Agility: %d     Base Attack: %d
                        """,
                super.getName(),
                super.getHitPoints(),
                super.getDefense(),
                super.getAgility(),
                super.getBaseAttack()
        );

    }


    // Getter for image
    public ImageIcon getImage() {
        return this.image;
    }

    // getter for MonsterType
    public MonsterType getMonsterType() {
        return monsterType;
    }
}
