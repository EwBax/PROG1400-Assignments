import javax.swing.*;

public class MainFrame extends JFrame {

    public MainFrame() {

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(400, 400);
        this.setLocationRelativeTo(null);

        DrawingPanel drawingPanel = new DrawingPanel();
        this.add(drawingPanel);

    }
}
