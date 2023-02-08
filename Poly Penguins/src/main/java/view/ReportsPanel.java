package view;

import javax.swing.*;
import java.awt.*;

public class ReportsPanel extends JPanel {

    private GridBagConstraints gbc;

    // Swing components
    private JLabel      reportsLabel;
    private JScrollPane scrollPane;
    private JTextArea   reportArea;
    private JButton     newEntriesButton;
    private JButton     gpsLogsButton;
    private JButton     backButton;

    // Constructor which initializes and positions UI elements
    public ReportsPanel() {

        // Setting up panel
        this.setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();

        // Reports label
        reportsLabel = new JLabel("Reports");
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(10, 10, 5, 5);
        gbc.anchor = GridBagConstraints.LINE_START;
        add(reportsLabel, gbc);

        // Reports Area
        reportArea = new JTextArea();
        reportArea.setEditable(false);
        reportArea.setDisabledTextColor(Color.BLACK);
        reportArea.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        scrollPane = new JScrollPane(reportArea);
        gbc.insets = new Insets(5, 10, 5, 10);
        gbc.weightx = 1;
        gbc.weighty = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 4;
        gbc.fill = GridBagConstraints.BOTH;
        add(scrollPane, gbc);

        // new Entries Button
        newEntriesButton = new JButton("Show New Entries");
        gbc.insets = new Insets(8, 50, 10, 5);
        gbc.weightx = 0;
        gbc.weighty = 0;
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridwidth = 1;
        add(newEntriesButton, gbc);

        // gps logs button
        gpsLogsButton = new JButton("Show GPS Logs");
        gbc.insets = new Insets(8, 5, 10, 5);
        gbc.ipadx = 20;
        gbc.gridx = 2;
        add(gpsLogsButton, gbc);

        // back button
        backButton = new JButton("Back");
        gbc.insets = new Insets(8, 5, 10, 100);
        gbc.gridx = 3;
        add(backButton, gbc);

    }



    //==============================================================================================
    //====================================GETTERS AND SETTERS=======================================
    //==============================================================================================

    public GridBagConstraints getGbc() {
        return gbc;
    }

    public void setGbc(GridBagConstraints gbc) {
        this.gbc = gbc;
    }

    public JLabel getReportsLabel() {
        return reportsLabel;
    }

    public void setReportsLabel(JLabel reportsLabel) {
        this.reportsLabel = reportsLabel;
    }

    public JTextArea getReportArea() {
        return reportArea;
    }

    public void setReportArea(JTextArea reportArea) {
        this.reportArea = reportArea;
    }

    public JButton getNewEntriesButton() {
        return newEntriesButton;
    }

    public void setNewEntriesButton(JButton newEntriesButton) {
        this.newEntriesButton = newEntriesButton;
    }

    public JButton getGpsLogsButton() {
        return gpsLogsButton;
    }

    public void setGpsLogsButton(JButton gpsLogsButton) {
        this.gpsLogsButton = gpsLogsButton;
    }

    public JButton getBackButton() {
        return backButton;
    }

    public void setBackButton(JButton backButton) {
        this.backButton = backButton;
    }
}
