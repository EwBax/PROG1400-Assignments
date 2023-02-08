package gui;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;


public class SplashScreen extends JPanel {

    // Class constants
    private static final float LARGE_FONT = 61f;
    private static final float MEDIUM_FONT = 20f;

    // class fields
    private JLabel      titleLabel;
    private JLabel      imageLabel;
    private ImageIcon   splashImage;
    private JButton     advanceButton;


    // Constructor
    public SplashScreen() {

        // Using null layout for absolute positioning
        this.setLayout(null);

        // setting background color
        this.setBackground(Color.decode(MainFrame.BACKGROUND_COLOR));

        // title label initialization with position, size, and font
        titleLabel = new JLabel("Dungeons and Dragons");
        titleLabel.setBounds(79, 37, 602, 75);
        titleLabel.setFont(MainFrame.OLD_ENGLISH.deriveFont(LARGE_FONT));

        // Initializing and sizing/positioning label
        imageLabel = new JLabel();
        imageLabel.setBounds(75,150,600,450);

        // Getting splash screen image
        try {
            splashImage =
                    new ImageIcon(ImageIO.read(this.getClass().getResourceAsStream("/images" +
                            "/SplashScreen.png")));
            imageLabel.setIcon(splashImage);
        } catch (IOException e) {
            imageLabel.setText("Error loading image.");
        }

        // adding black line border to label
        imageLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        // making visible
        imageLabel.setVisible(true);

        // adding everything
        add(titleLabel);
        add(imageLabel);
        addAdvanceButton();

    }


    private void addAdvanceButton() {

        // Initializing button
        advanceButton = new JButton("Build a Character");
        advanceButton.setBounds(280, 620, 190, 34);
        advanceButton.setFont(MainFrame.OLD_ENGLISH.deriveFont(MEDIUM_FONT));

        // removing annoying keyboard focus indicator that makes a border around the text in the
        // button
        advanceButton.setFocusable(false);

        // Action listener to advance to next screen
        advanceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MainFrame.splashScreen.setVisible(false);
                MainFrame.characterScreen.setVisible(true);
            }
        });


        add(advanceButton);

    }

}
